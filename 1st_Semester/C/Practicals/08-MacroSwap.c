// 8. Write a macro that swaps two numbers. Write a program to use it.
#include <stdio.h>
#define SWAP(x, y) (x ^= y ^= x ^= y)
main()
{
    int a = 1, b = 2;
    SWAP(a, b);
    printf("%d %d", a, b);
}