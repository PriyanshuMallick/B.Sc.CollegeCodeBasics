; 9. Write a program to sort an array.

START:    LXI H, 8040H
          MVI D, OOH
          MOV C, M
          DCR C
          INX H
CHECK:    MOV A, M
          INX H
          CMP M
          JC NEXTBYT
          MOV B, M
          MOV M, A
          DCX H
          MOV M, B
          INX H
          MVI D, OIH
NEXTBYT:  DCR C
          JNZ CHECK
          MOV A, D
          RRC
          JC START
          HLT