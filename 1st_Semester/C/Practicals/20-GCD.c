/*20.Write a program to calculate GCD of two numbers (i) with recursion (ii) without recursion*/
#include <stdio.h>

int GCD(int x, int y) // using recursion
{
    if (x % y != 0)
        return GCD(y, x % y);
    else
        return y;
}
int main()
{
    int a, b, c;
    printf("Enter two numbers to calculate GCD\n");
    scanf("%d %d", &a, &b);
    if (a < b)
    {
        c = a;
        a = b;
        b = c;
    }
    printf("GCD = %d\n", GCD(a, b)); // using recursion
    while (a % b != 0)               // without recursion
    {
        c = a;
        a = b;
        b = c % b;
    }
    printf("GCD = %d\n", b);

    return 0;
}