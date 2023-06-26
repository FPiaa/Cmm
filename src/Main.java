import cmm.CmmLexer;
import cmm.CmmParser;
import cmmPasses.CmmSymbolSolverListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import types.CharVar;
import types.IntPVar;
import types.Variable;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, tree);

    }

    public static void main(String[] args) {

//        if (args.length > 0) {
//            Set<String> files = Stream.of(Objects.requireNonNull(new File("samples").listFiles()))
//                    .filter(file -> !file.isDirectory())
//                    .map(File::getName)
//                    .map((name -> "samples/" + name))
//                    .collect(Collectors.toSet());
//            for (String file : files) {
//                try {
//                    runParser(Files.newInputStream(Path.of(file)));
//                } catch (IOException e) {
//                    System.err.println("Error reading file " + file);
//                }
//            }
//        } else {
//            try {
//                runParser(System.in);
//            } catch (IOException e) {
//                System.err.println("An error occurred while reading Stdin");
//            }
//        }


    }
}