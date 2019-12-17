package grammar.Absyn; // Java Package generated by the BNF Converter.

public class ESw extends IInstr {
  public final String reg_;
  public final Addr addr_;
  public ESw(String p1, Addr p2) { reg_ = p1; addr_ = p2; }

  public <R,A> R accept(grammar.Absyn.IInstr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.ESw) {
      grammar.Absyn.ESw x = (grammar.Absyn.ESw)o;
      return this.reg_.equals(x.reg_) && this.addr_.equals(x.addr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.reg_.hashCode())+this.addr_.hashCode();
  }


}