import java.util.Scanner;

// 1. Write a program to search an element from a list. Give user the option to perform 
// Linear or Binary search. Use Template functions.

public class $1_LinearOrBinarySearch {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int list[] = new int[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = i + 1;
        }
        // boolean run = true;

        while (true) {
            System.out.println("Do you want to run linear or binary search?");
            System.out.println("Press 1 for linear search");
            System.out.println("Press 2 for binary search");
            System.out.println("Press any other key to quit");
            int option = cin.nextInt();

            if (option != 1 && option != 2)
                break;

            System.out.println("Enter the number do you want to search");
            int num = cin.nextInt();

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

    private static int linearSearch(int list[], int num) {
        for (int pos = 0; pos < list.length; pos++) {
            if (list[pos] == num)
                return pos + 1;
        }

        return -1;
    }

    private static int binarySearch(int list[], int num) {
        int low = 0, high = list.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (num == list[mid]) {
                return mid + 1;
            } else if (num > list[mid]) {
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

    public static void printList(int list[]) {
        int i;
        for (i = 0; i < list.length - 1; i++)
            System.out.print(list[i] + " -> ");
        System.out.print(list[i] + "\n");
    }
}