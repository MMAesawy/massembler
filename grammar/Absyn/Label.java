package grammar.Absyn; // Java Package generated by the BNF Converter.

public abstract class Label implements java.io.Serializable {
  public abstract <R,A> R accept(Label.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(grammar.Absyn.ELbl p, A arg);

  }

}
