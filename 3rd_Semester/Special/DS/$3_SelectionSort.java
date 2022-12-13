// 3. Write a program using templates to sort a list of elements using 
// selection sort.

import java.util.Random;

public class $3_SelectionSort {

    private static <T extends Comparable<T>> void selectionSort(T list[]) {
        int len = list.length;

        for (int i = 0; i < len; i++)
            for (int j = i + 1; j < len; j++)
                if (list[i].compareTo(list[j]) > 0) {
                    T tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
    }

    public static void main(String[] args) {
        Random rand = new Random();

        Integer list[] = new Integer[10];

        for (int i = 0; i < 10; i++)
            list[i] = rand.nextInt(100);

        System.out.println("Unsorted list: ");
        printList(list);

        selectionSort(list);
        printList(list);
    }

    public static <T extends Comparable<T>> void printList(T list[]) {
        int i;
        for (i = 0; i < list.length - 1; i++)
            System.out.print(list[i] + " -> ");
        System.out.print(list[i] + "\n");
    }
}
