/*write an interactive program to convert a binary number to its decimal equivalent. The binary number is stored as a string.*/

#include <iostream>
#include <math.h>
#include <string>

//#define _USE_STRINGS_DEFINES
#define _USE_MATH_DEFINES
using namespace std;
int BTD(string sbin)
{
    int bin = stoi(sbin);
    cout << bin << endl;
    int dec = 0, i, rem;
    for (i = 0; bin != 0; i++)
    {
        rem = bin % 10;
        cout << rem << endl;
        dec += (rem * pow(2, i));
        bin /= 10;
    }
    return dec;
}

int main()
{
    string bin;
    cout << "The the decimal number" << endl;
    cin >> bin;
    cout << BTD(bin) << endl;
    return 0;
}