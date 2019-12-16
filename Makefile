JAVAC=javac
JAVAC_FLAGS=-sourcepath .
JAVA=java
JAVA_FLAGS=
CUP=java_cup.Main
CUPFLAGS=-nopositions -expect 100
JLEX=JLex.Main
all: test

test: absyn grammar\Yylex.class grammar\PrettyPrinter.class grammar\Test.class grammar\ComposVisitor.class grammar\AbstractVisitor.class grammar\FoldVisitor.class grammar\AllVisitor.class grammar\parser.class grammar\sym.class grammar\Test.class

.PHONY: absyn

%.class: %.java
	${JAVAC} ${JAVAC_FLAGS} $^

absyn: grammar\Absyn\Program.java grammar\Absyn\PDefs.java grammar\Absyn\ListStmt.java grammar\Absyn\Stmt.java grammar\Absyn\EStmtLbl.java grammar\Absyn\EStmtInstr.java grammar\Absyn\Label.java grammar\Absyn\ELbl.java grammar\Absyn\Offset.java grammar\Absyn\OffRel.java grammar\Absyn\LblInstr.java grammar\Absyn\LbledStmt.java grammar\Absyn\LbledLine.java grammar\Absyn\Imm.java grammar\Absyn\Immi.java grammar\Absyn\Addr.java grammar\Absyn\AddRel.java grammar\Absyn\PCPntr.java grammar\Absyn\PCPntrLbl.java grammar\Absyn\PCPntrImm.java grammar\Absyn\RInstr.java grammar\Absyn\EAdd.java grammar\Absyn\ESub.java grammar\Absyn\EAnd.java grammar\Absyn\EOr.java grammar\Absyn\ESll.java grammar\Absyn\ESrl.java grammar\Absyn\ESlt.java grammar\Absyn\EJr.java grammar\Absyn\IInstr.java grammar\Absyn\EAddi.java grammar\Absyn\EOri.java grammar\Absyn\EAndi.java grammar\Absyn\ESlti.java grammar\Absyn\EBne.java grammar\Absyn\EBeq.java grammar\Absyn\ELui.java grammar\Absyn\ESw.java grammar\Absyn\ELw.java grammar\Absyn\JInstr.java grammar\Absyn\EJ.java grammar\Absyn\Instr.java grammar\Absyn\ESyscall.java grammar\Absyn\ERInstr.java grammar\Absyn\EIInstr.java grammar\Absyn\EJInstr.java
	${JAVAC} ${JAVAC_FLAGS} $^

grammar\Yylex.java: grammar\Yylex
	${JAVA} ${JAVA_FLAGS} ${JLEX} grammar\Yylex

grammar\sym.java grammar\parser.java: grammar\grammar.cup
	${JAVA} ${JAVA_FLAGS} ${CUP} ${CUPFLAGS} grammar\grammar.cup
	mv sym.java parser.java grammar\

grammar\Yylex.class: grammar\Yylex.java grammar\sym.java

grammar\sym.class: grammar\sym.java

grammar\parser.class: grammar\parser.java grammar\sym.java

grammar\PrettyPrinter.class: grammar\PrettyPrinter.java

clean:
	rm -f grammar\Absyn\*.class grammar\*.class

distclean: vclean

vclean:
	 rm -f grammar\Absyn\Program.java grammar\Absyn\PDefs.java grammar\Absyn\ListStmt.java grammar\Absyn\Stmt.java grammar\Absyn\EStmtLbl.java grammar\Absyn\EStmtInstr.java grammar\Absyn\Label.java grammar\Absyn\ELbl.java grammar\Absyn\Offset.java grammar\Absyn\OffRel.java grammar\Absyn\LblInstr.java grammar\Absyn\LbledStmt.java grammar\Absyn\LbledLine.java grammar\Absyn\Imm.java grammar\Absyn\Immi.java grammar\Absyn\Addr.java grammar\Absyn\AddRel.java grammar\Absyn\PCPntr.java grammar\Absyn\PCPntrLbl.java grammar\Absyn\PCPntrImm.java grammar\Absyn\RInstr.java grammar\Absyn\EAdd.java grammar\Absyn\ESub.java grammar\Absyn\EAnd.java grammar\Absyn\EOr.java grammar\Absyn\ESll.java grammar\Absyn\ESrl.java grammar\Absyn\ESlt.java grammar\Absyn\EJr.java grammar\Absyn\IInstr.java grammar\Absyn\EAddi.java grammar\Absyn\EOri.java grammar\Absyn\EAndi.java grammar\Absyn\ESlti.java grammar\Absyn\EBne.java grammar\Absyn\EBeq.java grammar\Absyn\ELui.java grammar\Absyn\ESw.java grammar\Absyn\ELw.java grammar\Absyn\JInstr.java grammar\Absyn\EJ.java grammar\Absyn\Instr.java grammar\Absyn\ESyscall.java grammar\Absyn\ERInstr.java grammar\Absyn\EIInstr.java grammar\Absyn\EJInstr.java grammar\Absyn\Program.class grammar\Absyn\PDefs.class grammar\Absyn\ListStmt.class grammar\Absyn\Stmt.class grammar\Absyn\EStmtLbl.class grammar\Absyn\EStmtInstr.class grammar\Absyn\Label.class grammar\Absyn\ELbl.class grammar\Absyn\Offset.class grammar\Absyn\OffRel.class grammar\Absyn\LblInstr.class grammar\Absyn\LbledStmt.class grammar\Absyn\LbledLine.class grammar\Absyn\Imm.class grammar\Absyn\Immi.class grammar\Absyn\Addr.class grammar\Absyn\AddRel.class grammar\Absyn\PCPntr.class grammar\Absyn\PCPntrLbl.class grammar\Absyn\PCPntrImm.class grammar\Absyn\RInstr.class grammar\Absyn\EAdd.class grammar\Absyn\ESub.class grammar\Absyn\EAnd.class grammar\Absyn\EOr.class grammar\Absyn\ESll.class grammar\Absyn\ESrl.class grammar\Absyn\ESlt.class grammar\Absyn\EJr.class grammar\Absyn\IInstr.class grammar\Absyn\EAddi.class grammar\Absyn\EOri.class grammar\Absyn\EAndi.class grammar\Absyn\ESlti.class grammar\Absyn\EBne.class grammar\Absyn\EBeq.class grammar\Absyn\ELui.class grammar\Absyn\ESw.class grammar\Absyn\ELw.class grammar\Absyn\JInstr.class grammar\Absyn\EJ.class grammar\Absyn\Instr.class grammar\Absyn\ESyscall.class grammar\Absyn\ERInstr.class grammar\Absyn\EIInstr.class grammar\Absyn\EJInstr.class
	 rm -f grammar\Absyn\*.class
	 rmdir grammar\Absyn\
	 rm -f grammar\Yylex grammar\grammar.cup grammar\Yylex.java grammar\VisitSkel.java grammar\ComposVisitor.java grammar\AbstractVisitor.java grammar\FoldVisitor.java grammar\AllVisitor.java grammar\PrettyPrinter.java grammar\Skeleton.java grammar\Test.java grammar\sym.java grammar\parser.java grammar\*.class
	rm -f Makefile
	rmdir -p grammar\

