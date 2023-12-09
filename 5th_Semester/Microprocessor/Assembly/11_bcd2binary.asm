; 11. Write a program for BCD to binary conversion.

              LDA 201FH
              MOV B, A
              ANI 0FH
              MOV C, A
              MOV A, B
              ANI FOH
              JZ SKIPMULTIPLY

              RRC
              RRC
              RRC
              RRC
              MOV D,
              XRA A
              MVI E, OAH

SUM:	        ADD D
              DCR E
              JNZ SUM

SKIPMULTIPLY: ADD C
              STA 2020H

              HLT