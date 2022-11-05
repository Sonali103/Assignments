package basicjavaassignment;

import java.util.Scanner;
public class Income
{
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);



        System.out.print("Enter age: ");

        int age = in.nextInt();

        System.out.print("Enter taxable income: ");

        double ti = in.nextDouble();

        double tax = 0.0;

        if (age > 60) {

            System.out.print("Wrong Category");

        }

        else {

            if (ti <= 250000)

                tax = 0;

            else if (ti <= 500000)

                tax = (ti - 160000) * 10 / 100;

            else if (ti <= 1000000)

                tax = 34000 + ((ti - 500000) * 20 / 100);

            else

                tax = 94000 + ((ti - 1000000) * 30 / 100);

        }



        System.out.println("Tax Payable: " + tax);

    }

}


