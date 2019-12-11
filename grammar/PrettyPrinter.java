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
  public static String print(grammar.Absyn.Reg foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(grammar.Absyn.Reg foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(grammar.Absyn.ROper foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(grammar.Absyn.ROper foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(grammar.Absyn.IOper foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(grammar.Absyn.IOper foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(grammar.Absyn.JOper foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(grammar.Absyn.JOper foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(grammar.Absyn.Type foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(grammar.Absyn.Type foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(grammar.Absyn.LblLine foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(grammar.Absyn.LblLine foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  /***   You shouldn't need to change anything beyond this point.   ***/

  private static void pp(grammar.Absyn.Stmt foo, int _i_)
  {
    if (foo instanceof grammar.Absyn.StmtLblLine)
    {
       grammar.Absyn.StmtLblLine _stmtlblline = (grammar.Absyn.StmtLblLine) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_stmtlblline.lblline_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.StmtType)
    {
       grammar.Absyn.StmtType _stmttype = (grammar.Absyn.StmtType) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_stmttype.type_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(grammar.Absyn.Label foo, int _i_)
  {
    if (foo instanceof grammar.Absyn.Lbl1)
    {
       grammar.Absyn.Lbl1 _lbl1 = (grammar.Absyn.Lbl1) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_lbl1.string_, 0);
       render(":");
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
    else     if (foo instanceof grammar.Absyn.Imml)
    {
       grammar.Absyn.Imml _imml = (grammar.Absyn.Imml) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_imml.label_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(grammar.Absyn.Reg foo, int _i_)
  {
    if (foo instanceof grammar.Absyn.Rg)
    {
       grammar.Absyn.Rg _rg = (grammar.Absyn.Rg) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("$");
       pp(_rg.char_, 0);
       pp(_rg.integer_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(grammar.Absyn.ROper foo, int _i_)
  {
    if (foo instanceof grammar.Absyn.ROper_add)
    {
       grammar.Absyn.ROper_add _roper_add = (grammar.Absyn.ROper_add) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("add");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.ROper_sub)
    {
       grammar.Absyn.ROper_sub _roper_sub = (grammar.Absyn.ROper_sub) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("sub");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.ROper_and)
    {
       grammar.Absyn.ROper_and _roper_and = (grammar.Absyn.ROper_and) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("and");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.ROper_or)
    {
       grammar.Absyn.ROper_or _roper_or = (grammar.Absyn.ROper_or) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("or");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.ROper_sll)
    {
       grammar.Absyn.ROper_sll _roper_sll = (grammar.Absyn.ROper_sll) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("sll");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.ROper_slt)
    {
       grammar.Absyn.ROper_slt _roper_slt = (grammar.Absyn.ROper_slt) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("slt");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.ROper_jr)
    {
       grammar.Absyn.ROper_jr _roper_jr = (grammar.Absyn.ROper_jr) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("jr");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.ROper_syscall)
    {
       grammar.Absyn.ROper_syscall _roper_syscall = (grammar.Absyn.ROper_syscall) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("syscall");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(grammar.Absyn.IOper foo, int _i_)
  {
    if (foo instanceof grammar.Absyn.IOper_addi)
    {
       grammar.Absyn.IOper_addi _ioper_addi = (grammar.Absyn.IOper_addi) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("addi");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.IOper_ori)
    {
       grammar.Absyn.IOper_ori _ioper_ori = (grammar.Absyn.IOper_ori) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("ori");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.IOper_andi)
    {
       grammar.Absyn.IOper_andi _ioper_andi = (grammar.Absyn.IOper_andi) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("andi");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.IOper_slti)
    {
       grammar.Absyn.IOper_slti _ioper_slti = (grammar.Absyn.IOper_slti) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("slti");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.IOper_lui)
    {
       grammar.Absyn.IOper_lui _ioper_lui = (grammar.Absyn.IOper_lui) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("lui");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.IOper_beq)
    {
       grammar.Absyn.IOper_beq _ioper_beq = (grammar.Absyn.IOper_beq) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("beq");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.IOper_bne)
    {
       grammar.Absyn.IOper_bne _ioper_bne = (grammar.Absyn.IOper_bne) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("bne");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(grammar.Absyn.JOper foo, int _i_)
  {
    if (foo instanceof grammar.Absyn.JOper_j)
    {
       grammar.Absyn.JOper_j _joper_j = (grammar.Absyn.JOper_j) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("j");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(grammar.Absyn.Type foo, int _i_)
  {
    if (foo instanceof grammar.Absyn.ER0)
    {
       grammar.Absyn.ER0 _er0 = (grammar.Absyn.ER0) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_er0.roper_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.ER1)
    {
       grammar.Absyn.ER1 _er1 = (grammar.Absyn.ER1) foo;
       if (_i_ > 1) render(_L_PAREN);
       pp(_er1.roper_, 0);
       pp(_er1.reg_, 0);
       if (_i_ > 1) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.ER2)
    {
       grammar.Absyn.ER2 _er2 = (grammar.Absyn.ER2) foo;
       if (_i_ > 2) render(_L_PAREN);
       pp(_er2.roper_, 0);
       pp(_er2.reg_1, 0);
       render(",");
       pp(_er2.reg_2, 0);
       if (_i_ > 2) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.ER3)
    {
       grammar.Absyn.ER3 _er3 = (grammar.Absyn.ER3) foo;
       if (_i_ > 3) render(_L_PAREN);
       pp(_er3.roper_, 0);
       pp(_er3.reg_1, 0);
       render(",");
       pp(_er3.reg_2, 0);
       render(",");
       pp(_er3.reg_3, 0);
       if (_i_ > 3) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.EI)
    {
       grammar.Absyn.EI _ei = (grammar.Absyn.EI) foo;
       if (_i_ > 4) render(_L_PAREN);
       pp(_ei.ioper_, 0);
       pp(_ei.reg_1, 0);
       render(",");
       pp(_ei.reg_2, 0);
       render(",");
       pp(_ei.imm_, 0);
       if (_i_ > 4) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.EJ)
    {
       grammar.Absyn.EJ _ej = (grammar.Absyn.EJ) foo;
       if (_i_ > 5) render(_L_PAREN);
       pp(_ej.joper_, 0);
       pp(_ej.imm_, 0);
       if (_i_ > 5) render(_R_PAREN);
    }
  }

  private static void pp(grammar.Absyn.LblLine foo, int _i_)
  {
    if (foo instanceof grammar.Absyn.LbledLine)
    {
       grammar.Absyn.LbledLine _lbledline = (grammar.Absyn.LbledLine) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_lbledline.label_, 0);
       pp(_lbledline.type_, 5);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof grammar.Absyn.LbledLine2)
    {
       grammar.Absyn.LbledLine2 _lbledline2 = (grammar.Absyn.LbledLine2) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_lbledline2.label_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }


  private static void sh(grammar.Absyn.Stmt foo)
  {
    if (foo instanceof grammar.Absyn.StmtLblLine)
    {
       grammar.Absyn.StmtLblLine _stmtlblline = (grammar.Absyn.StmtLblLine) foo;
       render("(");
       render("StmtLblLine");
       sh(_stmtlblline.lblline_);
       render(")");
    }
    if (foo instanceof grammar.Absyn.StmtType)
    {
       grammar.Absyn.StmtType _stmttype = (grammar.Absyn.StmtType) foo;
       render("(");
       render("StmtType");
       sh(_stmttype.type_);
       render(")");
    }
  }

  private static void sh(grammar.Absyn.Label foo)
  {
    if (foo instanceof grammar.Absyn.Lbl1)
    {
       grammar.Absyn.Lbl1 _lbl1 = (grammar.Absyn.Lbl1) foo;
       render("(");
       render("Lbl1");
       sh(_lbl1.string_);
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
    if (foo instanceof grammar.Absyn.Imml)
    {
       grammar.Absyn.Imml _imml = (grammar.Absyn.Imml) foo;
       render("(");
       render("Imml");
       sh(_imml.label_);
       render(")");
    }
  }

  private static void sh(grammar.Absyn.Reg foo)
  {
    if (foo instanceof grammar.Absyn.Rg)
    {
       grammar.Absyn.Rg _rg = (grammar.Absyn.Rg) foo;
       render("(");
       render("Rg");
       sh(_rg.char_);
       sh(_rg.integer_);
       render(")");
    }
  }

  private static void sh(grammar.Absyn.ROper foo)
  {
    if (foo instanceof grammar.Absyn.ROper_add)
    {
       grammar.Absyn.ROper_add _roper_add = (grammar.Absyn.ROper_add) foo;
       render("ROper_add");
    }
    if (foo instanceof grammar.Absyn.ROper_sub)
    {
       grammar.Absyn.ROper_sub _roper_sub = (grammar.Absyn.ROper_sub) foo;
       render("ROper_sub");
    }
    if (foo instanceof grammar.Absyn.ROper_and)
    {
       grammar.Absyn.ROper_and _roper_and = (grammar.Absyn.ROper_and) foo;
       render("ROper_and");
    }
    if (foo instanceof grammar.Absyn.ROper_or)
    {
       grammar.Absyn.ROper_or _roper_or = (grammar.Absyn.ROper_or) foo;
       render("ROper_or");
    }
    if (foo instanceof grammar.Absyn.ROper_sll)
    {
       grammar.Absyn.ROper_sll _roper_sll = (grammar.Absyn.ROper_sll) foo;
       render("ROper_sll");
    }
    if (foo instanceof grammar.Absyn.ROper_slt)
    {
       grammar.Absyn.ROper_slt _roper_slt = (grammar.Absyn.ROper_slt) foo;
       render("ROper_slt");
    }
    if (foo instanceof grammar.Absyn.ROper_jr)
    {
       grammar.Absyn.ROper_jr _roper_jr = (grammar.Absyn.ROper_jr) foo;
       render("ROper_jr");
    }
    if (foo instanceof grammar.Absyn.ROper_syscall)
    {
       grammar.Absyn.ROper_syscall _roper_syscall = (grammar.Absyn.ROper_syscall) foo;
       render("ROper_syscall");
    }
  }

  private static void sh(grammar.Absyn.IOper foo)
  {
    if (foo instanceof grammar.Absyn.IOper_addi)
    {
       grammar.Absyn.IOper_addi _ioper_addi = (grammar.Absyn.IOper_addi) foo;
       render("IOper_addi");
    }
    if (foo instanceof grammar.Absyn.IOper_ori)
    {
       grammar.Absyn.IOper_ori _ioper_ori = (grammar.Absyn.IOper_ori) foo;
       render("IOper_ori");
    }
    if (foo instanceof grammar.Absyn.IOper_andi)
    {
       grammar.Absyn.IOper_andi _ioper_andi = (grammar.Absyn.IOper_andi) foo;
       render("IOper_andi");
    }
    if (foo instanceof grammar.Absyn.IOper_slti)
    {
       grammar.Absyn.IOper_slti _ioper_slti = (grammar.Absyn.IOper_slti) foo;
       render("IOper_slti");
    }
    if (foo instanceof grammar.Absyn.IOper_lui)
    {
       grammar.Absyn.IOper_lui _ioper_lui = (grammar.Absyn.IOper_lui) foo;
       render("IOper_lui");
    }
    if (foo instanceof grammar.Absyn.IOper_beq)
    {
       grammar.Absyn.IOper_beq _ioper_beq = (grammar.Absyn.IOper_beq) foo;
       render("IOper_beq");
    }
    if (foo instanceof grammar.Absyn.IOper_bne)
    {
       grammar.Absyn.IOper_bne _ioper_bne = (grammar.Absyn.IOper_bne) foo;
       render("IOper_bne");
    }
  }

  private static void sh(grammar.Absyn.JOper foo)
  {
    if (foo instanceof grammar.Absyn.JOper_j)
    {
       grammar.Absyn.JOper_j _joper_j = (grammar.Absyn.JOper_j) foo;
       render("JOper_j");
    }
  }

  private static void sh(grammar.Absyn.Type foo)
  {
    if (foo instanceof grammar.Absyn.ER0)
    {
       grammar.Absyn.ER0 _er0 = (grammar.Absyn.ER0) foo;
       render("(");
       render("ER0");
       sh(_er0.roper_);
       render(")");
    }
    if (foo instanceof grammar.Absyn.ER1)
    {
       grammar.Absyn.ER1 _er1 = (grammar.Absyn.ER1) foo;
       render("(");
       render("ER1");
       sh(_er1.roper_);
       sh(_er1.reg_);
       render(")");
    }
    if (foo instanceof grammar.Absyn.ER2)
    {
       grammar.Absyn.ER2 _er2 = (grammar.Absyn.ER2) foo;
       render("(");
       render("ER2");
       sh(_er2.roper_);
       sh(_er2.reg_1);
       sh(_er2.reg_2);
       render(")");
    }
    if (foo instanceof grammar.Absyn.ER3)
    {
       grammar.Absyn.ER3 _er3 = (grammar.Absyn.ER3) foo;
       render("(");
       render("ER3");
       sh(_er3.roper_);
       sh(_er3.reg_1);
       sh(_er3.reg_2);
       sh(_er3.reg_3);
       render(")");
    }
    if (foo instanceof grammar.Absyn.EI)
    {
       grammar.Absyn.EI _ei = (grammar.Absyn.EI) foo;
       render("(");
       render("EI");
       sh(_ei.ioper_);
       sh(_ei.reg_1);
       sh(_ei.reg_2);
       sh(_ei.imm_);
       render(")");
    }
    if (foo instanceof grammar.Absyn.EJ)
    {
       grammar.Absyn.EJ _ej = (grammar.Absyn.EJ) foo;
       render("(");
       render("EJ");
       sh(_ej.joper_);
       sh(_ej.imm_);
       render(")");
    }
  }

  private static void sh(grammar.Absyn.LblLine foo)
  {
    if (foo instanceof grammar.Absyn.LbledLine)
    {
       grammar.Absyn.LbledLine _lbledline = (grammar.Absyn.LbledLine) foo;
       render("(");
       render("LbledLine");
       sh(_lbledline.label_);
       sh(_lbledline.type_);
       render(")");
    }
    if (foo instanceof grammar.Absyn.LbledLine2)
    {
       grammar.Absyn.LbledLine2 _lbledline2 = (grammar.Absyn.LbledLine2) foo;
       render("(");
       render("LbledLine2");
       sh(_lbledline2.label_);
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

