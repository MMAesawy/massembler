package grammar.Absyn; // Java Package generated by the BNF Converter.

public class AddRel extends Addr {
  public final Offset offset_;
  public AddRel(Offset p1) { offset_ = p1; }

  public <R,A> R accept(grammar.Absyn.Addr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.AddRel) {
      grammar.Absyn.AddRel x = (grammar.Absyn.AddRel)o;
      return this.offset_.equals(x.offset_);
    }
    return false;
  }

  public int hashCode() {
    return this.offset_.hashCode();
  }


}