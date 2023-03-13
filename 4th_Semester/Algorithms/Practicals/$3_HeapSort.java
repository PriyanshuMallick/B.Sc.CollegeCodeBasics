package Practicals;
// 3. Implement Heap Sort(The program should report the number of comparisons)

public class $3_HeapSort {
    private static int comparisons = 0;

    private static <T extends Comparable<T>> void heapify(T[] list, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && list[left].compareTo(list[largest]) > 0) {
            largest = left;
            comparisons++;
        }

        if (right < n && list[right].compareTo(list[largest]) > 0) {
            largest = right;
            comparisons++;
        }

        if (largest != i) {
            T temp = list[i];
            list[i] = list[largest];
            list[largest] = temp;

            heapify(list, n, largest);
        }
    }

    public static <T extends Comparable<T>> void heapSort(T[] list) {
        int n = list.length;
        comparisons = 0;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            T temp = list[0];
            list[0] = list[i];
            list[i] = temp;

            heapify(list, i, 0);
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

            heapSort(list);

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
