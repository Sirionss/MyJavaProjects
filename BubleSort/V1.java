import java.util.Arrays;
public class V1 {
    public static void main(String[] args) {
        
        int[] integers = {5,3,5,7,12,3,55,73,2};
        System.out.println("Unsorted array: " + Arrays.toString(integers));
        bubbleSortAsc(integers);
        System.out.println("Sorted ascended array: " + Arrays.toString(integers));   
        bubbleSortDes(integers);
        System.out.println("Sorted descended array: " + Arrays.toString(integers));   
    }
    public static void bubbleSortAsc(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void bubbleSortDes(int[] arr) {
        int size = arr.length;

        for (int i = size; i > 0; i--) {
            for (int j = size - 1; (j > size - i - 1 && j != 0) ; j--) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
