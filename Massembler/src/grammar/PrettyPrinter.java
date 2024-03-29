package grammar;
import grammar.Absyn.*;

public class PrettyPrinter
{
  //For certain applications increasing the initial size of the buffer may improve performance.
  private static final int INITIAL_BUFFER_SIZE = 128;
  private static final int INDENT_WIDTH = 2;
  //You may wish to change the parentheses used in precedence.
  private static final String _L_PAREN = new String("(");
  private static final String _R_PAREN = new String(")");
  //You may wish to change render
  private static void render(String s)
  {
    if (s.equals("{"))
    {
       buf_.append("\n");
       indent();
       buf_.append(s);
       _n_ = _n_ + INDENT_WIDTH;
       buf_.append("\n");
       indent();
    }
    else if (s.equals("(") || s.equals("["))
       buf_.append(s);
    else if (s.equals(")") || s.equals("]"))
    {
       backup();
       buf_.append(s);
       buf_.append(" ");
    }
    else if (s.equals("}"))
    {
       int t;
       _n_ = _n_ - INDENT_WIDTH;
       for(t=0; t<INDENT_WIDTH; t++) {
         backup();
       }
       buf_.append(s);
       buf_.append("\n");
       indent();
    }
    else if (s.equals(","))
    {
       backup();
       buf_.append(s);
       buf_.append(" ");
    }
    else if (s.equals(";"))
    {
       backup();
       buf_.append(s);
       buf_.append("\n");
       indent();
    }
    else if (s.equals("")) return;
    else
    {
       buf_.append(s);
       buf_.append(" ");
    }
  }


  //  print and show methods are defined for each category.
  public static String print(grammar.Absyn.Program foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(grammar.Absyn.Program foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(grammar.Absyn.ListStmt foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(grammar.Absyn.ListStmt foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(grammar.Absyn.Stmt foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(grammar.Absyn.Stmt foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(grammar.Absyn.Label foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(grammar.Absyn.Label foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(grammar.Absyn.Offset foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(grammar.Absyn.Offset foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(grammar.Absyn.LblInstr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(grammar.Absyn.LblInstr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(grammar.Absyn.Imm foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(grammar.Absyn.Imm foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(grammar.Absyn.Addr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(grammar.Absyn.Addr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(grammar.Absyn.PCPntr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(grammar.Absyn.PCPntr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(grammar.Absyn.RInstr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(grammar.Absyn.RInstr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(grammar.Absyn.IInstr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(grammar.Absyn.IInstr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(grammar.Absyn.JInstr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(grammar.Absyn.JInstr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(grammar.Absyn.Instr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(grammar.Absyn.Instr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  /***   You shouldn't need to change anything beyond this point.   ***/

  private static void pp(grammar.Absyn.Program foo, int _i_)
  {
    if (foo instanceof grammar.Absyn.PDefs)
    {
       grammar.Absyn.PDefs _pdefs = (grammar.Absyn.PDefs) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_pdefs.liststmt_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(grammar.Absyn.ListStmt foo, int _i_)
  {
     for (java.util.Iterator<Stmt> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), _i_);
       if (it.hasNext()) {
         render("");
       } else {
         render("");
       }
     }  }

  private static void pp(grammar.Absyn.Stmt foo, int _i_)
  {
    if (foo instanceof grammar.Absyn.EStmtLbl)
    {
       grammar.Absyn.EStmtLbl _estmtlbl = (grammar.Absyn.EStmtLbl) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_estmtlbl.lblinstr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.EStmtInstr)
    {
       grammar.Absyn.EStmtInstr _estmtinstr = (grammar.Absyn.EStmtInstr) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_estmtinstr.instr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(grammar.Absyn.Label foo, int _i_)
  {
    if (foo instanceof grammar.Absyn.ELbl)
    {
       grammar.Absyn.ELbl _elbl = (grammar.Absyn.ELbl) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_elbl.linelabel_, 0);
       render(":");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(grammar.Absyn.Offset foo, int _i_)
  {
    if (foo instanceof grammar.Absyn.OffRel)
    {
       grammar.Absyn.OffRel _offrel = (grammar.Absyn.OffRel) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_offrel.integer_, 0);
       render("(");
       pp(_offrel.reg_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(grammar.Absyn.LblInstr foo, int _i_)
  {
    if (foo instanceof grammar.Absyn.LbledStmt)
    {
       grammar.Absyn.LbledStmt _lbledstmt = (grammar.Absyn.LbledStmt) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_lbledstmt.label_, 0);
       pp(_lbledstmt.instr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.LbledLine)
    {
       grammar.Absyn.LbledLine _lbledline = (grammar.Absyn.LbledLine) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_lbledline.label_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(grammar.Absyn.Imm foo, int _i_)
  {
    if (foo instanceof grammar.Absyn.Immi)
    {
       grammar.Absyn.Immi _immi = (grammar.Absyn.Immi) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_immi.integer_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(grammar.Absyn.Addr foo, int _i_)
  {
    if (foo instanceof grammar.Absyn.AddRel)
    {
       grammar.Absyn.AddRel _addrel = (grammar.Absyn.AddRel) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_addrel.offset_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(grammar.Absyn.PCPntr foo, int _i_)
  {
    if (foo instanceof grammar.Absyn.PCPntrLbl)
    {
       grammar.Absyn.PCPntrLbl _pcpntrlbl = (grammar.Absyn.PCPntrLbl) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_pcpntrlbl.linelabel_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.PCPntrImm)
    {
       grammar.Absyn.PCPntrImm _pcpntrimm = (grammar.Absyn.PCPntrImm) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_pcpntrimm.imm_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(grammar.Absyn.RInstr foo, int _i_)
  {
    if (foo instanceof grammar.Absyn.EAdd)
    {
       grammar.Absyn.EAdd _eadd = (grammar.Absyn.EAdd) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("add");
       pp(_eadd.reg_1, 0);
       render(",");
       pp(_eadd.reg_2, 0);
       render(",");
       pp(_eadd.reg_3, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.ESub)
    {
       grammar.Absyn.ESub _esub = (grammar.Absyn.ESub) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("sub");
       pp(_esub.reg_1, 0);
       render(",");
       pp(_esub.reg_2, 0);
       render(",");
       pp(_esub.reg_3, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.EAnd)
    {
       grammar.Absyn.EAnd _eand = (grammar.Absyn.EAnd) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("and");
       pp(_eand.reg_1, 0);
       render(",");
       pp(_eand.reg_2, 0);
       render(",");
       pp(_eand.reg_3, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.EOr)
    {
       grammar.Absyn.EOr _eor = (grammar.Absyn.EOr) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("or");
       pp(_eor.reg_1, 0);
       render(",");
       pp(_eor.reg_2, 0);
       render(",");
       pp(_eor.reg_3, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.ESll)
    {
       grammar.Absyn.ESll _esll = (grammar.Absyn.ESll) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("sll");
       pp(_esll.reg_1, 0);
       render(",");
       pp(_esll.reg_2, 0);
       render(",");
       pp(_esll.imm_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.ESrl)
    {
       grammar.Absyn.ESrl _esrl = (grammar.Absyn.ESrl) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("srl");
       pp(_esrl.reg_1, 0);
       render(",");
       pp(_esrl.reg_2, 0);
       render(",");
       pp(_esrl.imm_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.ESlt)
    {
       grammar.Absyn.ESlt _eslt = (grammar.Absyn.ESlt) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("slt");
       pp(_eslt.reg_1, 0);
       render(",");
       pp(_eslt.reg_2, 0);
       render(",");
       pp(_eslt.reg_3, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.EJr)
    {
       grammar.Absyn.EJr _ejr = (grammar.Absyn.EJr) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("jr");
       pp(_ejr.reg_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(grammar.Absyn.IInstr foo, int _i_)
  {
    if (foo instanceof grammar.Absyn.EAddi)
    {
       grammar.Absyn.EAddi _eaddi = (grammar.Absyn.EAddi) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("addi");
       pp(_eaddi.reg_1, 0);
       render(",");
       pp(_eaddi.reg_2, 0);
       render(",");
       pp(_eaddi.imm_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.EOri)
    {
       grammar.Absyn.EOri _eori = (grammar.Absyn.EOri) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("ori");
       pp(_eori.reg_1, 0);
       render(",");
       pp(_eori.reg_2, 0);
       render(",");
       pp(_eori.imm_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.EAndi)
    {
       grammar.Absyn.EAndi _eandi = (grammar.Absyn.EAndi) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("andi");
       pp(_eandi.reg_1, 0);
       render(",");
       pp(_eandi.reg_2, 0);
       render(",");
       pp(_eandi.imm_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.ESlti)
    {
       grammar.Absyn.ESlti _eslti = (grammar.Absyn.ESlti) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("slti");
       pp(_eslti.reg_1, 0);
       render(",");
       pp(_eslti.reg_2, 0);
       render(",");
       pp(_eslti.imm_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.EBne)
    {
       grammar.Absyn.EBne _ebne = (grammar.Absyn.EBne) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("bne");
       pp(_ebne.reg_1, 0);
       render(",");
       pp(_ebne.reg_2, 0);
       render(",");
       pp(_ebne.pcpntr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.EBeq)
    {
       grammar.Absyn.EBeq _ebeq = (grammar.Absyn.EBeq) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("beq");
       pp(_ebeq.reg_1, 0);
       render(",");
       pp(_ebeq.reg_2, 0);
       render(",");
       pp(_ebeq.pcpntr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.ELui)
    {
       grammar.Absyn.ELui _elui = (grammar.Absyn.ELui) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("lui");
       pp(_elui.reg_, 0);
       render(",");
       pp(_elui.imm_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.ESw)
    {
       grammar.Absyn.ESw _esw = (grammar.Absyn.ESw) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("sw");
       pp(_esw.reg_, 0);
       render(",");
       pp(_esw.addr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.ELw)
    {
       grammar.Absyn.ELw _elw = (grammar.Absyn.ELw) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("lw");
       pp(_elw.reg_, 0);
       render(",");
       pp(_elw.addr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(grammar.Absyn.JInstr foo, int _i_)
  {
    if (foo instanceof grammar.Absyn.EJ)
    {
       grammar.Absyn.EJ _ej = (grammar.Absyn.EJ) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("j");
       pp(_ej.pcpntr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(grammar.Absyn.Instr foo, int _i_)
  {
    if (foo instanceof grammar.Absyn.ESyscall)
    {
       grammar.Absyn.ESyscall _esyscall = (grammar.Absyn.ESyscall) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("syscall");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.ERInstr)
    {
       grammar.Absyn.ERInstr _erinstr = (grammar.Absyn.ERInstr) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_erinstr.rinstr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.EIInstr)
    {
       grammar.Absyn.EIInstr _eiinstr = (grammar.Absyn.EIInstr) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_eiinstr.iinstr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.EJInstr)
    {
       grammar.Absyn.EJInstr _ejinstr = (grammar.Absyn.EJInstr) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_ejinstr.jinstr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }


  private static void sh(grammar.Absyn.Program foo)
  {
    if (foo instanceof grammar.Absyn.PDefs)
    {
       grammar.Absyn.PDefs _pdefs = (grammar.Absyn.PDefs) foo;
       render("(");
       render("PDefs");
       render("[");
       sh(_pdefs.liststmt_);
       render("]");
       render(")");
    }
  }

  private static void sh(grammar.Absyn.ListStmt foo)
  {
     for (java.util.Iterator<Stmt> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(grammar.Absyn.Stmt foo)
  {
    if (foo instanceof grammar.Absyn.EStmtLbl)
    {
       grammar.Absyn.EStmtLbl _estmtlbl = (grammar.Absyn.EStmtLbl) foo;
       render("(");
       render("EStmtLbl");
       sh(_estmtlbl.lblinstr_);
       render(")");
    }
    if (foo instanceof grammar.Absyn.EStmtInstr)
    {
       grammar.Absyn.EStmtInstr _estmtinstr = (grammar.Absyn.EStmtInstr) foo;
       render("(");
       render("EStmtInstr");
       sh(_estmtinstr.instr_);
       render(")");
    }
  }

  private static void sh(grammar.Absyn.Label foo)
  {
    if (foo instanceof grammar.Absyn.ELbl)
    {
       grammar.Absyn.ELbl _elbl = (grammar.Absyn.ELbl) foo;
       render("(");
       render("ELbl");
       sh(_elbl.linelabel_);
       render(")");
    }
  }

  private static void sh(grammar.Absyn.Offset foo)
  {
    if (foo instanceof grammar.Absyn.OffRel)
    {
       grammar.Absyn.OffRel _offrel = (grammar.Absyn.OffRel) foo;
       render("(");
       render("OffRel");
       sh(_offrel.integer_);
       sh(_offrel.reg_);
       render(")");
    }
  }

  private static void sh(grammar.Absyn.LblInstr foo)
  {
    if (foo instanceof grammar.Absyn.LbledStmt)
    {
       grammar.Absyn.LbledStmt _lbledstmt = (grammar.Absyn.LbledStmt) foo;
       render("(");
       render("LbledStmt");
       sh(_lbledstmt.label_);
       sh(_lbledstmt.instr_);
       render(")");
    }
    if (foo instanceof grammar.Absyn.LbledLine)
    {
       grammar.Absyn.LbledLine _lbledline = (grammar.Absyn.LbledLine) foo;
       render("(");
       render("LbledLine");
       sh(_lbledline.label_);
       render(")");
    }
  }

  private static void sh(grammar.Absyn.Imm foo)
  {
    if (foo instanceof grammar.Absyn.Immi)
    {
       grammar.Absyn.Immi _immi = (grammar.Absyn.Immi) foo;
       render("(");
       render("Immi");
       sh(_immi.integer_);
       render(")");
    }
  }

  private static void sh(grammar.Absyn.Addr foo)
  {
    if (foo instanceof grammar.Absyn.AddRel)
    {
       grammar.Absyn.AddRel _addrel = (grammar.Absyn.AddRel) foo;
       render("(");
       render("AddRel");
       sh(_addrel.offset_);
       render(")");
    }
  }

  private static void sh(grammar.Absyn.PCPntr foo)
  {
    if (foo instanceof grammar.Absyn.PCPntrLbl)
    {
       grammar.Absyn.PCPntrLbl _pcpntrlbl = (grammar.Absyn.PCPntrLbl) foo;
       render("(");
       render("PCPntrLbl");
       sh(_pcpntrlbl.linelabel_);
       render(")");
    }
    if (foo instanceof grammar.Absyn.PCPntrImm)
    {
       grammar.Absyn.PCPntrImm _pcpntrimm = (grammar.Absyn.PCPntrImm) foo;
       render("(");
       render("PCPntrImm");
       sh(_pcpntrimm.imm_);
       render(")");
    }
  }

  private static void sh(grammar.Absyn.RInstr foo)
  {
    if (foo instanceof grammar.Absyn.EAdd)
    {
       grammar.Absyn.EAdd _eadd = (grammar.Absyn.EAdd) foo;
       render("(");
       render("EAdd");
       sh(_eadd.reg_1);
       sh(_eadd.reg_2);
       sh(_eadd.reg_3);
       render(")");
    }
    if (foo instanceof grammar.Absyn.ESub)
    {
       grammar.Absyn.ESub _esub = (grammar.Absyn.ESub) foo;
       render("(");
       render("ESub");
       sh(_esub.reg_1);
       sh(_esub.reg_2);
       sh(_esub.reg_3);
       render(")");
    }
    if (foo instanceof grammar.Absyn.EAnd)
    {
       grammar.Absyn.EAnd _eand = (grammar.Absyn.EAnd) foo;
       render("(");
       render("EAnd");
       sh(_eand.reg_1);
       sh(_eand.reg_2);
       sh(_eand.reg_3);
       render(")");
    }
    if (foo instanceof grammar.Absyn.EOr)
    {
       grammar.Absyn.EOr _eor = (grammar.Absyn.EOr) foo;
       render("(");
       render("EOr");
       sh(_eor.reg_1);
       sh(_eor.reg_2);
       sh(_eor.reg_3);
       render(")");
    }
    if (foo instanceof grammar.Absyn.ESll)
    {
       grammar.Absyn.ESll _esll = (grammar.Absyn.ESll) foo;
       render("(");
       render("ESll");
       sh(_esll.reg_1);
       sh(_esll.reg_2);
       sh(_esll.imm_);
       render(")");
    }
    if (foo instanceof grammar.Absyn.ESrl)
    {
       grammar.Absyn.ESrl _esrl = (grammar.Absyn.ESrl) foo;
       render("(");
       render("ESrl");
       sh(_esrl.reg_1);
       sh(_esrl.reg_2);
       sh(_esrl.imm_);
       render(")");
    }
    if (foo instanceof grammar.Absyn.ESlt)
    {
       grammar.Absyn.ESlt _eslt = (grammar.Absyn.ESlt) foo;
       render("(");
       render("ESlt");
       sh(_eslt.reg_1);
       sh(_eslt.reg_2);
       sh(_eslt.reg_3);
       render(")");
    }
    if (foo instanceof grammar.Absyn.EJr)
    {
       grammar.Absyn.EJr _ejr = (grammar.Absyn.EJr) foo;
       render("(");
       render("EJr");
       sh(_ejr.reg_);
       render(")");
    }
  }

  private static void sh(grammar.Absyn.IInstr foo)
  {
    if (foo instanceof grammar.Absyn.EAddi)
    {
       grammar.Absyn.EAddi _eaddi = (grammar.Absyn.EAddi) foo;
       render("(");
       render("EAddi");
       sh(_eaddi.reg_1);
       sh(_eaddi.reg_2);
       sh(_eaddi.imm_);
       render(")");
    }
    if (foo instanceof grammar.Absyn.EOri)
    {
       grammar.Absyn.EOri _eori = (grammar.Absyn.EOri) foo;
       render("(");
       render("EOri");
       sh(_eori.reg_1);
       sh(_eori.reg_2);
       sh(_eori.imm_);
       render(")");
    }
    if (foo instanceof grammar.Absyn.EAndi)
    {
       grammar.Absyn.EAndi _eandi = (grammar.Absyn.EAndi) foo;
       render("(");
       render("EAndi");
       sh(_eandi.reg_1);
       sh(_eandi.reg_2);
       sh(_eandi.imm_);
       render(")");
    }
    if (foo instanceof grammar.Absyn.ESlti)
    {
       grammar.Absyn.ESlti _eslti = (grammar.Absyn.ESlti) foo;
       render("(");
       render("ESlti");
       sh(_eslti.reg_1);
       sh(_eslti.reg_2);
       sh(_eslti.imm_);
       render(")");
    }
    if (foo instanceof grammar.Absyn.EBne)
    {
       grammar.Absyn.EBne _ebne = (grammar.Absyn.EBne) foo;
       render("(");
       render("EBne");
       sh(_ebne.reg_1);
       sh(_ebne.reg_2);
       sh(_ebne.pcpntr_);
       render(")");
    }
    if (foo instanceof grammar.Absyn.EBeq)
    {
       grammar.Absyn.EBeq _ebeq = (grammar.Absyn.EBeq) foo;
       render("(");
       render("EBeq");
       sh(_ebeq.reg_1);
       sh(_ebeq.reg_2);
       sh(_ebeq.pcpntr_);
       render(")");
    }
    if (foo instanceof grammar.Absyn.ELui)
    {
       grammar.Absyn.ELui _elui = (grammar.Absyn.ELui) foo;
       render("(");
       render("ELui");
       sh(_elui.reg_);
       sh(_elui.imm_);
       render(")");
    }
    if (foo instanceof grammar.Absyn.ESw)
    {
       grammar.Absyn.ESw _esw = (grammar.Absyn.ESw) foo;
       render("(");
       render("ESw");
       sh(_esw.reg_);
       sh(_esw.addr_);
       render(")");
    }
    if (foo instanceof grammar.Absyn.ELw)
    {
       grammar.Absyn.ELw _elw = (grammar.Absyn.ELw) foo;
       render("(");
       render("ELw");
       sh(_elw.reg_);
       sh(_elw.addr_);
       render(")");
    }
  }

  private static void sh(grammar.Absyn.JInstr foo)
  {
    if (foo instanceof grammar.Absyn.EJ)
    {
       grammar.Absyn.EJ _ej = (grammar.Absyn.EJ) foo;
       render("(");
       render("EJ");
       sh(_ej.pcpntr_);
       render(")");
    }
  }

  private static void sh(grammar.Absyn.Instr foo)
  {
    if (foo instanceof grammar.Absyn.ESyscall)
    {
       grammar.Absyn.ESyscall _esyscall = (grammar.Absyn.ESyscall) foo;
       render("ESyscall");
    }
    if (foo instanceof grammar.Absyn.ERInstr)
    {
       grammar.Absyn.ERInstr _erinstr = (grammar.Absyn.ERInstr) foo;
       render("(");
       render("ERInstr");
       sh(_erinstr.rinstr_);
       render(")");
    }
    if (foo instanceof grammar.Absyn.EIInstr)
    {
       grammar.Absyn.EIInstr _eiinstr = (grammar.Absyn.EIInstr) foo;
       render("(");
       render("EIInstr");
       sh(_eiinstr.iinstr_);
       render(")");
    }
    if (foo instanceof grammar.Absyn.EJInstr)
    {
       grammar.Absyn.EJInstr _ejinstr = (grammar.Absyn.EJInstr) foo;
       render("(");
       render("EJInstr");
       sh(_ejinstr.jinstr_);
       render(")");
    }
  }


  private static void pp(Integer n, int _i_) { buf_.append(n); buf_.append(" "); }
  private static void pp(Double d, int _i_) { buf_.append(d); buf_.append(" "); }
  private static void pp(String s, int _i_) { buf_.append(s); buf_.append(" "); }
  private static void pp(Character c, int _i_) { buf_.append("'" + c.toString() + "'"); buf_.append(" "); }
  private static void sh(Integer n) { render(n.toString()); }
  private static void sh(Double d) { render(d.toString()); }
  private static void sh(Character c) { render(c.toString()); }
  private static void sh(String s) { printQuoted(s); }
  private static void printQuoted(String s) { render("\"" + s + "\""); }
  private static void indent()
  {
    int n = _n_;
    while (n > 0)
    {
      buf_.append(" ");
      n--;
    }
  }
  private static void backup()
  {
     if (buf_.charAt(buf_.length() - 1) == ' ') {
      buf_.setLength(buf_.length() - 1);
    }
  }
  private static void trim()
  {
     while (buf_.length() > 0 && buf_.charAt(0) == ' ')
        buf_.deleteCharAt(0); 
    while (buf_.length() > 0 && buf_.charAt(buf_.length()-1) == ' ')
        buf_.deleteCharAt(buf_.length()-1);
  }
  private static int _n_ = 0;
  private static StringBuilder buf_ = new StringBuilder(INITIAL_BUFFER_SIZE);
}

