package grammar;
import grammar.Absyn.*;
/** BNFC-Generated Abstract Visitor */
public class AbstractVisitor<R,A> implements AllVisitor<R,A> {
/* Program */
    public R visit(grammar.Absyn.PDefs p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(grammar.Absyn.Program p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Stmt */
    public R visit(grammar.Absyn.EStmtLbl p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.EStmtInstr p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(grammar.Absyn.Stmt p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Label */
    public R visit(grammar.Absyn.ELbl p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(grammar.Absyn.Label p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Offset */
    public R visit(grammar.Absyn.OffRel p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(grammar.Absyn.Offset p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* LblInstr */
    public R visit(grammar.Absyn.LbledStmt p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.LbledLine p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(grammar.Absyn.LblInstr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Imm */
    public R visit(grammar.Absyn.Immi p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(grammar.Absyn.Imm p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Addr */
    public R visit(grammar.Absyn.AddRel p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(grammar.Absyn.Addr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* PCPntr */
    public R visit(grammar.Absyn.PCPntrLbl p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.PCPntrImm p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(grammar.Absyn.PCPntr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* RInstr */
    public R visit(grammar.Absyn.EAdd p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.ESub p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.EAnd p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.EOr p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.ESll p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.ESrl p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.ESlt p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.EJr p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(grammar.Absyn.RInstr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* IInstr */
    public R visit(grammar.Absyn.EAddi p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.EOri p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.EAndi p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.ESlti p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.EBne p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.EBeq p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.ELui p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.ESw p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.ELw p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(grammar.Absyn.IInstr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* JInstr */
    public R visit(grammar.Absyn.EJ p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(grammar.Absyn.JInstr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Instr */
    public R visit(grammar.Absyn.ESyscall p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.ERInstr p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.EIInstr p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.EJInstr p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(grammar.Absyn.Instr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }

}
