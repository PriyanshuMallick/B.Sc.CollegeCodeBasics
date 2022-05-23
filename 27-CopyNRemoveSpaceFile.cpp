// 27. Copy the contents of one text file to another file, after removing all whitespaces.

#include <iostream>
#include <fstream>
using namespace std;

void rs(string ifname, string ofname)
{
    ifstream in(ifname);
    ofstream out(ofname);
    char ch;
    while (in)
    {
        ch = in.get();
        if (ch != ' ' || ch != '\n')
        {
            out << ch;
        }
    }
}
int main()
{
    string in, out;
    in = "27-CopyNRemoveSpaceFile.cpp";
    out = "test/27-CopyNRemoveSpaceFile.txt";
    rs(in, out);
    return 0;
}