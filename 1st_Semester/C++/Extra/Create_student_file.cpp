/* Write an interactive C/C++ program to create a file containing student’s records and also give a provision to update/modify the records too*/

#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main()
{
    // student();
    int n, i, j, sl;
    cout << "\n How many enties do you want?" << endl;
    cin >> n;
    n++;
    string name, sub, mark, a[n][4];
    a[0][0] = "L. No.";
    a[0][1] = "Name";
    a[0][2] = "Subject";
    a[0][3] = "Marks";

    for (i = 1; i < n; i++)
    {
        cout << "\nEnter student name, subject and marks" << endl;
        cin >> name >> sub >> mark;
        sl = i;
        a[i][0] = to_string(sl);
        a[i][1] = name;
        a[i][2] = sub;
        a[i][3] = mark;
    }
    cout << endl;
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < 4; j++)
            cout << a[i][j] << "\t";
        cout << endl;
    }
    int option, mi, mj;
    while (1)
    {
        cout << "Enter 1 to update/modify the file" << endl;
        // cout << "Enter 2 to view the output file" << endl;
        cout << "Enter any other no. to exit the program" << endl;
        cin >> option;

        if (option == 1)
        {
            cout << "Which line do you want to modify?" << endl;
            cin >> mi;
            cout << "Enter 1 to modify the name" << endl;
            cout << "Enter 2 to modify the subject" << endl;
            cout << "Enter 3 to modify the mark" << endl;
            cin >> mj;
            if (mj == 1 || mj == 2 || mj == 3)
            {
                cout << "Enter your modifications" << endl;
                cin >> a[mi][mj];
            }
            for (i = 0; i < n; i++)
            {
                for (j = 0; j < 4; j++)
                    cout << a[i][j] << "\t";
                cout << endl;
            }
        }
        else
            break;
    }
    ofstream fstudent("studata.txt");

    for (i = 0; i < n; i++)
    {
        for (j = 0; j < 4; j++)
            fstudent << a[i][j] << "\t";
        fstudent << endl;
    }

    return 0;
}