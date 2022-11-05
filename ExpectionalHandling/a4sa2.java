package ExpectionalHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a4sa2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the number of customers: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        SavingAccount[] sa = new SavingAccount[n];
        for (int i = 0; i < n; i++) {
            sa[i] = new SavingAccount();
            sa[i].accept();
        }
        int no = 0;
        System.out.println("Enter the customer Number");
        no = Integer.parseInt(br.readLine());
        no--;
        int ch = 0;
        while (ch != 4) {
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. View Balance");
            System.out.println("4. Quit");
            System.out.println("Select Any Option:");
            ch = Integer.parseInt(br.readLine());
            switch (ch) {
                case 1:
                    sa[no].withdraw();
                    break;
                case 2:
                    sa[no].deposit();
                    break;
                case 3:
                    sa[no].viewBalance();
                    break;
            }
        }


    }


}
