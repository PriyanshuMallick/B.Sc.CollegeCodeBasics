// A program to print the sum and product of digits of an integer.

#include <iostream>
using namespace std;

int main()
{
    int sum = 0, product = 1, n, x, rem;
    cout << "Enter a no\n";
    cin >> n;
    x = n;
    while (x != 0)
    {
        rem = x % 10;
        sum += rem;
        product *= rem;
        x /= 10;
    }
    cout << "Sum = " << sum << endl;
    cout << "Product = " << product << endl;
    return 0;
}