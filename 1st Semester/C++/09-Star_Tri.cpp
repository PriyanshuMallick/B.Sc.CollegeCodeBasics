// A program to print a triangle of stars as follows (take number of lines from user)

#include <iostream>
using namespace std;

int main()
{
    int i, j, k, n, star = 1;
    cout << "Enter the no. of rows of stats you want" << endl;
    cin >> n;
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < (n - (i + 1)); j++)
            cout << " ";
        for (k = 0; k < star; k++)
            cout << "*";
        cout << endl;
        star += 2;
    }
    return 0;
}
