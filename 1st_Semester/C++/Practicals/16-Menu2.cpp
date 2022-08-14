/*16. Write a menu driven program to perform following operations on strings:
i) Show address of each character in string
ii) Concatenate two strings without using strcat function.
iii) Concatenate two strings using strcat function.
iv) Compare two strings
v) Calculate length of the string (use pointers)
vi) Convert all lowercase characters to uppercase
vii) Convert all uppercase characters to lowercase
viii) Calculate number of vowels
ix) Reverse the string*/

#include <iostream>
#include <cstring>
#include <algorithm>
using namespace std;
string E()
{
    string s;
    cout << "Enter something" << endl;
    cin >> s;
    return s;
}
/*void addchar()
{
    string str;
    str = E();
    for (int i = 0; i < str.length(); i++)
        cout << str[i] << " = " << (void *)&str[i] << endl;
}
void catstr()
{
    string str, str1;
    str = E();
    str1 = E();
    string x = str + str1;
    cout << x << endl;
}
void cmp()
{
    string str, str1;
    str = E();
    str1 = E();
    int x = str.compare(str1);
    if (x < 0)
        cout << str << " is less than " << str1 << endl;
    else if (x < 0)
        cout << str << " is greater than " << str1 << endl;
    else
        cout << str << " is equal to " << str1 << endl;
}
void len()
{
    char str[30];
    cout << "Enter something" << endl;
    cin >> str;
    char *p = str;
    int i;
    for (i = 0; str[i] != '\0'; i++)
        ;
    cout << "Length: " << i << endl;
}
void u()
{
    string str;
    str = E();
    int i;
    for (int i = 0; str[i] != '\0'; i++)
        if (str[i] >= 'a' && str[i] <= 'z')
            str[i] -= 32;
    cout << str << endl;
}
void l()
{
    string str;
    str = E();
    int i;
    for (int i = 0; str[i] != '\0'; i++)
        if (str[i] >= 'A' && str[i] <= 'Z')
            str[i] += 32;
    cout << str << endl;
}
void calv()
{
    string str;
    str = E();
    int i, c = 0;
    for (int i = 0; str[i] != '\0'; i++)
        if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
            c++;
    cout << "No of vowels : " << c << endl;
}
void srev()
{
    string str, r;
    str = E();
    reverse(str.begin(), str.end());
    cout << "In reverse: " << str << endl;
}*/
int main()
{
    while (true)
    {
        cout << "Enter 1 to show address of each character in string." << endl;
        cout << "Enter 2 to concatenate two strings without using strcat function." << endl;
        cout << "Enter 3 to concatenate two strings using strcat function." << endl;
        cout << "Enter 4 to compare two strings" << endl;
        cout << "Enter 5 to calculate length of the string (use pointers)" << endl;
        cout << "Enter 6 to convert all lowercase characters to uppercase" << endl;
        cout << "Enter 7 to convert all uppercase characters to lowercase." << endl;
        cout << "Enter 8 to calculate number of vowels." << endl;
        cout << "Enter 9 to reverse the string." << endl;
        cout << "Enter anything else to exit." << endl;
        int option;
        cin >> option;
        string str, str1;
        int i, x;
        if (option == 1)
        {
            str = E();
            for (int i = 0; i < str.length(); i++)
                cout << str[i] << " = " << (void *)&str[i] << endl;
        }

        else if (option == 2)
        {
            str = E();
            str1 = E();
            string rs = str + str1;
            cout << rs << endl;
        }

        else if (option == 3)
        {
            char str[10] = "1 + 2 ";
            char str1[10] = "= 3";
            strcat(str, str1);
            cout << str;
        }
        else if (option == 4)
        {
            str = E();
            str1 = E();
            int x;
            x = str.compare(str1);
            if (x < 0)
                cout << str << " is less than " << str1 << endl;
            else if (x > 0)
                cout << str << " is greater than " << str1 << endl;
            else
                cout << str << " is equal to " << str1 << endl;
        }

        else if (option == 5)
        {
            char str[30];
            cout << "Enter something" << endl;
            cin >> str;
            char *p = str;
            int i;
            for (i = 0; str[i] != '\0'; i++)
                ;
            cout << "Length: " << i << endl;
        }
        else if (option == 6)
        {
            string str;
            str = E();
            int i;
            for (int i = 0; str[i] != '\0'; i++)
                if (str[i] >= 'a' && str[i] <= 'z')
                    str[i] -= 32;
            cout << str << endl;
        }
        else if (option == 7)
        {
            string str;
            str = E();
            int i;
            for (int i = 0; str[i] != '\0'; i++)
                if (str[i] >= 'A' && str[i] <= 'Z')
                    str[i] += 32;
            cout << str << endl;
        }
        else if (option == 8)
        {
            string str;
            str = E();
            int i, c = 0;
            for (int i = 0; str[i] != '\0'; i++)
                if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
                    c++;
            cout << "No of vowels : " << c << endl;
        }
        else if (option == 9)
        {
            string str, r;
            str = E();
            int len = str.length();
            // reverse(str.begin(), str.end());
            cout << "In reverse: ";
            for (int i = len - 1; i >= 0; i--)
                cout << str[i];
            cout << endl;
        }
        else
            break;

        cout << "Do you want to run the program again?" << endl;
        cout << "Enter 1 for YES \nAny key for NO" << endl;
        int option2;
        cin >> option2;
        if (option2 != 1)
            break;
    }
    cout << "Exiting..." << endl;
    return 0;
}
