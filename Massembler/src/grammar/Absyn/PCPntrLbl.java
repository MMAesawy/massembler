package grammar.Absyn; // Java Package generated by the BNF Converter.

public class PCPntrLbl extends PCPntr {
  public final String linelabel_;
  public PCPntrLbl(String p1) { linelabel_ = p1; }

  public <R,A> R accept(grammar.Absyn.PCPntr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.PCPntrLbl) {
      grammar.Absyn.PCPntrLbl x = (grammar.Absyn.PCPntrLbl)o;
      return this.linelabel_.equals(x.linelabel_);
    }
    return false;
  }

  public int hashCode() {
    return this.linelabel_.hashCode();
  }


}