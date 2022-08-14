/*Write a C program to separate even and odd numbers of an array and put them in two arrays.*/

#include <stdio.h>

int main()
{
    int const n = 0;
    int i;

    printf("\nHow many no. do you want to take as input?\n");
    scanf("%d", &n);
    int a[n], o[n], e[n], x, oi = 0, ei = 0;
    printf("Enter %d nos.\n", n);
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    for (i = 0; i < n; i++)
    {
        x = a[i];
        if (x % 2 == 0)
        {

            e[ei] = a[i];
            ei++;
        }
        else
        {
            o[oi] = a[i];
            oi++;
        }
    }
    printf("\nEven nos. are =");
    for (i = 0; i < oi; i++)
    {
        printf("%d ", o[i]);
    }
    printf("\nOdd nos. are =");

    for (i = 0; i < ei; i++)
    {
        printf("%d ", e[i]);
    }

    printf("\nclosing...\n");
    return 0;
}