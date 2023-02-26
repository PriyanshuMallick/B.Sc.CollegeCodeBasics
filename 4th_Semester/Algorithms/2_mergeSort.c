#include <stdio.h>

// Prototypes
void mergeSort(int arr[], int left, int right);
void merge(int arr[], int left, int mid, int right);
void copyArr(int arr[], int nArr[], int startIndex, int endIndex);
void printarr(int arr[], int len);

// Global Var
int comparisons = 0;

int main()
{
    int testSize = 100;
    int arrSize = 0;

    for (int i = 0; i < testSize; i++)
    {
        arrSize += 10;
        int arr[arrSize];

        for (int j = 0; j < arrSize; j++)
        {
            arr[j] = arrSize - j;
        }

        // printf("Unsorted:\n");
        // printarr(arr, arrSize);

        mergeSort(arr, 0, arrSize - 1);

        // printf("Sorted:\n");
        // printarr(arr, arrSize);

        // printf("Comparisons: %d\n", comparisons);
        printf("%d:\tArray Size: %d\t\tNo. of comparisons: %d\n", i + 1, arrSize, comparisons);
    }

    return 0;
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

void mergeSort(int arr[], int left, int right)
{
    if (left < right)
    {
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
}

void merge(int arr[], int left, int mid, int right)
{
    int leftSize = mid - left + 1;
    int rightSize = right - mid;

    // Copying Array
    int leftArr[leftSize], rightArr[rightSize];

    copyArr(arr, leftArr, left, mid + 1);
    copyArr(arr, rightArr, mid + 1, right + 1);

    // Comparing and Merging
    int i = 0, j = 0, k = left;

    while (i < leftSize && j < rightSize)
    {
        comparisons++;
        if (leftArr[i] <= rightArr[j])
        {
            arr[k] = leftArr[i];
            i++;
        }
        else
        {
            arr[k] = rightArr[j];
            j++;
        }
        k++;
    }

    // Appending the remaining elements
    while (i < leftSize)
    {
        arr[k] = leftArr[i];
        i++;
        k++;
    }

    while (j < rightSize)
    {
        arr[k] = rightArr[j];
        j++;
        k++;
    }
}

void copyArr(int arr[], int nArr[], int startIndex, int endIndex)
{
    for (int i = startIndex, j = 0; i < endIndex; i++, j++)
    {
        nArr[j] = arr[i];
    }
}