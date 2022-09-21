/*Write a program to compute the sum of the first n terms of the following series
 S = 1+1/2+1/3+1/4+…*/

#include <iostream>
using namespace std;

int main()
{
    int n;
    float s = 0;
    cout << "How many terms do you want to compute?\n";
    cin >> n;
    cout << endl;
    for (int i = 1; i <= n; i++)
    {
        s += 1 / i;
    }
    cout << s << endl;
    return 0;
}