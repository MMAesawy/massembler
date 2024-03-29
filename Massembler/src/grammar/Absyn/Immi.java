package grammar.Absyn; // Java Package generated by the BNF Converter.

public class Immi extends Imm {
  public final Integer integer_;
  public Immi(Integer p1) { integer_ = p1; }

  public <R,A> R accept(grammar.Absyn.Imm.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.Immi) {
      grammar.Absyn.Immi x = (grammar.Absyn.Immi)o;
      return this.integer_.equals(x.integer_);
    }
    return false;
  }

  public int hashCode() {
    return this.integer_.hashCode();
  }


}
