import java.util.Arrays;
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = {8, 2, 6, 4, 9, 1};
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int size = arr.length;

        // loop through array size-1 times
        for (int i = 0; i < size - 1; i++) {
            // loop until end of unsorted elements
            for (int j = 0; j < size - i - 1; j++) {
                // swap left and right elements if left is greater
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}