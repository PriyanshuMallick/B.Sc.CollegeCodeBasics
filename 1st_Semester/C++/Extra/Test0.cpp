#include <iostream>
#include <math.h>
using namespace std;

int isprime(int a)
{
    return 0;
}

int main()
{
    int i, n, x = 1;
    cout << "enter\n";
    cin >> n;
    for (i = n; i > 1; i--)
        x *= i;
    cout << x << endl;
}
