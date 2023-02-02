// 1. Implement Insertion Sort (The program should report the number of
// comparisons)

import java.util.Random;

public class $1_InsertionSort {
    public static <T extends Comparable<T>> int insertionSort(T list[]) {
        int comparisons = 0;
        for (int i = 1, len = list.length; i < len; i++) {
            int j;
            T tmp = list[i];
            comparisons++;
            for (j = i - 1; j > -1 && tmp.compareTo(list[j]) < 0; j--, comparisons++) {
                list[j + 1] = list[j];
            }
            list[j + 1] = tmp;
        }
        return comparisons;
    }

    public static void main(String[] args) {
        // Random rand = new Random();
        int testSize = 100;
        int listSize = 0;

        for (int i = 0; i < testSize; i++) {
            listSize += 10;
            Integer[] list = new Integer[listSize];

            for (int j = 0; j < listSize; j++)
                list[j] = listSize - j;
            // list[j] = rand.nextInt(100);

            // System.out.println("Unsorted list: ");
            // printList(list);

            int comparisons = insertionSort(list);

            System.out.println(i + 1 + ":\tList Size: " + listSize + "\t\tNo. of comparisons: " + comparisons);
            // System.out.println("List Size ^ 2: " + listSize * listSize);

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