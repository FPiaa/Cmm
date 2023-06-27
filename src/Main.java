import cmm.CmmLexer;
import cmm.CmmParser;
import cmmPasses.CmmEval;
import cmmPasses.CmmSymbolSolverListener;
import cmmPasses.CmmTypeChecking;
import exceptions.UndefinedSymbolException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.Parser;
import types.Function;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void runParser(InputStream inputStream) throws IOException {
        CharStream input = CharStreams.fromStream(inputStream);
        CmmLexer lexer = new CmmLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CmmParser parser = new CmmParser(tokens);
        ParseTree tree = parser.prog();
        CmmSymbolSolverListener listener = new CmmSymbolSolverListener();
        if(parser.getNumberOfSyntaxErrors() > 0) {
            System.out.flush();
            System.out.println("Compilation ended due to previous errors");
            return;
        }
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
        if(listener.failCompilation) {
            System.out.println("Compilation ended due to previous errors");
            return;
        }
        CmmTypeChecking typeChecker = new CmmTypeChecking(listener.symbols);
        tree.accept(typeChecker);

        if(typeChecker.failCompilation) {
            System.out.println("Compilation ended due to previous errors");
            return;
        }

        CmmEval eval = new CmmEval(listener.symbols);
        Function main = null;
        try {
            main = listener.symbols.resolveFunction("main");
        } catch (UndefinedSymbolException e) {
            System.out.println(e.getMessage());
            return;
        }
        eval.symbols.push(main.variables);
        eval.visit(main.start);
        System.out.printf("%n%n");

    }

    public static void main(String[] args) {

        if (args.length > 0) {
            System.out.println(args[0]);
            Set<String> files = Stream.of(Objects.requireNonNull(new File(args[0]).listFiles()))
                    .filter(file -> !file.isDirectory())
                    .map(File::getName)
                    .map((name -> "%s/%s".formatted(args[0], name)))
                    .collect(Collectors.toSet());
            for (String file : files) {
                try {
                    System.out.printf("Compiling file %s.%n", file);
                    runParser(Files.newInputStream(Path.of(file)));
                    System.out.flush();
                } catch (IOException e) {
                    System.err.println("Error reading file " + file);
                }
            }
        } else {
            try {
                runParser(System.in);
            } catch (IOException e) {
                System.err.println("An error occurred while reading Stdin");
            }
        }


    }
}