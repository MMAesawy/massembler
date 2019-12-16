package grammar.Absyn; // Java Package generated by the BNF Converter.

public abstract class Offset implements java.io.Serializable {
  public abstract <R,A> R accept(Offset.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(grammar.Absyn.OffRel p, A arg);
    public R visit(grammar.Absyn.OffLbl p, A arg);

  }

}
