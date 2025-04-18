public class ex1 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 3;
        int c = a + b; // In java arithmetic operation result will be int if a and b were byte
        System.out.println("The sum = " + c);
        byte y = (byte)(a+b); // if we want the result of operation to be byte
        System.out.println("The sum = " + y);
    }
}
