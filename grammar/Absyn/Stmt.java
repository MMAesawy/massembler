package grammar.Absyn; // Java Package generated by the BNF Converter.

public abstract class Stmt implements java.io.Serializable {
  public abstract <R,A> R accept(Stmt.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(grammar.Absyn.EStmtLbl p, A arg);
    public R visit(grammar.Absyn.EStmtInstr p, A arg);

  }

}
