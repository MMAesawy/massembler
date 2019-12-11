package grammar.Absyn; // Java Package generated by the BNF Converter.

public class ER2 extends Type {
  public final ROper roper_;
  public final Reg reg_1, reg_2;
  public ER2(ROper p1, Reg p2, Reg p3) { roper_ = p1; reg_1 = p2; reg_2 = p3; }

  public <R,A> R accept(grammar.Absyn.Type.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.ER2) {
      grammar.Absyn.ER2 x = (grammar.Absyn.ER2)o;
      return this.roper_.equals(x.roper_) && this.reg_1.equals(x.reg_1) && this.reg_2.equals(x.reg_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.roper_.hashCode())+this.reg_1.hashCode())+this.reg_2.hashCode();
  }


}
