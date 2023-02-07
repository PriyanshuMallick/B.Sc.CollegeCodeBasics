// 2. Implement Merge Sort(The program should report the number of comparisons)

// Test run the algorithm on 100 different inputs of sizes varying from 30 to 1000.
// Count the number of comparisons and draw the graph. Compare it with a graph of nlogn.

import java.util.Arrays;

public class $2_MergeSort {
    private static int comparisons = 0;

    public static <T extends Comparable<T>> void mergeSort(T[] list, int left, int right) {

        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(list, left, mid);
            mergeSort(list, mid + 1, right);
            merge(list, left, mid, right);
        }
    }

    private static <T extends Comparable<T>> void merge(T[] list, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        // Copying list
        T[] leftList = Arrays.copyOfRange(list, left, mid + 1);
        T[] rightList = Arrays.copyOfRange(list, mid + 1, right + 1);

        // Comparing and Merging
        int i = 0, j = 0, k = left;

        while (i < leftSize && j < rightSize) {
            comparisons++;
            if (leftList[i].compareTo(rightList[j]) <= 0) {
                list[k] = leftList[i];
                i++;
            } else {
                list[k] = rightList[j];
                j++;
            }
            k++;
        }

        // Appending the rest of the array/list
        while (i < leftSize) {
            list[k] = leftList[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            list[k] = rightList[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int testSize = 100;
        int listSize = 0;

        for (int i = 0; i < testSize; i++) {
            listSize += 10;
            Integer[] list = new Integer[listSize];

            for (int j = 0; j < listSize; j++)
                list[j] = listSize - j;

            // System.out.println("Unsorted list: ");
            // printList(list);

            mergeSort(list, 0, list.length - 1);

            System.out.println(i + 1 + ":\tList Size: " + listSize + "\t\tNo. of comparisons: " + comparisons);

            // System.out.println("Sorted list: ");
            // printList(list);
        }
    }
}
