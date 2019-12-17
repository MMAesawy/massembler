package grammar.Absyn; // Java Package generated by the BNF Converter.

public class Rg extends Reg {
  public final Character char_;
  public final Integer integer_;
  public Rg(Character p1, Integer p2) { char_ = p1; integer_ = p2; }

  public <R,A> R accept(grammar.Absyn.Reg.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.Rg) {
      grammar.Absyn.Rg x = (grammar.Absyn.Rg)o;
      return this.char_.equals(x.char_) && this.integer_.equals(x.integer_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.char_.hashCode())+this.integer_.hashCode();
  }


}