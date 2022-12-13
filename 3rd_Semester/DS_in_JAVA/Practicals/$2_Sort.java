// 2. Write a program using templates to sort a list of elements. Give user the option to 
// perform sorting using Insertion sort, Bubble sort or Selection sort.

import java.util.Random;
import java.util.Scanner;

public class $2_Sort {
    private static <T extends Comparable<T>> void swap(T list[], int index1, int index2) {
        T tmp = list[index1];
        list[index1] = list[index2];
        list[index2] = tmp;
    }

    private static <T extends Comparable<T>> void bubbleSort(T list[]) {
        int len = list.length;

        for (int i = 0; i < len; i++)
            for (int j = 0; j < len - i - 1; j++)
                if (list[j].compareTo(list[j + 1]) > 0)
                    swap(list, j, j + 1);

    }

    private static <T extends Comparable<T>> void selectionSort(T list[]) {
        int len = list.length;

        for (int i = 0; i < len; i++)
            for (int j = i + 1; j < len; j++)
                if (list[i].compareTo(list[j]) > 0)
                    swap(list, i, j);
    }

    private static <T extends Comparable<T>> void insertionSort(T list[]) {
        int len = list.length;
        T tmp;
        int j;

        for (int i = 1; i < len; i++) {
            tmp = list[i];
            j = i - 1;
            while (list[i].compareTo(list[j]) < 0) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Random rand = new Random();

        // list[] = { 92, 5, 7, 22, 51, 23, 2, 0 };

        Integer list[] = new Integer[10];

        for (int i = 0; i < 10; i++)
            list[i] = rand.nextInt(100);

        System.out.println("Unsorted list: ");
        printList(list);

        while (true) {
            System.out.println("What sorting algorithm do you want to use?");
            System.out.println("For Bubble Sort,  Press 1");
            System.out.println("For Selection Sort,  Press 2");
            System.out.println("For Insertion Sort,  Press 3");
            System.out.println("For Exiting,  Press Anything");

            int option = cin.nextInt();

            if (option == 1) {
                bubbleSort(list);
                printList(list);
            }

            else if (option == 2) {
                selectionSort(list);
                printList(list);
            }

            else if (option == 3) {
                insertionSort(list);
                printList(list);
            }

            else
                break;

            System.out.println();

        }

        cin.close();

    }

    public static <T extends Comparable<T>> void printList(T list[]) {
        int i;
        for (i = 0; i < list.length - 1; i++)
            System.out.print(list[i] + " -> ");
        System.out.print(list[i] + "\n");
    }

}
