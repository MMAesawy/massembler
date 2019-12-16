package grammar;
import grammar.Absyn.*;
/*** BNFC-Generated Visitor Design Pattern Skeleton. ***/
/* This implements the common visitor design pattern.
   Tests show it to be slightly less efficient than the
   instanceof method, but easier to use. 
   Replace the R and A parameters with the desired return
   and context types.*/

public class VisitSkel
{
  public class ProgramVisitor<R,A> implements Program.Visitor<R,A>
  {
    public R visit(grammar.Absyn.PDefs p, A arg)
    { /* Code For PDefs Goes Here */
      for (Stmt x: p.liststmt_)
      { /* ... */ }
      return null;
    }
  }
  public class StmtVisitor<R,A> implements Stmt.Visitor<R,A>
  {
    public R visit(grammar.Absyn.EStmtLbl p, A arg)
    { /* Code For EStmtLbl Goes Here */
      p.lblinstr_.accept(new LblInstrVisitor<R,A>(), arg);
      return null;
    }    public R visit(grammar.Absyn.EStmtInstr p, A arg)
    { /* Code For EStmtInstr Goes Here */
      p.instr_.accept(new InstrVisitor<R,A>(), arg);
      return null;
    }
  }
  public class LabelVisitor<R,A> implements Label.Visitor<R,A>
  {
    public R visit(grammar.Absyn.ELbl p, A arg)
    { /* Code For ELbl Goes Here */
      //p.linelabel_;
      return null;
    }
  }
  public class OffsetVisitor<R,A> implements Offset.Visitor<R,A>
  {
    public R visit(grammar.Absyn.OffRel p, A arg)
    { /* Code For OffRel Goes Here */
      //p.integer_;
      //p.reg_;
      return null;
    }
  }
  public class LblInstrVisitor<R,A> implements LblInstr.Visitor<R,A>
  {
    public R visit(grammar.Absyn.LbledStmt p, A arg)
    { /* Code For LbledStmt Goes Here */
      p.label_.accept(new LabelVisitor<R,A>(), arg);
      p.instr_.accept(new InstrVisitor<R,A>(), arg);
      return null;
    }    public R visit(grammar.Absyn.LbledLine p, A arg)
    { /* Code For LbledLine Goes Here */
      p.label_.accept(new LabelVisitor<R,A>(), arg);
      return null;
    }
  }
  public class ImmVisitor<R,A> implements Imm.Visitor<R,A>
  {
    public R visit(grammar.Absyn.Immi p, A arg)
    { /* Code For Immi Goes Here */
      //p.integer_;
      return null;
    }
  }
  public class AddrVisitor<R,A> implements Addr.Visitor<R,A>
  {
    public R visit(grammar.Absyn.AddRel p, A arg)
    { /* Code For AddRel Goes Here */
      p.offset_.accept(new OffsetVisitor<R,A>(), arg);
      return null;
    }
  }
  public class PCPntrVisitor<R,A> implements PCPntr.Visitor<R,A>
  {
    public R visit(grammar.Absyn.PCPntrLbl p, A arg)
    { /* Code For PCPntrLbl Goes Here */
      //p.linelabel_;
      return null;
    }    public R visit(grammar.Absyn.PCPntrImm p, A arg)
    { /* Code For PCPntrImm Goes Here */
      p.imm_.accept(new ImmVisitor<R,A>(), arg);
      return null;
    }
  }
  public class RInstrVisitor<R,A> implements RInstr.Visitor<R,A>
  {
    public R visit(grammar.Absyn.EAdd p, A arg)
    { /* Code For EAdd Goes Here */
      //p.reg_1;
      //p.reg_2;
      //p.reg_3;
      return null;
    }    public R visit(grammar.Absyn.ESub p, A arg)
    { /* Code For ESub Goes Here */
      //p.reg_1;
      //p.reg_2;
      //p.reg_3;
      return null;
    }    public R visit(grammar.Absyn.EAnd p, A arg)
    { /* Code For EAnd Goes Here */
      //p.reg_1;
      //p.reg_2;
      //p.reg_3;
      return null;
    }    public R visit(grammar.Absyn.EOr p, A arg)
    { /* Code For EOr Goes Here */
      //p.reg_1;
      //p.reg_2;
      //p.reg_3;
      return null;
    }    public R visit(grammar.Absyn.ESll p, A arg)
    { /* Code For ESll Goes Here */
      //p.reg_1;
      //p.reg_2;
      p.imm_.accept(new ImmVisitor<R,A>(), arg);
      return null;
    }    public R visit(grammar.Absyn.ESrl p, A arg)
    { /* Code For ESrl Goes Here */
      //p.reg_1;
      //p.reg_2;
      p.imm_.accept(new ImmVisitor<R,A>(), arg);
      return null;
    }    public R visit(grammar.Absyn.ESlt p, A arg)
    { /* Code For ESlt Goes Here */
      //p.reg_1;
      //p.reg_2;
      //p.reg_3;
      return null;
    }    public R visit(grammar.Absyn.EJr p, A arg)
    { /* Code For EJr Goes Here */
      //p.reg_;
      return null;
    }
  }
  public class IInstrVisitor<R,A> implements IInstr.Visitor<R,A>
  {
    public R visit(grammar.Absyn.EAddi p, A arg)
    { /* Code For EAddi Goes Here */
      //p.reg_1;
      //p.reg_2;
      p.imm_.accept(new ImmVisitor<R,A>(), arg);
      return null;
    }    public R visit(grammar.Absyn.EOri p, A arg)
    { /* Code For EOri Goes Here */
      //p.reg_1;
      //p.reg_2;
      p.imm_.accept(new ImmVisitor<R,A>(), arg);
      return null;
    }    public R visit(grammar.Absyn.EAndi p, A arg)
    { /* Code For EAndi Goes Here */
      //p.reg_1;
      //p.reg_2;
      p.imm_.accept(new ImmVisitor<R,A>(), arg);
      return null;
    }    public R visit(grammar.Absyn.ESlti p, A arg)
    { /* Code For ESlti Goes Here */
      //p.reg_1;
      //p.reg_2;
      p.imm_.accept(new ImmVisitor<R,A>(), arg);
      return null;
    }    public R visit(grammar.Absyn.EBne p, A arg)
    { /* Code For EBne Goes Here */
      //p.reg_1;
      //p.reg_2;
      p.pcpntr_.accept(new PCPntrVisitor<R,A>(), arg);
      return null;
    }    public R visit(grammar.Absyn.EBeq p, A arg)
    { /* Code For EBeq Goes Here */
      //p.reg_1;
      //p.reg_2;
      p.pcpntr_.accept(new PCPntrVisitor<R,A>(), arg);
      return null;
    }    public R visit(grammar.Absyn.ELui p, A arg)
    { /* Code For ELui Goes Here */
      //p.reg_;
      p.imm_.accept(new ImmVisitor<R,A>(), arg);
      return null;
    }    public R visit(grammar.Absyn.ESw p, A arg)
    { /* Code For ESw Goes Here */
      //p.reg_;
      p.addr_.accept(new AddrVisitor<R,A>(), arg);
      return null;
    }    public R visit(grammar.Absyn.ELw p, A arg)
    { /* Code For ELw Goes Here */
      //p.reg_;
      p.addr_.accept(new AddrVisitor<R,A>(), arg);
      return null;
    }
  }
  public class JInstrVisitor<R,A> implements JInstr.Visitor<R,A>
  {
    public R visit(grammar.Absyn.EJ p, A arg)
    { /* Code For EJ Goes Here */
      p.pcpntr_.accept(new PCPntrVisitor<R,A>(), arg);
      return null;
    }
  }
  public class InstrVisitor<R,A> implements Instr.Visitor<R,A>
  {
    public R visit(grammar.Absyn.ESyscall p, A arg)
    { /* Code For ESyscall Goes Here */
      return null;
    }    public R visit(grammar.Absyn.ERInstr p, A arg)
    { /* Code For ERInstr Goes Here */
      p.rinstr_.accept(new RInstrVisitor<R,A>(), arg);
      return null;
    }    public R visit(grammar.Absyn.EIInstr p, A arg)
    { /* Code For EIInstr Goes Here */
      p.iinstr_.accept(new IInstrVisitor<R,A>(), arg);
      return null;
    }    public R visit(grammar.Absyn.EJInstr p, A arg)
    { /* Code For EJInstr Goes Here */
      p.jinstr_.accept(new JInstrVisitor<R,A>(), arg);
      return null;
    }
  }
}