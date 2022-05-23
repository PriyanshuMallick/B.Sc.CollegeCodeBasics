// 19. Write a program to calculate Factorial of a number (i) using recursion, (ii) using iteration

#include <iostream>
using namespace std;
// using recursion
int fac(int x)
{
    if (x > 1)
        return (x * fac(x - 1));
    else
        return 1;
}
int main()
{
    // using iteration
    int i, a = 5, f, f1;
    for (i = a - 1, f1 = a; i != 0; i--)
        f1 *= i;
    cout << f1 << endl;

    f = fac(a);
    cout << f << endl;
    return 0;
}