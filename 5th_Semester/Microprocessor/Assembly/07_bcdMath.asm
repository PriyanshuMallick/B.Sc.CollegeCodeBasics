; 7. Write a program for 4 digit BCD addition and subtraction.(16 bit)

      LXI H,8040H
      MOV A, M
      INX H
      ADD M
      DAA
      LXI H,8050H
      MOV M, A
      JNC DONE
      MVI A, OIH
      INX H
      MOV M,A
DONE: HLT