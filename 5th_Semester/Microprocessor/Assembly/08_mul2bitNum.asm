; 8. Write a program to multiply two 8-bit numbers.

      LXI H,8050H
      MOV B, M
      INX H
      XRA A
      MOV C, A
LOOP: ADD M
      JNC SKIP
      INR C
SKIP: DCR B
      JNZ LOOP
      LXI H,8060H
      MOV M, C
      INX H
      MOV M, A
      HLT