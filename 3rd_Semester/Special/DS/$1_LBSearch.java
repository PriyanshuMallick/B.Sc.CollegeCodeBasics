// 1. Write a program to search an element from a list. Give user 
// the option to perform Linear or Binary search. Use Template functions. 

import java.util.Scanner;

public class $1_LBSearch {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        Integer list[] = new Integer[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = i + 1;
        }

        while (true) {
            System.out.println("Do you want to run linear or binary search?");
            System.out.println("Press 1 for linear search");
            System.out.println("Press 2 for binary search");
            System.out.println("Press any other key to quit");
            int option = cin.nextInt();

            if (option != 1 && option != 2)
                break;

            System.out.println("Enter the number do you want to search");
            Integer num = cin.nextInt();

            if (option == 1) {
                print(num, linearSearch(list, num));
                printList(list);
            }

            else if (option == 2) {
                print(num, binarySearch(list, num));
                printList(list);
            }

            System.out.println();
        }

        cin.close();
    }

    private static <T extends Comparable<T>> int linearSearch(T list[], T value) {
        for (int pos = 0; pos < list.length; pos++)
            if (list[pos].compareTo(value) == 0)
                return pos + 1;
        return -1;
    }

    private static <T extends Comparable<T>> int binarySearch(T list[], T value) {
        int low = 0, high = list.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (value.compareTo(list[mid]) == 0) {
                return mid + 1;
            } else if (value.compareTo(list[mid]) > 0) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return -1;
    }

    public static void print(int x, int pos) {
        if (pos == -1)
            System.out.println(x + " is not in the list");
        else
            System.out.println(x + " is in the list at position " + pos);
    }

    public static <T extends Comparable<T>> void printList(T list[]) {
        int i;
        for (i = 0; i < list.length - 1; i++)
            System.out.print(list[i] + " -> ");
        System.out.print(list[i] + "\n");
    }
}