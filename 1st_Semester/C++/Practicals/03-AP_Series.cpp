/*Write a program to compute the sum of the first n terms of the following series
 S = 1+1/2+1/3+1/4+…
 S =1-2+3-4+5…*/

#include <iostream>
using namespace std;

int main()
{
    int n;
    float s = 0, x;
    cout << "How many terms do you want to compute?\n";
    cin >> n;
    cout << endl;
    for (int i = 1; i <= n; i++)
    {
        if (i % 2 == 0)
            x = i * (-1);
        else
            x = i;
        s += x;
    }
    cout << s << endl;
    return 0;
}