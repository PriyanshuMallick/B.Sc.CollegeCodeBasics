// 2. Write a program using templates to sort a list of elements using 
// insertion sort. 

import java.util.Random;

public class $2_InsertionSort {
    private static <T extends Comparable<T>> void insertionSort(T list[]) {
        int len = list.length;
        T tmp;
        int j;
        for (int i = 1; i < len; ++i) {
            tmp = list[i];
            j = i - 1;
            while (j >= 0 && tmp.compareTo(list[j]) < 0) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = tmp;
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();

        Integer list[] = new Integer[10];

        for (int i = 0; i < 10; i++)
            list[i] = rand.nextInt(100);

        System.out.println("Unsorted list: ");
        printList(list);

        insertionSort(list);

        System.out.println("Sorted list: ");
        printList(list);
    }

    public static <T extends Comparable<T>> void printList(T list[]) {
        int i;
        for (i = 0; i < list.length - 1; i++)
            System.out.print(list[i] + " -> ");
        System.out.print(list[i] + "\n");
    }
}
