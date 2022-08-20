// 13. Write a program in which a function is passed address of two variables and then alter its contents.

#include <iostream>

using namespace std;

void alter(int &x, int &y)
{
    int temp = x;
    x = y;
    y = temp;
}

int main()
{
    int a = 0;
    int b = 1;
    cout << "Before alter()\n";
    cout << "A = " << a << endl;
    cout << "B = " << b << endl;

    alter(a, b);

    cout << "After alter()\n";
    cout << "A = " << a << endl;
    cout << "B = " << b << endl;

    return 0;
}
