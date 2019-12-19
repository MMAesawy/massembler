#EXPECTED REGISTRY FILE:
# $s0 --> 10
# $s1 --> 10

addi $s0, $0, 5
addi $s1, $0, 10

loop:
	beq $s0, $s1, end
	addi $s0, $s0, 1
	j loop
	
end: addi $0, $0, 0