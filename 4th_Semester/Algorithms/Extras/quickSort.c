#include <stdio.h>

// Prototypes
void swap(int *a, int *b);
void printArr(int arr[], int arrSize);
int partition(int arr[], int low, int high);
void quickSort(int arr[], int low, int high);

int main()
{
    printf("Starting...\n");

    int arrSize = 10;
    int arr[arrSize];

    // Filling up the array in desending order
    for (int i = 0; i < arrSize; i++)
    {
        arr[i] = arrSize - i;
    }

    printf("\nBefore Sort...\n");
    printArr(arr, arrSize);

    quickSort(arr, 0, arrSize - 1);

    printf("\nAfter Sort...\n");
    printArr(arr, arrSize);

    printf("\nStoping...\n");
    return 0;
}

int partition(int arr[], int low, int high)
{
    int pivot = arr[high];
    int i = low;

    for (int j = low; j < high; j++)
    {
        if (arr[j] < pivot)
        {
            swap(&arr[j], &arr[i]);
            i++;
        }
    }
    swap(&arr[i], &arr[high]);
    return i;
}

void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {
        int pIndex = partition(arr, low, high);

        quickSort(arr, low, pIndex - 1);
        quickSort(arr, pIndex + 1, high);
    }
}

void swap(int *a, int *b)
{
    int tmp = *a;
    *a = *b;
    *b = tmp;
}

void printArr(int arr[], int arrSize)
{
    for (int i = 0; i < arrSize - 1; i++)
    {
        printf("%d -> ", arr[i]);
    }
    printf("%d\n", arr[arrSize - 1]);
}