addi $t0, $t3, 154
j 13
j 35

main:
add $t0, $t3, $s4
syscall
lw $s0, 24($0)
end: jr $gp 


