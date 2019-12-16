package grammar.Absyn; // Java Package generated by the BNF Converter.

public class PCPntrImm extends PCPntr {
  public final Imm imm_;
  public PCPntrImm(Imm p1) { imm_ = p1; }

  public <R,A> R accept(grammar.Absyn.PCPntr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.PCPntrImm) {
      grammar.Absyn.PCPntrImm x = (grammar.Absyn.PCPntrImm)o;
      return this.imm_.equals(x.imm_);
    }
    return false;
  }

  public int hashCode() {
    return this.imm_.hashCode();
  }


}
