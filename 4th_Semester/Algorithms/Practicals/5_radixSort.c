// 5. Implement Radix Sort

#include <stdio.h>

// Function Prototypes
void radixSort(int arr[], int arrLen);
void countSort(int arr[], int arrLen, int exp);
int getMax(int arr[], int arrLen);
void printArr(int arr[], int arrSize);

int main()
{
    printf("Starting...\n");

    int arrLen = 10;
    int arr[arrLen];

    for (int i = 0; i < arrLen; i++)
    {
        arr[i] = arrLen - i;
    }

    printf("\nBefore Sort...\n");
    printArr(arr, arrLen);

    radixSort(arr, arrLen);

    printf("\nAfter Sort...\n");
    printArr(arr, arrLen);

    printf("\nStoping...\n");
    return 0;
}

int getMax(int arr[], int arrLen)
{
    int max = arr[0];

    for (int i = 1; i < arrLen; i++)
    {
        if (arr[i] > max)
        {
            max = arr[i];
        }
    }

    return max;
}

void countSort(int arr[], int arrLen, int exp)
{
    int output[arrLen];
    int count[10] = {0};

    for (int i = 0; i < arrLen; i++)
    {
        count[(arr[i] / exp) % 10]++;
    }

    for (int i = 1; i < 10; i++)
    {
        count[i] += count[i - 1];
    }

    for (int i = arrLen - 1; i >= 0; i--)
    {
        output[count[(arr[i] / exp) % 10] - 1] = arr[i];
        count[(arr[i] / exp) % 10]--;
    }

    for (int i = 0; i < arrLen; i++)
    {
        arr[i] = output[i];
    }
}

void radixSort(int arr[], int arrLen)
{
    int max = getMax(arr, arrLen);

    for (int exp = 1; max / exp > 0; exp *= 10)
    {
        countSort(arr, arrLen, exp);
    }
}

void printArr(int arr[], int arrSize)
{
    for (int i = 0; i < arrSize - 1; i++)
    {
        printf("%d -> ", arr[i]);
    }
    printf("%d\n", arr[arrSize - 1]);
}