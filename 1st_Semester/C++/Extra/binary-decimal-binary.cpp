#include <iostream>
#include <math.h>
#define _USE_MATH_DEFINES
using namespace std;
void BTD(int bin)
{
    int dec, i, rem;
    dec = 0;
    for (i = 0; bin != 0; i++)
    {
        rem = bin % 10;
        dec = dec + rem * pow(2, i);
        bin = bin / 10;
    }
    cout << dec;
}
void DTB(int dec)
{
    int i, j, rem;
    /*for (i = 0; rem != 0; i++)
    {
        rem = dec % 2;
        dec = dec / 2;
    }*/

    int bin[32];

    for (i = 0; dec != 0; i++)
    {
        bin[i] = dec % 2;
        dec = dec / 2;
    }
    for (j = i - 1; j >= 0; j--)
    {
        cout << bin[j];
    }
}
main()
{
    int bin, dec, option;
    cout << "Enter 1 for Binary to Decmial\n";
    cout << "Enter 2 for Decmial to Binary\n";
    cout << "Any other key to exit\n";
    cin >> option;
    if (option == 1)
    {
        cout << "Enter Binary ";
        cin >> bin;
        BTD(bin);
    }
    else if (option == 2)
    {
        cout << "Enter Decimal ";
        cin >> dec;
        DTB(dec);
    }
    return 0;
}