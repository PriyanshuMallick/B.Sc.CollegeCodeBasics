#include <iostream>
#include <string>

using namespace std;

string revstr(string str)
{
    string rstr, sub;
    int i = 0, j = 0, k;
    int len = str.length() - 1;

    while (i < len)
    {
        while (i < len && str[i] == ' ')
            i++;
        if (i > 0)
            j = i + 1;

        /*while (j < len && str[j] != ' ')
            if (j == len)
                cout << str[j] << endl;
            else
                cout << str[j - 1] << endl;*/
        for (k = j; k >= i; k--)
        {
            if (rstr.length() == 0)
                rstr = str[k];
            else
            {
                if (k == len)
                    rstr = str[k] + rstr;
                else
                    rstr = str[k - 1] + rstr;
            }
        }
        rstr += " ";

        /*sub = str.substr(i, j - i);
        if (rstr.length() == 0)
            rstr = sub;
        else
            rstr = sub + " " + rstr;*/
        i = j + 1;
    }
    return rstr;
}

int main()
{
    string str;
    cout << "\nEnter something\n";
    getline(cin, str);
    cout << revstr(str) << endl;
    return 0;
}