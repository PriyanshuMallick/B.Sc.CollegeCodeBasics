;4. Write a program to load two unsigned numbers in register b & c.
;Subtract b from c. If the result is in 2’s complement,
;convert the result in absolute magnitude & display it.

         MVI B, 69H   ;B = 69H
         MVI C, 42H   ;C = 42H

         MOV A, B     ;A = B
         SUB C        ;A = A - C
         
         JP Display   ;if Answer is +ve, jump to Display

         CMA          ;Else, complement A (1's complement)
         INR A        ;A = A + 1 (2's complement)

Display: OUT 01H      ;Display answer at port 01H

         HLT      