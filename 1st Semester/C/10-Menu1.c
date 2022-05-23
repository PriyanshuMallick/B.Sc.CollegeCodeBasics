#include <stdio.h>

void even(int a[], int n)
{
    int i;
    printf("Even nos. are ");
    for (i = 0; i < n; i++)
    {
        if (a[i] % 2 == 0)
            printf("%d, ", a[i]);
    }
}
void odd(int a[], int n)
{
    int i;
    printf("Odd nos. are");
    for (i = 0; i < n; i++)
    {
        if (a[i] % 2 == 1)
            printf("%d ", a[i]);
    }
}
void sumavg(int a[], int n)
{
    int i, sum = 0;
    float avg;
    for (i = 0; i < n; i++)
        sum += a[i];
    avg = sum / n;
    printf("Sum = %d\nAverage = %f", sum, avg);
}
void maxmin(int a[], int n)
{
    int i, max, min;
    for (max = min = a[0], i = 1; i < n; i++)
    {
        if (max < a[i])
            max = a[i];
        if (min > a[i])
            min = a[i];
    }
    printf("Max = %d\nMin = %d\n", max, min);
}
void removedup(int a[], int n)
{
    int i, j, k;
    printf("\nArray elements after deleting duplicates : ");
    for (j = 0; j < n; j++)
    {
        for (i = j + 1; i < n; i++)
            if (a[j] == a[i])
            {
                for (k = i; k < n - 1; k++)
                    a[k] = a[k + 1];
                n--;
                i--;
            }
        printf("%d", a[j]);
    }
}
void reva(int a[], int n)
{
    int i;
    for (i = n - 1; i >= 0; i--)
        printf("%d ", a[i]);
}

int main()
{
    int const n = 0;
    int option, i;
    printf("Enter 1 to Print the even-valued elements.\n");
    printf("Enter 2 to Print the odd-valued elements\n");
    printf("Enter 3 to Calculate and print the sum and average of the elements of array\n");
    printf("Enter 4 to Print the maximum and minimum element of array\n");
    printf("Enter 5 to Remove the duplicates from the array\n");
    printf("Enter 6 to Print the array in reverse order\n");
    printf("Enter any other key to exit\n");
    scanf("%d", &option);

    printf("Enter the amount of numbers you want to input\n");
    scanf("%d", &n);
    printf("%d", n);
    int a[n];
    for (i = 0; i < n; i++)
        scanf("%d", &a[i]);

    if (option == 1)
        even(a, n);
    else if (option == 2)
        odd(a, n);
    else if (option == 3)
        sumavg(a, n);
    else if (option == 4)
        maxmin(a, n);
    else if (option == 5)
        removedup(a, n);
    else if (option == 6)
        reva(a, n);
    return 0;
}
