; 1. Write a program to add two 8-bit numbers & store the result in memory location 8820h.

LXI H, 8810H   ; Load HL register pair with the address 8810h (1st number)
MOV A, M       ; Load the accumulator with the value at the address in HL (1st number)
INX H          ; Increment HL to point to the next memory location (8821h - 2nd number)
MOV B, M       ; Load register B with the value at the updated address in HL (2nd number)
ADD B          ; Add the value in B to the accumulator (A)
STA 8820H      ; Store the result in memory location 8820h
HLT            ; Halt the program