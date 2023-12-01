;3. Write a program to perform the subtraction of two 16 bit numbers.

LHLD 8050           ; Load H-L pair with address 8050 
XCHG                ; EXCHANGE H-L PAIR WITH D-E PAIR 
LHLD 8052           ; Load H-L pair with address 8052 

MVI C, 00           ; C<-00H              

MOV A, E            ; A<-E               
SUB L               ; A<-A-L              

STA 8054            ; 8054<-A             

MOV A, D            ; A<-D               
SBB H               ; SUBTRACT WITH BORROW       

STA 8055            ; 8055<-A             

HLT                 ; TERMINATES THE PROGRAM      