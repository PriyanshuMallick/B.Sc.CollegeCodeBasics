// 1. Implement Insertion Sort (The program should report the number of comparisons)

// Test run the algorithm on 100 different inputs of sizes varying from 30 to 1000.
// Count the number of comparisons and draw the graph. Compare it with a graph of nlogn.

#include <stdio.h>

// Funtion Prototypes
void insertionSort(int arr[], int len);
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

        insertionSort(arr, arrsize);

        // printf("Sorted:\n");
        // printarr(arr, arrsize);

        // printf("Comparisons: %d\n", comparisons);

        printf("%d:\tArray Size: %d\t\tNo. of comparisons: %d\n", i + 1, arrsize, comparisons);
    }
    return 0;
}

void insertionSort(int arr[], int len)
{
    comparisons = 0;

    for (int i = 1; i < len; i++)
    {
        int j;
        int key = arr[i];
        // comparisons++;
        for (j = i - 1; j >= 0 && arr[j] > key; j--, comparisons++)
        {
            arr[j + 1] = arr[j];
        }
        arr[j + 1] = key;
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