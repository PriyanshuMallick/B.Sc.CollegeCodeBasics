; 1. Write a program to add two 8 bit numbers & store it in a memory location 8820h.

LXI H, 8810H
MOV A, M
INX H
MOV B, M
ADD B
STA 8820H
HLT