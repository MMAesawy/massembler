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

absyn: grammar\Absyn\Stmt.java grammar\Absyn\StmtLblLine.java grammar\Absyn\StmtType.java grammar\Absyn\Label.java grammar\Absyn\Lbl1.java grammar\Absyn\Imm.java grammar\Absyn\Immi.java grammar\Absyn\Imml.java grammar\Absyn\Reg.java grammar\Absyn\Rg.java grammar\Absyn\ROper.java grammar\Absyn\ROper_add.java grammar\Absyn\ROper_sub.java grammar\Absyn\ROper_and.java grammar\Absyn\ROper_or.java grammar\Absyn\ROper_sll.java grammar\Absyn\ROper_slt.java grammar\Absyn\ROper_jr.java grammar\Absyn\ROper_syscall.java grammar\Absyn\IOper.java grammar\Absyn\IOper_addi.java grammar\Absyn\IOper_ori.java grammar\Absyn\IOper_andi.java grammar\Absyn\IOper_slti.java grammar\Absyn\IOper_lui.java grammar\Absyn\IOper_beq.java grammar\Absyn\IOper_bne.java grammar\Absyn\JOper.java grammar\Absyn\JOper_j.java grammar\Absyn\Type.java grammar\Absyn\ER0.java grammar\Absyn\ER1.java grammar\Absyn\ER2.java grammar\Absyn\ER3.java grammar\Absyn\EI.java grammar\Absyn\EJ.java grammar\Absyn\LblLine.java grammar\Absyn\LbledLine.java grammar\Absyn\LbledLine2.java
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
	 rm -f grammar\Absyn\Stmt.java grammar\Absyn\StmtLblLine.java grammar\Absyn\StmtType.java grammar\Absyn\Label.java grammar\Absyn\Lbl1.java grammar\Absyn\Imm.java grammar\Absyn\Immi.java grammar\Absyn\Imml.java grammar\Absyn\Reg.java grammar\Absyn\Rg.java grammar\Absyn\ROper.java grammar\Absyn\ROper_add.java grammar\Absyn\ROper_sub.java grammar\Absyn\ROper_and.java grammar\Absyn\ROper_or.java grammar\Absyn\ROper_sll.java grammar\Absyn\ROper_slt.java grammar\Absyn\ROper_jr.java grammar\Absyn\ROper_syscall.java grammar\Absyn\IOper.java grammar\Absyn\IOper_addi.java grammar\Absyn\IOper_ori.java grammar\Absyn\IOper_andi.java grammar\Absyn\IOper_slti.java grammar\Absyn\IOper_lui.java grammar\Absyn\IOper_beq.java grammar\Absyn\IOper_bne.java grammar\Absyn\JOper.java grammar\Absyn\JOper_j.java grammar\Absyn\Type.java grammar\Absyn\ER0.java grammar\Absyn\ER1.java grammar\Absyn\ER2.java grammar\Absyn\ER3.java grammar\Absyn\EI.java grammar\Absyn\EJ.java grammar\Absyn\LblLine.java grammar\Absyn\LbledLine.java grammar\Absyn\LbledLine2.java grammar\Absyn\Stmt.class grammar\Absyn\StmtLblLine.class grammar\Absyn\StmtType.class grammar\Absyn\Label.class grammar\Absyn\Lbl1.class grammar\Absyn\Imm.class grammar\Absyn\Immi.class grammar\Absyn\Imml.class grammar\Absyn\Reg.class grammar\Absyn\Rg.class grammar\Absyn\ROper.class grammar\Absyn\ROper_add.class grammar\Absyn\ROper_sub.class grammar\Absyn\ROper_and.class grammar\Absyn\ROper_or.class grammar\Absyn\ROper_sll.class grammar\Absyn\ROper_slt.class grammar\Absyn\ROper_jr.class grammar\Absyn\ROper_syscall.class grammar\Absyn\IOper.class grammar\Absyn\IOper_addi.class grammar\Absyn\IOper_ori.class grammar\Absyn\IOper_andi.class grammar\Absyn\IOper_slti.class grammar\Absyn\IOper_lui.class grammar\Absyn\IOper_beq.class grammar\Absyn\IOper_bne.class grammar\Absyn\JOper.class grammar\Absyn\JOper_j.class grammar\Absyn\Type.class grammar\Absyn\ER0.class grammar\Absyn\ER1.class grammar\Absyn\ER2.class grammar\Absyn\ER3.class grammar\Absyn\EI.class grammar\Absyn\EJ.class grammar\Absyn\LblLine.class grammar\Absyn\LbledLine.class grammar\Absyn\LbledLine2.class
	 rm -f grammar\Absyn\*.class
	 rmdir grammar\Absyn\
	 rm -f grammar\Yylex grammar\grammar.cup grammar\Yylex.java grammar\VisitSkel.java grammar\ComposVisitor.java grammar\AbstractVisitor.java grammar\FoldVisitor.java grammar\AllVisitor.java grammar\PrettyPrinter.java grammar\Skeleton.java grammar\Test.java grammar\sym.java grammar\parser.java grammar\*.class
	rm -f Makefile
	rmdir -p grammar\

