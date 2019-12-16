addi $t0, $t3, 154
main:
j main
j 14
add $t0, $t3, $s4
syscall
lw $s0, 24($0)
end: jr $gp 


