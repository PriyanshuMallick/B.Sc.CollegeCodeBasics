// 17. Given two ordered arrays of integers, write a program to merge the two-arrays to get an ordered array

#include <iostream>
using namespace std;

int main()
{
    int i, j, n, n1, n2, temp;
    cout << "How many numbers do you want to enter in the first array?\n";
    cin >> n1;
    cout << "How many numbers do you want to enter in the second array?\n";
    cin >> n2;
    n = n1 + n2;
    int a[n1], b[n2], c[n];

    cout << "Enter the elements of the first array\n";
    for (i = 0; i < n1; i++)
    {
        cin >> a[i];
        c[i] = a[i];
    }

    cout << "Enter the elements of the second array\n";
    for (i = 0; i < n2; i++)
    {
        cin >> b[i];
        c[i + n1] = b[i];
    }

    for (i = 0; i < n; i++)
        for (j = i + 1; j < n; j++)
            if (c[i] > c[j])
            {
                temp = c[i];
                c[i] = c[j];
                c[j] = temp;
            }
    cout << endl;

    for (i = 0; i < n; i++)
        cout << c[i] << " ";

    return 0;
}