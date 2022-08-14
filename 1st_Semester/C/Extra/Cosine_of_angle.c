/*Compute the cosine of angle*/
/*FOMULA:
    T(1) = 1
    T(n) = (-1*T(n-1)*x^2)/((2*n-2) * (2*n-3))
    [T(n)]>0.00001 {To have accuracy upto 5 decimal point}
*/
#define _USE_MATH_DEFINES
#include <stdio.h>
#include <math.h>

int main()
{
    double rad, result = 0, term = 1;
    int n = 2;
    printf("Enter the angle in degree\n");
    scanf("%d", &rad);
    rad = rad * M_PI / 180;

    while (fabs(term > 0.00001))
    {
        result = result + term;
        term = 1 * term * rad * rad / ((2 * n - 2) * (2 * n - 3));
        n++;
    }
    printf("The value of cosine is %d", result);
    return 0;
}
