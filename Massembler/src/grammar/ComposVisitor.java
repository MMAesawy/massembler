package grammar;
import grammar.Absyn.*;
/** BNFC-Generated Composition Visitor
*/

public class ComposVisitor<A> implements
  grammar.Absyn.Program.Visitor<grammar.Absyn.Program,A>,
  grammar.Absyn.Stmt.Visitor<grammar.Absyn.Stmt,A>,
  grammar.Absyn.Label.Visitor<grammar.Absyn.Label,A>,
  grammar.Absyn.Offset.Visitor<grammar.Absyn.Offset,A>,
  grammar.Absyn.LblInstr.Visitor<grammar.Absyn.LblInstr,A>,
  grammar.Absyn.Imm.Visitor<grammar.Absyn.Imm,A>,
  grammar.Absyn.Addr.Visitor<grammar.Absyn.Addr,A>,
  grammar.Absyn.PCPntr.Visitor<grammar.Absyn.PCPntr,A>,
  grammar.Absyn.RInstr.Visitor<grammar.Absyn.RInstr,A>,
  grammar.Absyn.IInstr.Visitor<grammar.Absyn.IInstr,A>,
  grammar.Absyn.JInstr.Visitor<grammar.Absyn.JInstr,A>,
  grammar.Absyn.Instr.Visitor<grammar.Absyn.Instr,A>
{
/* Program */
    public Program visit(grammar.Absyn.PDefs p, A arg)
    {
      ListStmt liststmt_ = new ListStmt();
      for (Stmt x : p.liststmt_)
      {
        liststmt_.add(x.accept(this,arg));
      }
      return new grammar.Absyn.PDefs(liststmt_);
    }
/* Stmt */
    public Stmt visit(grammar.Absyn.EStmtLbl p, A arg)
    {
      LblInstr lblinstr_ = p.lblinstr_.accept(this, arg);
      return new grammar.Absyn.EStmtLbl(lblinstr_);
    }    public Stmt visit(grammar.Absyn.EStmtInstr p, A arg)
    {
      Instr instr_ = p.instr_.accept(this, arg);
      return new grammar.Absyn.EStmtInstr(instr_);
    }
/* Label */
    public Label visit(grammar.Absyn.ELbl p, A arg)
    {
      String linelabel_ = p.linelabel_;
      return new grammar.Absyn.ELbl(linelabel_);
    }
/* Offset */
    public Offset visit(grammar.Absyn.OffRel p, A arg)
    {
      Integer integer_ = p.integer_;
      String reg_ = p.reg_;
      return new grammar.Absyn.OffRel(integer_, reg_);
    }
/* LblInstr */
    public LblInstr visit(grammar.Absyn.LbledStmt p, A arg)
    {
      Label label_ = p.label_.accept(this, arg);
      Instr instr_ = p.instr_.accept(this, arg);
      return new grammar.Absyn.LbledStmt(label_, instr_);
    }    public LblInstr visit(grammar.Absyn.LbledLine p, A arg)
    {
      Label label_ = p.label_.accept(this, arg);
      return new grammar.Absyn.LbledLine(label_);
    }
/* Imm */
    public Imm visit(grammar.Absyn.Immi p, A arg)
    {
      Integer integer_ = p.integer_;
      return new grammar.Absyn.Immi(integer_);
    }
/* Addr */
    public Addr visit(grammar.Absyn.AddRel p, A arg)
    {
      Offset offset_ = p.offset_.accept(this, arg);
      return new grammar.Absyn.AddRel(offset_);
    }
/* PCPntr */
    public PCPntr visit(grammar.Absyn.PCPntrLbl p, A arg)
    {
      String linelabel_ = p.linelabel_;
      return new grammar.Absyn.PCPntrLbl(linelabel_);
    }    public PCPntr visit(grammar.Absyn.PCPntrImm p, A arg)
    {
      Imm imm_ = p.imm_.accept(this, arg);
      return new grammar.Absyn.PCPntrImm(imm_);
    }
/* RInstr */
    public RInstr visit(grammar.Absyn.EAdd p, A arg)
    {
      String reg_1 = p.reg_1;
      String reg_2 = p.reg_2;
      String reg_3 = p.reg_3;
      return new grammar.Absyn.EAdd(reg_1, reg_2, reg_3);
    }    public RInstr visit(grammar.Absyn.ESub p, A arg)
    {
      String reg_1 = p.reg_1;
      String reg_2 = p.reg_2;
      String reg_3 = p.reg_3;
      return new grammar.Absyn.ESub(reg_1, reg_2, reg_3);
    }    public RInstr visit(grammar.Absyn.EAnd p, A arg)
    {
      String reg_1 = p.reg_1;
      String reg_2 = p.reg_2;
      String reg_3 = p.reg_3;
      return new grammar.Absyn.EAnd(reg_1, reg_2, reg_3);
    }    public RInstr visit(grammar.Absyn.EOr p, A arg)
    {
      String reg_1 = p.reg_1;
      String reg_2 = p.reg_2;
      String reg_3 = p.reg_3;
      return new grammar.Absyn.EOr(reg_1, reg_2, reg_3);
    }    public RInstr visit(grammar.Absyn.ESll p, A arg)
    {
      String reg_1 = p.reg_1;
      String reg_2 = p.reg_2;
      Imm imm_ = p.imm_.accept(this, arg);
      return new grammar.Absyn.ESll(reg_1, reg_2, imm_);
    }    public RInstr visit(grammar.Absyn.ESrl p, A arg)
    {
      String reg_1 = p.reg_1;
      String reg_2 = p.reg_2;
      Imm imm_ = p.imm_.accept(this, arg);
      return new grammar.Absyn.ESrl(reg_1, reg_2, imm_);
    }    public RInstr visit(grammar.Absyn.ESlt p, A arg)
    {
      String reg_1 = p.reg_1;
      String reg_2 = p.reg_2;
      String reg_3 = p.reg_3;
      return new grammar.Absyn.ESlt(reg_1, reg_2, reg_3);
    }    public RInstr visit(grammar.Absyn.EJr p, A arg)
    {
      String reg_ = p.reg_;
      return new grammar.Absyn.EJr(reg_);
    }
/* IInstr */
    public IInstr visit(grammar.Absyn.EAddi p, A arg)
    {
      String reg_1 = p.reg_1;
      String reg_2 = p.reg_2;
      Imm imm_ = p.imm_.accept(this, arg);
      return new grammar.Absyn.EAddi(reg_1, reg_2, imm_);
    }    public IInstr visit(grammar.Absyn.EOri p, A arg)
    {
      String reg_1 = p.reg_1;
      String reg_2 = p.reg_2;
      Imm imm_ = p.imm_.accept(this, arg);
      return new grammar.Absyn.EOri(reg_1, reg_2, imm_);
    }    public IInstr visit(grammar.Absyn.EAndi p, A arg)
    {
      String reg_1 = p.reg_1;
      String reg_2 = p.reg_2;
      Imm imm_ = p.imm_.accept(this, arg);
      return new grammar.Absyn.EAndi(reg_1, reg_2, imm_);
    }    public IInstr visit(grammar.Absyn.ESlti p, A arg)
    {
      String reg_1 = p.reg_1;
      String reg_2 = p.reg_2;
      Imm imm_ = p.imm_.accept(this, arg);
      return new grammar.Absyn.ESlti(reg_1, reg_2, imm_);
    }    public IInstr visit(grammar.Absyn.EBne p, A arg)
    {
      String reg_1 = p.reg_1;
      String reg_2 = p.reg_2;
      PCPntr pcpntr_ = p.pcpntr_.accept(this, arg);
      return new grammar.Absyn.EBne(reg_1, reg_2, pcpntr_);
    }    public IInstr visit(grammar.Absyn.EBeq p, A arg)
    {
      String reg_1 = p.reg_1;
      String reg_2 = p.reg_2;
      PCPntr pcpntr_ = p.pcpntr_.accept(this, arg);
      return new grammar.Absyn.EBeq(reg_1, reg_2, pcpntr_);
    }    public IInstr visit(grammar.Absyn.ELui p, A arg)
    {
      String reg_ = p.reg_;
      Imm imm_ = p.imm_.accept(this, arg);
      return new grammar.Absyn.ELui(reg_, imm_);
    }    public IInstr visit(grammar.Absyn.ESw p, A arg)
    {
      String reg_ = p.reg_;
      Addr addr_ = p.addr_.accept(this, arg);
      return new grammar.Absyn.ESw(reg_, addr_);
    }    public IInstr visit(grammar.Absyn.ELw p, A arg)
    {
      String reg_ = p.reg_;
      Addr addr_ = p.addr_.accept(this, arg);
      return new grammar.Absyn.ELw(reg_, addr_);
    }
/* JInstr */
    public JInstr visit(grammar.Absyn.EJ p, A arg)
    {
      PCPntr pcpntr_ = p.pcpntr_.accept(this, arg);
      return new grammar.Absyn.EJ(pcpntr_);
    }
/* Instr */
    public Instr visit(grammar.Absyn.ESyscall p, A arg)
    {
      return new grammar.Absyn.ESyscall();
    }    public Instr visit(grammar.Absyn.ERInstr p, A arg)
    {
      RInstr rinstr_ = p.rinstr_.accept(this, arg);
      return new grammar.Absyn.ERInstr(rinstr_);
    }    public Instr visit(grammar.Absyn.EIInstr p, A arg)
    {
      IInstr iinstr_ = p.iinstr_.accept(this, arg);
      return new grammar.Absyn.EIInstr(iinstr_);
    }    public Instr visit(grammar.Absyn.EJInstr p, A arg)
    {
      JInstr jinstr_ = p.jinstr_.accept(this, arg);
      return new grammar.Absyn.EJInstr(jinstr_);
    }
}