#include <stdio.h>

// Funtion Prototypes
void insetionSort(int arr[], int len);
void printarr(int arr[], int len);

// Global Var
int comparisons = 0;

int main()
{
    int testSize = 100;
    int arrsize = 0;

    for (int i = 0; i < testSize; i++)
    {
        arrsize += 10;
        int arr[arrsize];

        for (int j = 0; j < arrsize; j++)
        {
            arr[j] = arrsize - j;
        }

        // printf("Unsorted:\n");
        // printarr(arr, arrsize);

        insetionSort(arr, arrsize);

        // printf("Sorted:\n");
        // printarr(arr, arrsize);

        // printf("Comparisons: %d\n", comparisons);

        printf("%d:\tArray Size: %d\t\tNo. of comparisons: %d\n", i + 1, arrsize, comparisons);
    }
    return 0;
}

void insetionSort(int arr[], int len)
{
    comparisons = 0;

    for (int i = 1; i < len; i++)
    {
        int j;
        int tmp = arr[i];
        // comparisons++;
        for (j = i - 1; j > -1 && arr[j] > tmp; j--, comparisons++)
        {
            arr[j + 1] = arr[j];
        }
        arr[j + 1] = tmp;
    }
}

void printarr(int arr[], int len)
{
    --len;
    for (int i = 0; i < len; i++)
    {
        printf("%d -> ", arr[i]);
    }
    printf("%d\n", arr[len]);
}