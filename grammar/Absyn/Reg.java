package grammar.Absyn; // Java Package generated by the BNF Converter.

public abstract class Reg implements java.io.Serializable {
  public abstract <R,A> R accept(Reg.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(grammar.Absyn.Rg p, A arg);

  }

}
