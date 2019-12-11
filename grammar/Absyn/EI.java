package grammar.Absyn; // Java Package generated by the BNF Converter.

public class EI extends Type {
  public final IOper ioper_;
  public final Reg reg_1, reg_2;
  public final Imm imm_;
  public EI(IOper p1, Reg p2, Reg p3, Imm p4) { ioper_ = p1; reg_1 = p2; reg_2 = p3; imm_ = p4; }

  public <R,A> R accept(grammar.Absyn.Type.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.EI) {
      grammar.Absyn.EI x = (grammar.Absyn.EI)o;
      return this.ioper_.equals(x.ioper_) && this.reg_1.equals(x.reg_1) && this.reg_2.equals(x.reg_2) && this.imm_.equals(x.imm_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(37*(this.ioper_.hashCode())+this.reg_1.hashCode())+this.reg_2.hashCode())+this.imm_.hashCode();
  }


}
