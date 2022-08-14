/*21. Create Matrix class using templates. Write a menu-driven program to perform following Matrix operations (2-D array implementation):
i) Sum ii) Difference iii) Product iv) Transpose*/

#include <iostream>
using namespace std;
class matrix
{
private:
    int a[10][10], r, c;

public:
    ~matrix() {}
    matrix() { r = c = 0; }
    matrix(int r) { this->r = c = r; }
    matrix(int r, int c)
    {
        this->r = r;
        this->c = c;
    }

    void inputm()
    {
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                cin >> a[i][j];
    }

    void printm()
    {
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
                cout << a[i][j] << "  ";
            cout << endl;
        }
        cout << endl;
    }

    matrix add(matrix x)
    {
        if (r == x.r && c == x.c)
        {
            matrix m(r, c);
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    m.a[i][j] = a[i][j] + x.a[i][j];
            return m;
        }
        else
        {
            matrix m;
            return m;
        }
    }
    matrix subtract(matrix x)
    {
        if (r == x.r && c == x.c)
        {
            matrix m(r, c);
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    m.a[i][j] = a[i][j] - x.a[i][j];
            return m;
        }
        else
        {
            matrix m;
            return m;
        }
    }
    matrix multiply(matrix x)
    {
        if (c == x.r)
        {
            matrix m(r, x.c);
            for (int i = 0; i < r; i++)
                for (int j = 0; j < x.c; j++)
                    m.a[i][j] = 0;
            for (int i = 0; i < r; i++)
                for (int j = 0; j < x.c; j++)
                    for (int k = 0; k < x.c; k++)
                        m.a[i][j] += a[i][k] * x.a[k][j];
            return m;
        }
        else
        {
            matrix m;
            return m;
        }
    }
    matrix transpose()
    {
        matrix m(r, c);
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m.a[j][i] = a[i][j];
        return m;
    }
};
main()
{
    int option;
    matrix a(2), b(2);
    cout << "Enter the 1st matrix\n";
    a.inputm();
    cout << "Enter the 2nd matrix\n";
    b.inputm();
    cout << "Your 1st and 2nd matrix are\n";
    a.printm();
    b.printm();

    cout << "To add the matrices enter 1\n";
    cout << "To subtract the matrices enter 2\n";
    cout << "To multiply the matrices enter 3\n";
    cout << "To tranpose the matrices enter 4\n";
    cout << "Enter anything to exit\n";
    cin >> option;

    if (option == 1)

    {
        cout << "Result of adding two matrices\n";
        a.add(b).printm();
    }
    else if (option == 2)
    {
        cout << "Result of subtracting two matrices\n";
        a.subtract(b).printm();
    }
    else if (option == 3)
    {
        cout << "Result of multiplication of two matrices\n";
        a.multiply(b).printm();
    }
    else if (option == 4)
    {
        cout << "Transpose of two matrices\n";
        a.transpose().printm();
        b.transpose().printm();
    }
    else
        cout << "exiting program" << endl;

    return 0;
}