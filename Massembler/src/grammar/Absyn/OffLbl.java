package grammar.Absyn; // Java Package generated by the BNF Converter.

public class OffLbl extends Offset {
  public final Label label_;
  public OffLbl(Label p1) { label_ = p1; }

  public <R,A> R accept(grammar.Absyn.Offset.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.OffLbl) {
      grammar.Absyn.OffLbl x = (grammar.Absyn.OffLbl)o;
      return this.label_.equals(x.label_);
    }
    return false;
  }

  public int hashCode() {
    return this.label_.hashCode();
  }


}