package cmmPasses;

import cmm.CmmBaseListener;
import cmm.CmmParser;
import symbol_table.SymbolTable;

public class CmmSymbolSolverListener extends CmmBaseListener {
    public SymbolTable symbols;
    @Override
    public void enterProg(CmmParser.ProgContext ctx) {
        symbols = new SymbolTable(null); // global scope has no parent
    }

    @Override
    public void enterGlobal_variables(CmmParser.Global_variablesContext ctx) {
        String type = ctx.var_decl().type().getText();

    }

    @Override
    public void enterFunction(CmmParser.FunctionContext ctx) {

    }
}

