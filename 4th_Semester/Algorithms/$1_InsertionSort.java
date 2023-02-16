// 1. Implement Insertion Sort (The program should report the number of comparisons)

// Test run the algorithm on 100 different inputs of sizes varying from 30 to 1000.
// Count the number of comparisons and draw the graph. Compare it with a graph of nlogn.

public class $1_InsertionSort {
    private static int comparisons = 0;

    public static <T extends Comparable<T>> void insertionSort(T list[]) {
        for (int i = 1, len = list.length; i < len; i++) {
            int j;
            T tmp = list[i];
            // comparisons++;
            for (j = i - 1; j > -1 && tmp.compareTo(list[j]) < 0; j--, comparisons++) {
                list[j + 1] = list[j];
            }
            list[j + 1] = tmp;
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

            insertionSort(list);

            System.out.println(i + 1 + ":\tList Size: " + listSize + "\t\tNo. of comparisons: " + comparisons);

            // System.out.println("Sorted list: ");
            // printList(list);
        }
    }

    public static <T> void printList(T list[]) {
        int len = list.length;
        for (int i = 0; i < len - 1; i++)
            System.out.print(list[i] + " -> ");
        System.out.println(list[len - 1]);
    }
}