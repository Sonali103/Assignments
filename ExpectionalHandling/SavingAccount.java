package ExpectionalHandling;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.naming.InsufficientResourcesException;

public class SavingAccount {
    int acNo;
    String name;
    double balance;
    public SavingAccount(){
        acNo=0;
        name=null;
        balance=500.0;
    }
    public void accept()throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the account number, name, and balance for the customer: ");
        acNo=Integer.parseInt(br.readLine());
        name=br.readLine();
        balance=Double.parseDouble(br.readLine());

    }
    public void withdraw() throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the amount you want to withdraw: ");
        double wamt=Double.parseDouble(br.readLine());
        try{
            double bal=balance; bal=bal-wamt;
            if(bal<500)
                throw new InsufficientResourcesException("Insufficient Balance");
            balance=balance-wamt;
            System.out.println("Withdrawal Successful...!!!");
        }
        catch(InsufficientResourcesException e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
    public void deposit() throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the amount you want to deposit: ");
        double damt=Double.parseDouble(br.readLine());
        balance=balance+damt;
        System.out.println("Deposit Successful....!!");
    }
    public void viewBalance(){
        System.out.println("The balance is "+balance);
    }

}

