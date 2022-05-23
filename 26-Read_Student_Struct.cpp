// 26. Write a program to retrieve the student information from file created in previous question and print it in following format : Roll No.Name Marks

#include <iostream>
#include <fstream>
using namespace std;

struct student
{
    string name;
    int rno, cls, year, mark;
};

void input(student s[], int n)
{
    ifstream fin;
    fin.open("student.txt");
    for (int i = 0; i < n; i++)
        fin >> s[i].rno >> s[i].name >> s[i].cls >> s[i].year >> s[i].mark;
    fin.close();
}

void output(student s[], int n)
{
    for (int i = 0; i < n; i++)
        cout << s[i].rno << "\t" << s[i].name << "\t" << s[i].mark << endl;
}

int main()
{
    cout << "The details of student are " << endl;
    cout << "Roll no.\tName\tMarks" << endl;
    student s[10];
    input(s, 10);
    output(s, 10);
    return 0;
}