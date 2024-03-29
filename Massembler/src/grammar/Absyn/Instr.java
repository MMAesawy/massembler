package grammar.Absyn; // Java Package generated by the BNF Converter.

public abstract class Instr implements java.io.Serializable {
  public abstract <R,A> R accept(Instr.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(grammar.Absyn.ESyscall p, A arg);
    public R visit(grammar.Absyn.ERInstr p, A arg);
    public R visit(grammar.Absyn.EIInstr p, A arg);
    public R visit(grammar.Absyn.EJInstr p, A arg);

  }

}
