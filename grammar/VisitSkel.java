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
  public class StmtVisitor<R,A> implements Stmt.Visitor<R,A>
  {
    public R visit(grammar.Absyn.StmtLblLine p, A arg)
    { /* Code For StmtLblLine Goes Here */
      p.lblline_.accept(new LblLineVisitor<R,A>(), arg);
      return null;
    }    public R visit(grammar.Absyn.StmtType p, A arg)
    { /* Code For StmtType Goes Here */
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      return null;
    }
  }
  public class LabelVisitor<R,A> implements Label.Visitor<R,A>
  {
    public R visit(grammar.Absyn.Lbl1 p, A arg)
    { /* Code For Lbl1 Goes Here */
      //p.string_;
      return null;
    }
  }
  public class ImmVisitor<R,A> implements Imm.Visitor<R,A>
  {
    public R visit(grammar.Absyn.Immi p, A arg)
    { /* Code For Immi Goes Here */
      //p.integer_;
      return null;
    }    public R visit(grammar.Absyn.Imml p, A arg)
    { /* Code For Imml Goes Here */
      p.label_.accept(new LabelVisitor<R,A>(), arg);
      return null;
    }
  }
  public class RegVisitor<R,A> implements Reg.Visitor<R,A>
  {
    public R visit(grammar.Absyn.Rg p, A arg)
    { /* Code For Rg Goes Here */
      //p.char_;
      //p.integer_;
      return null;
    }
  }
  public class ROperVisitor<R,A> implements ROper.Visitor<R,A>
  {
    public R visit(grammar.Absyn.ROper_add p, A arg)
    { /* Code For ROper_add Goes Here */
      return null;
    }    public R visit(grammar.Absyn.ROper_sub p, A arg)
    { /* Code For ROper_sub Goes Here */
      return null;
    }    public R visit(grammar.Absyn.ROper_and p, A arg)
    { /* Code For ROper_and Goes Here */
      return null;
    }    public R visit(grammar.Absyn.ROper_or p, A arg)
    { /* Code For ROper_or Goes Here */
      return null;
    }    public R visit(grammar.Absyn.ROper_sll p, A arg)
    { /* Code For ROper_sll Goes Here */
      return null;
    }    public R visit(grammar.Absyn.ROper_slt p, A arg)
    { /* Code For ROper_slt Goes Here */
      return null;
    }    public R visit(grammar.Absyn.ROper_jr p, A arg)
    { /* Code For ROper_jr Goes Here */
      return null;
    }    public R visit(grammar.Absyn.ROper_syscall p, A arg)
    { /* Code For ROper_syscall Goes Here */
      return null;
    }
  }
  public class IOperVisitor<R,A> implements IOper.Visitor<R,A>
  {
    public R visit(grammar.Absyn.IOper_addi p, A arg)
    { /* Code For IOper_addi Goes Here */
      return null;
    }    public R visit(grammar.Absyn.IOper_ori p, A arg)
    { /* Code For IOper_ori Goes Here */
      return null;
    }    public R visit(grammar.Absyn.IOper_andi p, A arg)
    { /* Code For IOper_andi Goes Here */
      return null;
    }    public R visit(grammar.Absyn.IOper_slti p, A arg)
    { /* Code For IOper_slti Goes Here */
      return null;
    }    public R visit(grammar.Absyn.IOper_lui p, A arg)
    { /* Code For IOper_lui Goes Here */
      return null;
    }    public R visit(grammar.Absyn.IOper_beq p, A arg)
    { /* Code For IOper_beq Goes Here */
      return null;
    }    public R visit(grammar.Absyn.IOper_bne p, A arg)
    { /* Code For IOper_bne Goes Here */
      return null;
    }
  }
  public class JOperVisitor<R,A> implements JOper.Visitor<R,A>
  {
    public R visit(grammar.Absyn.JOper_j p, A arg)
    { /* Code For JOper_j Goes Here */
      return null;
    }
  }
  public class TypeVisitor<R,A> implements Type.Visitor<R,A>
  {
    public R visit(grammar.Absyn.ER0 p, A arg)
    { /* Code For ER0 Goes Here */
      p.roper_.accept(new ROperVisitor<R,A>(), arg);
      return null;
    }    public R visit(grammar.Absyn.ER1 p, A arg)
    { /* Code For ER1 Goes Here */
      p.roper_.accept(new ROperVisitor<R,A>(), arg);
      p.reg_.accept(new RegVisitor<R,A>(), arg);
      return null;
    }        public R visit(grammar.Absyn.ER2 p, A arg)
    { /* Code For ER2 Goes Here */
      p.roper_.accept(new ROperVisitor<R,A>(), arg);
      p.reg_1.accept(new RegVisitor<R,A>(), arg);
      p.reg_2.accept(new RegVisitor<R,A>(), arg);
      return null;
    }        public R visit(grammar.Absyn.ER3 p, A arg)
    { /* Code For ER3 Goes Here */
      p.roper_.accept(new ROperVisitor<R,A>(), arg);
      p.reg_1.accept(new RegVisitor<R,A>(), arg);
      p.reg_2.accept(new RegVisitor<R,A>(), arg);
      p.reg_3.accept(new RegVisitor<R,A>(), arg);
      return null;
    }        public R visit(grammar.Absyn.EI p, A arg)
    { /* Code For EI Goes Here */
      p.ioper_.accept(new IOperVisitor<R,A>(), arg);
      p.reg_1.accept(new RegVisitor<R,A>(), arg);
      p.reg_2.accept(new RegVisitor<R,A>(), arg);
      p.imm_.accept(new ImmVisitor<R,A>(), arg);
      return null;
    }        public R visit(grammar.Absyn.EJ p, A arg)
    { /* Code For EJ Goes Here */
      p.joper_.accept(new JOperVisitor<R,A>(), arg);
      p.imm_.accept(new ImmVisitor<R,A>(), arg);
      return null;
    }        
  }
  public class LblLineVisitor<R,A> implements LblLine.Visitor<R,A>
  {
    public R visit(grammar.Absyn.LbledLine p, A arg)
    { /* Code For LbledLine Goes Here */
      p.label_.accept(new LabelVisitor<R,A>(), arg);
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      return null;
    }    public R visit(grammar.Absyn.LbledLine2 p, A arg)
    { /* Code For LbledLine2 Goes Here */
      p.label_.accept(new LabelVisitor<R,A>(), arg);
      return null;
    }
  }
}