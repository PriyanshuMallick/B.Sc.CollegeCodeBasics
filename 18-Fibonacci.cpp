// 18. Write a program to display Fibonacci series (i) using recursion, (ii) using iteration

#include <iostream>
using namespace std;

// using recursion
int fib(int x)
{
    if (x == 1)
        return 0;
    if (x == 2)
        return 1;
    else
        return (fib(x - 1) + fib(x - 2));
}

int main()
{
    // using iteration
    int i, a = 0, b = 1, c;
    cout << a << " " << b << " ";

    for (i = 1; i < 10; i++)
    {
        c = a + b;
        a = b;
        b = c;
        cout << c << " ";
    }
    cout << endl;

    for (i = 1; i < 12; i++)
        cout << fib(i) << " ";
    cout << endl;
    return 0;
}