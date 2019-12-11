package grammar;
import grammar.Absyn.*;
/** BNFC-Generated Abstract Visitor */
public class AbstractVisitor<R,A> implements AllVisitor<R,A> {
/* Stmt */
    public R visit(grammar.Absyn.StmtLblLine p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.StmtType p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(grammar.Absyn.Stmt p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Label */
    public R visit(grammar.Absyn.Lbl1 p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(grammar.Absyn.Label p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Imm */
    public R visit(grammar.Absyn.Immi p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.Imml p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(grammar.Absyn.Imm p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Reg */
    public R visit(grammar.Absyn.Rg p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(grammar.Absyn.Reg p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ROper */
    public R visit(grammar.Absyn.ROper_add p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.ROper_sub p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.ROper_and p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.ROper_or p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.ROper_sll p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.ROper_slt p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.ROper_jr p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.ROper_syscall p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(grammar.Absyn.ROper p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* IOper */
    public R visit(grammar.Absyn.IOper_addi p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.IOper_ori p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.IOper_andi p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.IOper_slti p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.IOper_lui p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.IOper_beq p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.IOper_bne p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(grammar.Absyn.IOper p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* JOper */
    public R visit(grammar.Absyn.JOper_j p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(grammar.Absyn.JOper p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Type */
    public R visit(grammar.Absyn.ER0 p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.ER1 p, A arg) { return visitDefault(p, arg); }

    public R visit(grammar.Absyn.ER2 p, A arg) { return visitDefault(p, arg); }

    public R visit(grammar.Absyn.ER3 p, A arg) { return visitDefault(p, arg); }

    public R visit(grammar.Absyn.EI p, A arg) { return visitDefault(p, arg); }

    public R visit(grammar.Absyn.EJ p, A arg) { return visitDefault(p, arg); }


    public R visitDefault(grammar.Absyn.Type p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* LblLine */
    public R visit(grammar.Absyn.LbledLine p, A arg) { return visitDefault(p, arg); }
    public R visit(grammar.Absyn.LbledLine2 p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(grammar.Absyn.LblLine p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }

}
