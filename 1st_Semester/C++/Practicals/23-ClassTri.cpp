// 23. Create a class Triangle. Include overloaded functions for calculating area. Overload assignment operator and equality operator.

#include <iostream>
#include <math.h>
using namespace std;

class triangle
{
protected:
    int a, b, c;

public:
    void input()
    {
        cout << "Enter the sides of the triangle" << endl;
        cin >> a >> b >> c;
    }
    void output()
    {
        cout << "Sides of the triangle are " << a << " " << b << " " << c << endl;
    }

    float area()
    {
        float s = (a + b + c) / 2, x;
        x = sqrt(s * (s - a) * (s - b) * (s - c));
        return x;
    }

    triangle operator=(triangle t)
    {
        a = t.a;
        b = t.b;
        c = t.c;
        return *this;
    }
    bool operator==(triangle t)
    {
        if (a == t.a && b == t.b && c == t.c)
            return true;
        else if (b == t.a && c == t.b && a == t.c)
            return true;
        else if (c == t.a && a == t.b && b == t.c)
            return true;
        else if (a == t.a && c == t.b && b == t.c)
            return true;
        else if (c == t.a && b == t.b && a == t.c)
            return true;
        else if (b == t.a && a == t.b && c == t.c)
            return true;
        else
            return false;
    }
};
int main()
{
    triangle t1, t2;
    t1.input();
    t2.input();
    t1.output();
    t2.output();
    cout << "Area of t1 is " << t1.area() << endl;
    cout << "Area of t2 is " << t2.area() << endl;
    if (t1 == t2)
        cout << "t1 and t2 are equal" << endl;
    else
        cout << "t1 and t2 are not equal" << endl;
    return 0;
}