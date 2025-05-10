import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        Scanner scanner = new Scanner (System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
    }
}
