package grammar.Absyn; // Java Package generated by the BNF Converter.

public class ER0 extends Type {
  public final ROper roper_;
  public ER0(ROper p1) { roper_ = p1; }

  public <R,A> R accept(grammar.Absyn.Type.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.ER0) {
      grammar.Absyn.ER0 x = (grammar.Absyn.ER0)o;
      return this.roper_.equals(x.roper_);
    }
    return false;
  }

  public int hashCode() {
    return this.roper_.hashCode();
  }


}
