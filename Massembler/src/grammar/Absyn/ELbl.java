package grammar.Absyn; // Java Package generated by the BNF Converter.

public class ELbl extends Label {
  public final String linelabel_;
  public ELbl(String p1) { linelabel_ = p1; }

  public <R,A> R accept(grammar.Absyn.Label.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.ELbl) {
      grammar.Absyn.ELbl x = (grammar.Absyn.ELbl)o;
      return this.linelabel_.equals(x.linelabel_);
    }
    return false;
  }

  public int hashCode() {
    return this.linelabel_.hashCode();
  }


}
