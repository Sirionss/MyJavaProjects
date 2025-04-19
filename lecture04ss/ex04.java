import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter any number");
    int num = scanner.nextInt();
    if (num%2==0){
        System.out.println("Your number is even");
    }
    else{
        System.out.println("Your number is odd");
    }
    } 
}
