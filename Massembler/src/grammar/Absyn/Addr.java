package grammar.Absyn; // Java Package generated by the BNF Converter.

public abstract class Addr implements java.io.Serializable {
  public abstract <R,A> R accept(Addr.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(grammar.Absyn.AddRel p, A arg);

  }

}
