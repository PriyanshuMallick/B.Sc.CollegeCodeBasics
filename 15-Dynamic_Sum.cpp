//15. Write a program to find sum of n elements entered by the user. To write this program, allocate memory dynamically using malloc() / calloc() functions or new operator

#include <iostream>
#include <cstdlib>
using namespace std;

int main()
{
    int i, n, *p, sum = 0;
    cout << "How many nos. do you want to add?\n";
    cin >> n;
    p = (int *)calloc(n, sizeof(int));
    cout << "Enter " << n << " nos.\n";
    for (i = 0; i < n; i++)
        cin >> p[i];
    for (i = 0; i < n; i++)
        sum += p[i];
    cout << "Sum: " << sum;
    free(p);
    return 0;
}