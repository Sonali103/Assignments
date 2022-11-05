package basicjavaassignment;

import java.util.Scanner;
public class CUI {

    public static void main(String[] args) {
        if(!validateUser()) {
            System.out.println("Contact Admin");
        }
    }
    public static boolean validateUser( ) {
        boolean result=false;
        String username,password;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++) {
            System.out.println("Enter the Username");
            username=sc.nextLine();
            System.out.println("Enter the Password");
            password=sc.nextLine();

            if(username.equals("test")&&(password.equals("test1234"))) {
                System.out.println("Welcome\t"+username);
                result =true;
                return result;
            }
            return result;
        }
        return result;
    }
}