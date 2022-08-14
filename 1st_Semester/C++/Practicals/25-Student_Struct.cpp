// 25. Create a structure Student containing fields for Roll No., Name, Class, Year and Total Marks. Create 10 students and store them in a file.

#include <iostream>
#include <string>
#include <fstream>
using namespace std;

struct student
{
protected:
    string a[20][5];
    int x, i, j;

public:
    student() { x = 0; }
    student(int x) { this->x = x + 1; }

    void inputs()
    {
        cout << "Enter Roll No., Name, Class, Year and Total Marks.\n";
        a[0][0] = "Roll No";
        a[0][1] = "Name";
        a[0][2] = "Class";
        a[0][3] = "Year";
        a[0][4] = "Total Marks";
        for (j = 1; j < x; j++)
            for (i = 0; i < 5; i++)
                cin >> a[j][i];
    }
    void outs()
    {
        for (j = 0; j < x; j++)
        {
            for (i = 0; i < 5; i++)
                cout << a[j][i] << "\t\t";
            cout << endl;
        }
    }
    void outfs(string &fname)
    {
        ofstream f(fname);
        for (j = 0; j < x; j++)
        {
            for (i = 0; i < 5; i++)
                f << a[j][i] << "\t\t";
            f << endl;
        }
    }
};
int main()
{
    int i, j, x;
    student a(10);
    a.inputs();
    string s = "Studata.txt";
    a.outs();
    a.outfs(s);
    return 0;
}