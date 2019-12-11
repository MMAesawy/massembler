package grammar;
import grammar.Absyn.*;
/** BNFC-Generated Composition Visitor
*/

public class ComposVisitor<A> implements
  grammar.Absyn.Stmt.Visitor<grammar.Absyn.Stmt,A>,
  grammar.Absyn.Label.Visitor<grammar.Absyn.Label,A>,
  grammar.Absyn.Imm.Visitor<grammar.Absyn.Imm,A>,
  grammar.Absyn.Reg.Visitor<grammar.Absyn.Reg,A>,
  grammar.Absyn.ROper.Visitor<grammar.Absyn.ROper,A>,
  grammar.Absyn.IOper.Visitor<grammar.Absyn.IOper,A>,
  grammar.Absyn.JOper.Visitor<grammar.Absyn.JOper,A>,
  grammar.Absyn.Type.Visitor<grammar.Absyn.Type,A>,
  grammar.Absyn.LblLine.Visitor<grammar.Absyn.LblLine,A>
{
/* Stmt */
    public Stmt visit(grammar.Absyn.StmtLblLine p, A arg)
    {
      LblLine lblline_ = p.lblline_.accept(this, arg);
      return new grammar.Absyn.StmtLblLine(lblline_);
    }    public Stmt visit(grammar.Absyn.StmtType p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      return new grammar.Absyn.StmtType(type_);
    }
/* Label */
    public Label visit(grammar.Absyn.Lbl1 p, A arg)
    {
      String string_ = p.string_;
      return new grammar.Absyn.Lbl1(string_);
    }
/* Imm */
    public Imm visit(grammar.Absyn.Immi p, A arg)
    {
      Integer integer_ = p.integer_;
      return new grammar.Absyn.Immi(integer_);
    }    public Imm visit(grammar.Absyn.Imml p, A arg)
    {
      Label label_ = p.label_.accept(this, arg);
      return new grammar.Absyn.Imml(label_);
    }
/* Reg */
    public Reg visit(grammar.Absyn.Rg p, A arg)
    {
      Character char_ = p.char_;
      Integer integer_ = p.integer_;
      return new grammar.Absyn.Rg(char_, integer_);
    }
/* ROper */
    public ROper visit(grammar.Absyn.ROper_add p, A arg)
    {
      return new grammar.Absyn.ROper_add();
    }    public ROper visit(grammar.Absyn.ROper_sub p, A arg)
    {
      return new grammar.Absyn.ROper_sub();
    }    public ROper visit(grammar.Absyn.ROper_and p, A arg)
    {
      return new grammar.Absyn.ROper_and();
    }    public ROper visit(grammar.Absyn.ROper_or p, A arg)
    {
      return new grammar.Absyn.ROper_or();
    }    public ROper visit(grammar.Absyn.ROper_sll p, A arg)
    {
      return new grammar.Absyn.ROper_sll();
    }    public ROper visit(grammar.Absyn.ROper_slt p, A arg)
    {
      return new grammar.Absyn.ROper_slt();
    }    public ROper visit(grammar.Absyn.ROper_jr p, A arg)
    {
      return new grammar.Absyn.ROper_jr();
    }    public ROper visit(grammar.Absyn.ROper_syscall p, A arg)
    {
      return new grammar.Absyn.ROper_syscall();
    }
/* IOper */
    public IOper visit(grammar.Absyn.IOper_addi p, A arg)
    {
      return new grammar.Absyn.IOper_addi();
    }    public IOper visit(grammar.Absyn.IOper_ori p, A arg)
    {
      return new grammar.Absyn.IOper_ori();
    }    public IOper visit(grammar.Absyn.IOper_andi p, A arg)
    {
      return new grammar.Absyn.IOper_andi();
    }    public IOper visit(grammar.Absyn.IOper_slti p, A arg)
    {
      return new grammar.Absyn.IOper_slti();
    }    public IOper visit(grammar.Absyn.IOper_lui p, A arg)
    {
      return new grammar.Absyn.IOper_lui();
    }    public IOper visit(grammar.Absyn.IOper_beq p, A arg)
    {
      return new grammar.Absyn.IOper_beq();
    }    public IOper visit(grammar.Absyn.IOper_bne p, A arg)
    {
      return new grammar.Absyn.IOper_bne();
    }
/* JOper */
    public JOper visit(grammar.Absyn.JOper_j p, A arg)
    {
      return new grammar.Absyn.JOper_j();
    }
/* Type */
    public Type visit(grammar.Absyn.ER0 p, A arg)
    {
      ROper roper_ = p.roper_.accept(this, arg);
      return new grammar.Absyn.ER0(roper_);
    }    public Type visit(grammar.Absyn.ER1 p, A arg)
    {
      ROper roper_ = p.roper_.accept(this, arg);
      Reg reg_ = p.reg_.accept(this, arg);
      return new grammar.Absyn.ER1(roper_, reg_);
    }    public Type visit(grammar.Absyn.ER2 p, A arg)
    {
      ROper roper_ = p.roper_.accept(this, arg);
      Reg reg_1 = p.reg_1.accept(this, arg);
      Reg reg_2 = p.reg_2.accept(this, arg);
      return new grammar.Absyn.ER2(roper_, reg_1, reg_2);
    }    public Type visit(grammar.Absyn.ER3 p, A arg)
    {
      ROper roper_ = p.roper_.accept(this, arg);
      Reg reg_1 = p.reg_1.accept(this, arg);
      Reg reg_2 = p.reg_2.accept(this, arg);
      Reg reg_3 = p.reg_3.accept(this, arg);
      return new grammar.Absyn.ER3(roper_, reg_1, reg_2, reg_3);
    }    public Type visit(grammar.Absyn.EI p, A arg)
    {
      IOper ioper_ = p.ioper_.accept(this, arg);
      Reg reg_1 = p.reg_1.accept(this, arg);
      Reg reg_2 = p.reg_2.accept(this, arg);
      Imm imm_ = p.imm_.accept(this, arg);
      return new grammar.Absyn.EI(ioper_, reg_1, reg_2, imm_);
    }    public Type visit(grammar.Absyn.EJ p, A arg)
    {
      JOper joper_ = p.joper_.accept(this, arg);
      Imm imm_ = p.imm_.accept(this, arg);
      return new grammar.Absyn.EJ(joper_, imm_);
    }
/* LblLine */
    public LblLine visit(grammar.Absyn.LbledLine p, A arg)
    {
      Label label_ = p.label_.accept(this, arg);
      Type type_ = p.type_.accept(this, arg);
      return new grammar.Absyn.LbledLine(label_, type_);
    }    public LblLine visit(grammar.Absyn.LbledLine2 p, A arg)
    {
      Label label_ = p.label_.accept(this, arg);
      return new grammar.Absyn.LbledLine2(label_);
    }
}