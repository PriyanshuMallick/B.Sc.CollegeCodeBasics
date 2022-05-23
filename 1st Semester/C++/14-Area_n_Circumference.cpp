// 14. A program which takes the radius of a circle as input from the user, passes it to another function that computes the area and the circumference of the circle and displays the value of area and circumference from the main() function

#include <iostream>
#include <math.h>
using namespace std;
void A(float r, float &area, float &cir)
{
    area = (M_PI * r * r);
    cir = (M_PI * 2 * r);
}

int main()
{
    float radius, a, c;
    cout << "Enter Radius of a Circle\n";
    cin >> radius;
    A(radius, a, c);
    cout << "Area : " << a << endl;
    cout << "Circumference : " << c << endl;
    return 0;
}
