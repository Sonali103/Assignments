package apna;

import java.util.Scanner;

public class Recursion {

	
	
//	reverse String using recursion
	public static void printString(String s) {

		if(s==null || s.length()<=1) {
		System.out.println(s);
		}
		else
		{
			System.out.print(s.charAt(s.length()-1));
			printString(s.substring(0,s.length()-1));
		}
	}
	
	public static void printNumb(int n) {
		if(n==6) {
			return;
		}
		System.out.println(n);
		printNumb(n+1);
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		/*System.out.println("Enter the String: ");
		String hie=scanner.nextLine();
		printString(hie);*/
		System.out.println("Enter the number");
		int a=scanner.nextInt();
		printNumb(a);
		

	}

}
