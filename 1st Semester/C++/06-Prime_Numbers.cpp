// 6. Write a function to find whether a given no. is prime or not. Use the same to generate the prime numbers less than 100
#include <iostream>
#include <math.h>
using namespace std;
int findprime(int x)
{
    if (x < 2)
        return 1;
    else if (x == 2 || x == 3)
        return 0;
    int lim, F;
    lim = ceil(sqrt(x));
    for (int i = 2; i <= lim; i++)
        if (x % i == 0)
            return F = 1;
    if (F == 1)
        return 1;
    else
        return 0;
}
main()
{
    int i;
    for (i = 2; i < 100; i++)
    {
        if (findprime(i) == 0)
            cout << i << " ";
    }
    return 0;
}
