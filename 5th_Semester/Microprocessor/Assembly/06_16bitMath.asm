; 6. Write a program to perform x - y + 5 where x and y are 16-bit numbers

LHLD 8050
XCHG
LHLD 8052

MOV A, E
SUB L

MOV C, A

MOV A, D
SBB H

MOV B, A

ADI 5

HLT