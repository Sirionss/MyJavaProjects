import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter year");
        int year = scanner.nextInt();
        if (year % 400 == 0 ) 
            System.out.println(year + " is leaf year");
        else if ((year%4==0) && (year%100!=0))
        	System.out.println(year + " is leaf year");
        else 
        	System.out.println(year + " is not a leaf year");
    }   
}
