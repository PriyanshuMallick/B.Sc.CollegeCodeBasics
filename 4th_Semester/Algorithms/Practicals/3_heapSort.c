// 3. Implement Heap Sort(The program should report the number of comparisons)

// Test run the algorithm on 100 different inputs of sizes varying from 30 to 1000.
// Count the number of comparisons and draw the graph. Compare it with a graph of nlogn.

#include <stdio.h>

// Function Prototypes
void printarr(int arr[], int len);
void swap(int *a, int *b);
void heapSort(int arr[], int len);
void heapify(int arr[], int len, int i);

// Global Variables
int comparisons = 0;

int main()
{
    int testSize = 1;
    int arrSize = 0;

    for (int i = 0; i < testSize; i++)
    {
        arrSize += 10;
        int arr[arrSize];

        for (int j = 0; j < arrSize; j++)
        {
            arr[j] = arrSize - j;
        }

        printf("Unsorted:\n");
        printarr(arr, arrSize);

        heapSort(arr, arrSize);

        printf("Sorted:\n");
        printarr(arr, arrSize);

        printf("Comparisons: %d\n", comparisons);
        // printf("%d:\tArray Size: %d\t\tNo. of comparisons: %d\n", i + 1, arrSize, comparisons);
    }

    return 0;
}

void heapSort(int arr[], int len)
{
    comparisons = 0;

    for (int i = len / 2 - 1; i >= 0; i--)
    {
        heapify(arr, len, i);
    }

    for (int i = len - 1; i >= 0; i--)
    {
        swap(&arr[0], &arr[i]);
        heapify(arr, i, 0);
    }
}

void heapify(int arr[], int len, int i)
{
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if (left < len && arr[left] > arr[largest])
    {
        largest = left;
        comparisons++;
    }

    if (right < len && arr[right] > arr[largest])
    {
        largest = right;
        comparisons++;
    }

    if (largest != i)
    {
        swap(&arr[i], &arr[largest]);
        heapify(arr, len, largest);
    }
}

void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
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