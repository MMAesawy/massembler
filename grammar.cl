comment "//" ;
comment "/*" "*/" ;

entrypoints Stmt ;

rules Stmt ::= LblLine | Type ;
Lbl1. Label ::= String ":" ;
Immi. Imm ::= Integer ;
Imml. Imm ::= Label ;

Rg. Reg ::= "$" Char Integer ;
rules ROper ::= "add" | "sub" | "and" | "or"  | "sll" | "slt" | "jr" | "syscall" ;
rules IOper ::= "addi" | "ori" | "andi" | "slti" | "lui" | "beq" | "bne" ;
rules JOper ::= "j" ;

ER0. Type ::= ROper ;
ER1. Type1 ::= ROper Reg ;
ER2. Type2 ::= ROper Reg "," Reg ;
ER3. Type3 ::= ROper Reg "," Reg "," Reg ;
EI. Type4 ::= IOper Reg "," Reg "," Imm ;
EJ. Type5 ::= JOper Imm ;

coercions Type 5 ;

LbledLine. LblLine ::= Label Type5 ;
LbledLine2. LblLine ::= Label ;