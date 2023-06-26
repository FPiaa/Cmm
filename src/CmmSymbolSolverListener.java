import cmm.CmmBaseListener;
import cmm.CmmParser;

public class CmmSymbolSolverListener extends CmmBaseListener {
    @Override
    public void enterVar_decl(CmmParser.Var_declContext ctx) {
        System.out.printf("%s ", ctx.type().getText());
        for (var v :
                ctx.var()) {
            if (v.Intcon() != null) {
                int i = Integer.parseInt(v.Intcon().getText());
                System.out.println("Array with size" + i);
            }
            System.out.printf("%s, ", v.getText());
        }
    }
}

