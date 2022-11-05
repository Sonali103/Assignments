package OOPS;

public class Total {
    public static void main(String[] args) {
       Currentacc c =new Currentacc();
       Savingacc s=new Savingacc();
       s.setBalance(1000);
       c.setBalance(500);
       doWithdrawal(c);
       doWithdrawal(s);
    }
    public static void doWithdrawal(BankAccount acc) {
        boolean result= acc.withdraw(500);
        if(result){
            System.out.println("withdrawal success");
        }
        else{
            System.out.println("withdrawal fail");
        }
    }
}
