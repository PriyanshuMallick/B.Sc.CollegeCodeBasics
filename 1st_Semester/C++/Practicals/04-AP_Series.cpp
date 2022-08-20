// 4. Write a program to compute the sum of the first n terms of the following series<br />
//     S = 1 - 2 + 3 - 4 + 5……………

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
        s += (i % 2 ? i * (-1) : i);
        // The above line is same as the code below
        // float x;
        // if (i % 2 == 0)
        //     x = i * (-1);
        // else
        //     x = i;
        // s += x;
    }
    cout << s << endl;
    return 0;
}
