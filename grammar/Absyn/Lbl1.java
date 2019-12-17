package grammar.Absyn; // Java Package generated by the BNF Converter.

public class Lbl1 extends Label {
  public final String string_;
  public Lbl1(String p1) { string_ = p1; }

  public <R,A> R accept(grammar.Absyn.Label.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.Lbl1) {
      grammar.Absyn.Lbl1 x = (grammar.Absyn.Lbl1)o;
      return this.string_.equals(x.string_);
    }
    return false;
  }

  public int hashCode() {
    return this.string_.hashCode();
  }


}