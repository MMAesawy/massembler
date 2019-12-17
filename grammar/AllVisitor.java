package grammar;

import grammar.Absyn.*;

/** BNFC-Generated All Visitor */
public interface AllVisitor<R,A> extends
  grammar.Absyn.Stmt.Visitor<R,A>,
  grammar.Absyn.Label.Visitor<R,A>,
  grammar.Absyn.Imm.Visitor<R,A>,
  grammar.Absyn.Reg.Visitor<R,A>,
  grammar.Absyn.ROper.Visitor<R,A>,
  grammar.Absyn.IOper.Visitor<R,A>,
  grammar.Absyn.JOper.Visitor<R,A>,
  grammar.Absyn.Type.Visitor<R,A>,
  grammar.Absyn.LblLine.Visitor<R,A>
{}