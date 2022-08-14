#include <iostream>
#include <string>

using namespace std;

string revstr(string str)
{
    string rstr, sub;
    int i = 0;
    int n = str.length() - 1;

    while (i < n)
    {
        while (i < n && str[i] == ' ')
            i++;
        if (i >= n)
            break;
        int j = i + 1;
        while (j < n && str[j] != ' ')
            j++;
        sub = str.substr(i, j - i);
        if (rstr.length() == 0)
            rstr = sub;
        else
            rstr = sub + " " + rstr;
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