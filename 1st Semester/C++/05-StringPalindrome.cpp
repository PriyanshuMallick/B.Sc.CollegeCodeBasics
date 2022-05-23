// 5. Write a function that checks whether a given string is Palindrome or not. Use this function to find whether the string entered by user is Palindrome or not
#include <iostream>
#include <string>

using namespace std;

int ispali(string str)
{
    int len, i, j, F = 0;
    len = str.length() - 1;
    for (i = 0, j = len; i != len / 2; i++, j--)
    {
        if (str[i] != str[j])
        {
            F = 1;
            break;
        }
    }
    return F;
}

int main()
{
    string str;
    int x;
    cout << "Enter a string\n";
    cin >> str;
    x = ispali(str);

    if (x == 1)
        cout << "It is not a Palindrome\n";
    else
        cout << "It is a Palindrome\n";

    return 0;
}
