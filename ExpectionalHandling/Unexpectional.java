package ExpectionalHandling;

import java.util.Scanner;

public class Unexpectional { public static void main(String[] args) {
    Scanner scanner=null;
    System.out.println("Main method start.. ");
    try {
        scanner = new Scanner(System.in);

        System.out.println("Enter the Dividend number");
        int dividend=scanner.nextInt();
        System.out.println("Enter the Divisior number: ");
        int divisior=scanner.nextInt();

        int result=dividend/divisior;

        System.out.println("Result is "+result);
        scanner.close();
    } catch (ArithmeticException ex) {
        throw new ArithmeticException("UnsupportedOperationException");
    }
    System.out.println("Main method ends.");
}
}
