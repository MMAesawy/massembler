package grammar.Absyn; // Java Package generated by the BNF Converter.

public abstract class IInstr implements java.io.Serializable {
  public abstract <R,A> R accept(IInstr.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(grammar.Absyn.EAddi p, A arg);
    public R visit(grammar.Absyn.EOri p, A arg);
    public R visit(grammar.Absyn.EAndi p, A arg);
    public R visit(grammar.Absyn.ESlti p, A arg);
    public R visit(grammar.Absyn.EBne p, A arg);
    public R visit(grammar.Absyn.EBeq p, A arg);
    public R visit(grammar.Absyn.ELui p, A arg);
    public R visit(grammar.Absyn.ESw p, A arg);
    public R visit(grammar.Absyn.ELw p, A arg);

  }

}
