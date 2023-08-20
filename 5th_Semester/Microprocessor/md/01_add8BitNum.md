# 1. Write a program to add two 8 bit numbers & store it in a memory location 8820h.

| Memory Address | Mnemonics    | HEX code |
| :------------: | ------------ | :------: |
|      8000      | LXI H, 8810H |    21    |
|      8001      |              |    10    |
|      8002      |              |    88    |
|      8003      | MOV A, M     |    7E    |
|      8004      | INX H        |    23    |
|      8005      | MOV B, M     |    46    |
|      8006      | ADD B        |    80    |
|      8007      | STA 8820H    |    32    |
|      8008      |              |    20    |
|      8009      |              |    88    |
|      800A      | HLT          |    76    |
