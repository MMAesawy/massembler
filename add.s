#sample example 'add two numbers'
la $t0, value # load address ‘value’ into $t0
lw $t1, 0($t0) # load word 0(value) into $t1
lw $t2, 4($t0) # load word 4(value) into $t2
add $t3, $t1, $t2 # add two numbers into $t3
sw $t3, 8($t0) # store word $t3 into 8($t0)
