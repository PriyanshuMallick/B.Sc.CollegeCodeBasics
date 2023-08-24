# 2. Write a program to copy a block of memory from one location 8820h to another location 8840h.

| Memory Address | Mnemonics    | HEX code |
| :------------: | ------------ | :------: |
|      8000      | LXI H, 8820H |    21    |
|      8001      |              |    20    |
|      8002      |              |    88    |
|      8003      | LXI D, 8840H |    5F    |
|      8004      |              |    40    |
|      8005      |              |    88    |
|      8006      | MVI C, 0AH   |    5D    |
|      8008      |              |    0A    |
|      8007      | MOV A, M     |    C9    |
|      8009      | STAX D       |    60    |
|      800A      | INX H        |    70    |
|      800B      | INX D        |    61    |
|      800C      | DCR C        |    5C    |
|      800D      | HLT          |    76    |
