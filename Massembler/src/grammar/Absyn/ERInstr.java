package grammar.Absyn; // Java Package generated by the BNF Converter.

public class ERInstr extends Instr {
  public final RInstr rinstr_;
  public ERInstr(RInstr p1) { rinstr_ = p1; }

  public <R,A> R accept(grammar.Absyn.Instr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.ERInstr) {
      grammar.Absyn.ERInstr x = (grammar.Absyn.ERInstr)o;
      return this.rinstr_.equals(x.rinstr_);
    }
    return false;
  }

  public int hashCode() {
    return this.rinstr_.hashCode();
  }


}