package grammar.Absyn; // Java Package generated by the BNF Converter.

public abstract class Imm implements java.io.Serializable {
  public abstract <R,A> R accept(Imm.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(grammar.Absyn.Immi p, A arg);
    public R visit(grammar.Absyn.Imml p, A arg);

  }

}