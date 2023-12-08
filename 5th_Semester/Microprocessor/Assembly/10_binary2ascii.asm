; 10. Write a program for binary to ascii conversion

        LXI H, 8000H
        MOV
        MOV
        STC
        CMC
        SUI OAH
        JC NUM
        ADI 41H
        JMP STORE
NUM:    MOV A, B
        ADI 30H
STORE:  INX H
        MOV
        HLT