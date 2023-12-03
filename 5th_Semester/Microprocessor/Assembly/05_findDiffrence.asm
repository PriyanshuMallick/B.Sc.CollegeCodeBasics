;5. Write a program to find the difference of two numbers
;& store the result in a memory location 8830h.
;
;It takes the numbers as 16-bit numbers
;Fist numbers is stored at 8050 (Lower bit) 8051 (Higher bit)
;Second numbers is stored at 8051 (Lower bit) 8053 (Higher bit)

LHLD 8050           ; Load H-L pair with address 8050 
XCHG                ; EXCHANGE H-L PAIR WITH D-E PAIR 
LHLD 8052           ; Load H-L pair with address 8052 

MVI C, 00           ; C<-00H              

MOV A, E            ; A<-E               
SUB L               ; A<-A-L              
STA 8054            ; 8054<-A             
MOV A, D            ; A<-D               
SBB H               ; SUBTRACT WITH BORROW       
STA 8830            ; 8830<-A             
HLT                 ; TERMINATES THE PROGRAM      