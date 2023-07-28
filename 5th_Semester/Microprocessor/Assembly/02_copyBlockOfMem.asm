;2. Write a program to copy a block of memory from one location 8820h to another location 8840h.

        LXI H, #8820h    ; Load source address into HL
        LXI D, #8840h    ; Load destination address into DE
        MVI C, 0Ah       ; Set the counter to 10
LOOP:   MOV A, M         ; Load data from source address into A
        STAX D           ; Store data at destination address from A
        INX H            ; Increment source address
        INX D            ; Increment destination address
        DCR C            ; Decrement counter
        JNZ LOOP         ; Jump back to LOOP if counter is not zero
        HLT              ; Halt the program
