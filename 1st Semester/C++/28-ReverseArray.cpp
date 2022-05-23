// 28. Write a function that reverses the elements of an array in place. The function must accept only one pointer value and return void.

#include <iostream>
#include <cstring>
using namespace std;

void rev(char *a)
{
    int x;
    char ch;
    x = strlen(a);
    // cout << x << endl;
    int i, j;
    for (i = 0, j = x - 1; i < x / 2; i++, j--)
    {
        ch = a[i];
        a[i] = a[j];
        a[j] = ch;
    }
}
main()
{
    int i, n;
    cout << "How many elements do you want to input?" << endl;
    cin >> n;
    char a[n + 1];
    cout << "Enter\n";
    for (i = 0; i < n; i++)
        cin >> a[i];
    rev(a);
    for (i = 0; i < 5; i++)
        cout << a[i] << endl;
}
