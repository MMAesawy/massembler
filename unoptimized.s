# N + N + 3 + N
lw     $t0, 4($gp)       # fetch N
add   $t0, $t0, $t0     # N+N
lw     $t1, 4($gp)       # fetch N
ori    $t2, $zero, 3     # 3
add   $t1, $t1, $t2     # 3+N
add    $t2, $t0, $t1     # N+N + 3+N
sw     $t2, 0($gp)       # i = ...