import java.util.Scanner;
public class Assigment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Available Currency: \"RUB\",\"USD\",\"EUR\",\"GBP\",\"JPY\"\n");
        System.out.print("Write the amount: ");
        double inCA = scanner.nextDouble();
        System.out.print("Write the source currency: ");
        String inCT = scanner.next();
        System.out.print("Write the write the target currency: ");
        String outCT = scanner.next();
        double CER = 1;
        double outCA;
        String CS;
        switch (inCT) {
            case "RUB":CER = 0.01111;break;
            case "USD":CER = 1;break;
            case "EUR":CER = 1.1392;break;
            case "GBP":CER = 1.33;break;
            case "JPY":CER = 0.0071;break;
            default:
                throw new AssertionError();
        }
        inCA = inCA * CER;
        switch (outCT) {
            case "RUB":CER = 82.17;CS = "₽";break;
            case "USD":CER = 1;CS = "$";break;
            case "EUR":CER = 0.877745;CS = "€";break;
            case "GBP":CER = 0.74651;CS = "£";break;
            case "JPY":CER = 140.583;CS = "¥";break;
            default: throw new AssertionError();
        }
        // switch (inCT) {
        //     case "RUB" -> {
        //         switch (outCT) {
        //             case "RUB":CER = 1;CS = "₽";break;
        //             case "USD":CER = 0.01111;CS = "$";break;
        //             case "EUR":CER = 0.01067;CS = "€";break;
        //             case "GBP":CER = 0.00923187;CS = "£";break;
        //             case "JPY":CER = 1.73605797;CS = "¥";break;
        //             default: throw new AssertionError();
        //         }
        //     }
        //     case "USD" -> {
        //         switch (outCT) {
        //             case "RUB":CER = 82.17;CS = "₽";break;
        //             case "USD":CER = 1;CS = "$";break;
        //             case "EUR":CER = 0.877745;CS = "€";break;
        //             case "GBP":CER = 0.74651;CS = "£";break;
        //             case "JPY":CER = 140.583;CS = "¥";break;
        //             default: throw new AssertionError();
        //         }
        //     }
        //     case "EUR" -> {
        //         switch (outCT) {
        //             case "RUB":CER = 93.54;CS = "₽";break;
        //             case "USD":CER = 1.1392;CS = "$";break;
        //             case "EUR":CER = 1;CS = "€";break;
        //             case "GBP":CER = 0.8656;CS = "£";break;
        //             case "JPY":CER = 161.969;CS = "¥";break;
        //             default: throw new AssertionError();
        //         }
        //     }
        //     case "GBP" -> {
        //         switch (outCT) {
        //             case "RUB":CER = 108.5;CS = "₽";break;
        //             case "USD":CER = 1.33;CS = "$";break;
        //             case "EUR":CER = 1.17;CS = "€";break;
        //             case "GBP":CER = 1;CS = "£";break;
        //             case "JPY":CER = 189.09;CS = "¥";break;
        //             default: throw new AssertionError();
        //         }
        //     }
        //     case "JPY" -> {
        //         switch (outCT) {
        //             case "RUB":CER = 0.5754;CS = "₽";break;
        //             case "USD":CER = 0.0071;CS = "$";break;
        //             case "EUR":CER = 0.0062;CS = "€";break;
        //             case "GBP":CER = 0.0053;CS = "£";break;
        //             case "JPY":CER = 1;CS = "¥";break;
        //             default: throw new AssertionError();
        //         }
        //     }
        //     default -> throw new AssertionError();
        // }
        outCA = inCA *CER;
        System.out.println("Converted amount from "+inCT+" to "+outCT+" : "+outCA+CS);

    }
}
