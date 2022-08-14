//12. A program that swaps two numbers using pointers.

#include <stdio.h>

void swap(int *a, int *b)
{
    int temp;
    temp = *a;
    *a = *b;
    *b = temp;
}

int main()
{
    int n1, n2;
    printf("Enter 2 nos.\n");
    scanf("%d%d", &n1, &n2);
    printf("Before Swapping the numbers we have: %d %d \n", n1, n2);
    swap(&n1, &n2);
    printf("After Swapping the numbers we have %d %d \n", n1, n2);
    return 0;
}