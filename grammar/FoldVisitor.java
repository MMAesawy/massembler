package grammar;

import grammar.Absyn.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/** BNFC-Generated Fold Visitor */
public abstract class FoldVisitor<R,A> implements AllVisitor<R,A> {
    public abstract R leaf(A arg);
    public abstract R combine(R x, R y, A arg);

/* Stmt */
    public R visit(grammar.Absyn.StmtLblLine p, A arg) {
      R r = leaf(arg);
      r = combine(p.lblline_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.StmtType p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }

/* Label */
    public R visit(grammar.Absyn.Lbl1 p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* Imm */
    public R visit(grammar.Absyn.Immi p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.Imml p, A arg) {
      R r = leaf(arg);
      r = combine(p.label_.accept(this, arg), r, arg);
      return r;
    }

/* Reg */
    public R visit(grammar.Absyn.Rg p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* ROper */
    public R visit(grammar.Absyn.ROper_add p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.ROper_sub p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.ROper_and p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.ROper_or p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.ROper_sll p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.ROper_slt p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.ROper_jr p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.ROper_syscall p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* IOper */
    public R visit(grammar.Absyn.IOper_addi p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.IOper_ori p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.IOper_andi p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.IOper_slti p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.IOper_lui p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.IOper_beq p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.IOper_bne p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* JOper */
    public R visit(grammar.Absyn.JOper_j p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* Type */
    public R visit(grammar.Absyn.ER0 p, A arg) {
      R r = leaf(arg);
      r = combine(p.roper_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.ER1 p, A arg) {
      R r = leaf(arg);
      r = combine(p.roper_.accept(this, arg), r, arg);
      r = combine(p.reg_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.ER2 p, A arg) {
      R r = leaf(arg);
      r = combine(p.roper_.accept(this, arg), r, arg);
      r = combine(p.reg_1.accept(this, arg), r, arg);
      r = combine(p.reg_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.ER3 p, A arg) {
      R r = leaf(arg);
      r = combine(p.roper_.accept(this, arg), r, arg);
      r = combine(p.reg_1.accept(this, arg), r, arg);
      r = combine(p.reg_2.accept(this, arg), r, arg);
      r = combine(p.reg_3.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.EI p, A arg) {
      R r = leaf(arg);
      r = combine(p.ioper_.accept(this, arg), r, arg);
      r = combine(p.reg_1.accept(this, arg), r, arg);
      r = combine(p.reg_2.accept(this, arg), r, arg);
      r = combine(p.imm_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.EJ p, A arg) {
      R r = leaf(arg);
      r = combine(p.joper_.accept(this, arg), r, arg);
      r = combine(p.imm_.accept(this, arg), r, arg);
      return r;
    }

/* LblLine */
    public R visit(grammar.Absyn.LbledLine p, A arg) {
      R r = leaf(arg);
      r = combine(p.label_.accept(this, arg), r, arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.LbledLine2 p, A arg) {
      R r = leaf(arg);
      r = combine(p.label_.accept(this, arg), r, arg);
      return r;
    }


}
