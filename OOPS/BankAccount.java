package OOPS;


public class BankAccount {
    private String name;
    double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double amount) {
        this.balance += amount;
    }
    public boolean withdraw(double amount) {
        if( balance >amount){
            balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }
}
class Savingacc extends BankAccount{

}
class Currentacc extends BankAccount{
 @Override
    public boolean withdraw(double amount) {
     balance -= amount;
     return true;

 }
}

