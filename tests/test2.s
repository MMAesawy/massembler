#EXPECTED REGISTRY FILE:
# $s0 --> 18
# $t0 --> 123
# $t1 --> 27
# $t2 --> 123
# $t3 --> -96
# mem(18) --> 27
# mem(26) --> 123
# mem(30) --> -96

# base address
addi $s0, $0, 18

# initialize memory
addi $t0, $0, 27
sw $t0, 0($s0)

addi $t0, $0, 123
sw $t0, 8($s0)


lw $t1, 0($s0) 
lw $t2, 8($s0) 
sub $t3, $t1, $t2 
sw $t3, 12($s0) 