/*24. Create a class Box containing length, breath and height. Include following methods in it:
i) Calculate surface Area
ii) Calculate Volume
iii) Increment, Overload ++ operator (both prefix & postfix)
iv) Decrement, Overload -- operator (both prefix & postfix)
v) Overload operator == (to check equality of two boxes), as a friend function
vi) Overload Assignment operator
vii) Check if it is a Cube or cuboid
 Write a program which takes input from the user for length, breath and height to test the
 above class.*/

#include <iostream>

class box
{
protected:
    int l, b, h;

public:
    ~box() {}
    box() { l = b = h = 0; }
    box(int l)
    {
        this->l = l;
        b = h = 0;
    }
    box(int l, int b)
    {
        this->l = l;
        this->b = b;
        h = 0;
    }
    box(int l, int b, int h)
    {
        this->l = l;
        this->b = b;
        this->h = h;
    }

    float sarea(box x)
    {
    }
};