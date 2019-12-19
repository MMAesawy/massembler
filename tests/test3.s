#EXPECTED REGISTRY FILE:
# $s0 --> 10
# $t0 --> 120
# $t1 --> 0
# $t2 --> 1
# $t3 --> 4
# mem(10) --> 120
# mem(14) --> 4

# base address
addi $s0, $0, 10

# initialize memory
addi $t0, $0, 120
sw $t0, 0($s0)

# this program calculates the hamming weight of the number
# in address 0.
# hamming weight is the sum of binary digits in a number.
lw $t1, 0($s0)
addi $t2, $0, 0
addi $s1, $0, 0
loop:
	beq $t1, $0, end
	andi $t2, $t1, 1 
	add $s1, $s1, $t2
	srl $t1, $t1, 1
	j loop
	
end:
sw $s1, 4($s0) 