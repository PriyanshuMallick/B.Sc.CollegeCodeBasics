// 29. Write a program that will read 10 integers from user and store them in an array. Implement array using pointers. The program will print the array elements in ascending and descending order.

#include <iostream>
#include <algorithm>
using namespace std;

void asc(int *x, int n)
{
    int i, j, temp;
    for (i = 0; i < n; i++) // Ascending order
        for (j = i + 1; j < n; j++)
            if (x[i] > x[j])
            {
                temp = x[i];
                x[i] = x[j];
                x[j] = temp;
            }
}
void dsc(int *x, int n)
{
    int i, j, temp;
    for (i = 0; i < n; i++) // Descending order
        for (j = i + 1; j < n; j++)
            if (x[i] < x[j])
            {
                temp = x[i];
                x[i] = x[j];
                x[j] = temp;
            }
}
int main()
{
    int i, n;
    cout << "How many nos. do you want to enter?" << endl;
    cin >> n;
    int a[n];
    cout << "Enter the nos.";
    for (i = 0; i < n; i++)
        cin >> a[i];

    asc(a, n);
    for (i = 0; i < n; i++)
        cout << a[i] << " ";
    cout << endl;

    dsc(a, n);
    for (i = 0; i < n; i++)
        cout << a[i] << " ";
    return 0;
}