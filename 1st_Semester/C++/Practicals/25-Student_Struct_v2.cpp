// 25. Create a structure Student containing fields for Roll No., Name, Class, Year and Total Marks. Create 10 students and store them in a file.

#include <iostream>
#include <string>
#include <fstream>
using namespace std;

struct student
{
    string name;
    int rno, cls, year, mark;
};

int main()
{
    student s[10];
    ofstream fout;
    fout.open("student.txt");
    for (int i = 0; i < 10; i++)
    {
        cout << "Enter the roll no., name, class, year and total marks of student " << i + 1 << endl;
        cin >> s[i].rno >> s[i].name >> s[i].cls >> s[i].year >> s[i].mark;
        fout << s[i].rno << "\t" << s[i].name << "\t" << s[i].cls << "\t" << s[i].year << "\t" << s[i].mark << endl;
    }
    fout.close();
    ifstream fin;
    fin.open("student.txt");
    for (int i = 0; i < 10; i++)
    {
        fin >> s[i].rno >> s[i].name >> s[i].cls >> s[i].year >> s[i].mark;
        cout << "Details of student no. " << i + 1 << endl;
        cout << "Roll no. " << s[i].rno << endl;
        cout << "Name " << s[i].name << endl;
        cout << "Class " << s[i].cls << endl;
        cout << "Year " << s[i].year << endl;
        cout << "Total Marks" << s[i].mark << endl;
    }
    fin.close();
    return 0;
}