package grammar.Absyn; // Java Package generated by the BNF Converter.

public class EJ extends JInstr {
  public final PCPntr pcpntr_;
  public EJ(PCPntr p1) { pcpntr_ = p1; }

  public <R,A> R accept(grammar.Absyn.JInstr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.EJ) {
      grammar.Absyn.EJ x = (grammar.Absyn.EJ)o;
      return this.pcpntr_.equals(x.pcpntr_);
    }
    return false;
  }

  public int hashCode() {
    return this.pcpntr_.hashCode();
  }


}
