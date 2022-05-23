/* A program to reverse a number */

#include <stdio.h>

int main()
{
    int i, n, x, nrev = 0, rem;
    printf("Enter a no.\n");
    scanf("%d", &n);
    x = n;
    while (x != 0)
    {
        rem = x % 10;
        nrev = nrev * 10 + rem;
        x /= 10;
    }
    printf("Reversed no. is %d\n", nrev);
    return 0;
}
