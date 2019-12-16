package grammar;

import grammar.Absyn.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/** BNFC-Generated Fold Visitor */
public abstract class FoldVisitor<R,A> implements AllVisitor<R,A> {
    public abstract R leaf(A arg);
    public abstract R combine(R x, R y, A arg);

/* Program */
    public R visit(grammar.Absyn.PDefs p, A arg) {
      R r = leaf(arg);
      for (Stmt x : p.liststmt_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }

/* Stmt */
    public R visit(grammar.Absyn.EStmtLbl p, A arg) {
      R r = leaf(arg);
      r = combine(p.lblinstr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.EStmtInstr p, A arg) {
      R r = leaf(arg);
      r = combine(p.instr_.accept(this, arg), r, arg);
      return r;
    }

/* Label */
    public R visit(grammar.Absyn.ELbl p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* Offset */
    public R visit(grammar.Absyn.OffRel p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.OffLbl p, A arg) {
      R r = leaf(arg);
      r = combine(p.label_.accept(this, arg), r, arg);
      return r;
    }

/* LblInstr */
    public R visit(grammar.Absyn.LbledStmt p, A arg) {
      R r = leaf(arg);
      r = combine(p.label_.accept(this, arg), r, arg);
      r = combine(p.instr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.LbledLine p, A arg) {
      R r = leaf(arg);
      r = combine(p.label_.accept(this, arg), r, arg);
      return r;
    }

/* Imm */
    public R visit(grammar.Absyn.Immi p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* Addr */
    public R visit(grammar.Absyn.AddAbs p, A arg) {
      R r = leaf(arg);
      r = combine(p.imm_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.AddRel p, A arg) {
      R r = leaf(arg);
      r = combine(p.offset_.accept(this, arg), r, arg);
      return r;
    }

/* RInstr */
    public R visit(grammar.Absyn.EAdd p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.ESub p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.EAnd p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.EOr p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.ESll p, A arg) {
      R r = leaf(arg);
      r = combine(p.imm_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.ESrl p, A arg) {
      R r = leaf(arg);
      r = combine(p.imm_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.ESlt p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.EJr p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* IInstr */
    public R visit(grammar.Absyn.EAddi p, A arg) {
      R r = leaf(arg);
      r = combine(p.imm_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.EOri p, A arg) {
      R r = leaf(arg);
      r = combine(p.imm_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.EAndi p, A arg) {
      R r = leaf(arg);
      r = combine(p.imm_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.ESlti p, A arg) {
      R r = leaf(arg);
      r = combine(p.imm_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.EBne p, A arg) {
      R r = leaf(arg);
      r = combine(p.addr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.EBeq p, A arg) {
      R r = leaf(arg);
      r = combine(p.addr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.ELui p, A arg) {
      R r = leaf(arg);
      r = combine(p.imm_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.ESw p, A arg) {
      R r = leaf(arg);
      r = combine(p.addr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.ELw p, A arg) {
      R r = leaf(arg);
      r = combine(p.addr_.accept(this, arg), r, arg);
      return r;
    }

/* JInstr */
    public R visit(grammar.Absyn.EJ p, A arg) {
      R r = leaf(arg);
      r = combine(p.addr_.accept(this, arg), r, arg);
      return r;
    }

/* Instr */
    public R visit(grammar.Absyn.ESyscall p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(grammar.Absyn.ERInstr p, A arg) {
      R r = leaf(arg);
      r = combine(p.rinstr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.EIInstr p, A arg) {
      R r = leaf(arg);
      r = combine(p.iinstr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(grammar.Absyn.EJInstr p, A arg) {
      R r = leaf(arg);
      r = combine(p.jinstr_.accept(this, arg), r, arg);
      return r;
    }


}
