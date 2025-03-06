package apna;

import java.util.Scanner;

public class MiniProject_firstlec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc=new Scanner(System.in);
		int usernum=0;
		int mynumber=(int) (Math.random()*100);
		do {
			System.out.println("Guess the number(1-100):");
			 usernum=sc.nextInt();
			if(usernum==mynumber) {
				System.out.println("WOHOOO ... Correct number");
				break;
			}
			else if (usernum > mynumber) {
				System.out.println("Your number is large");
			}
			else {
				System.out.println("your number is too small");
			}
		}while(usernum>=0);
		
		System.out.print("My number was:");
		System.out.println(mynumber);
		*/
//	Make a program that prints the table of a number that is input by the user. 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the table of: ");
		int num=scan.nextInt();

		for(int i=1;i<=10;i++)
		{
		System.out.println(num + " X " + i +" = " + num*i ); }
		
		
		
		/*
x	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		System.out.println("choose operation(+,-,*,/,%): ");
		char operator=sc.next().charAt(0);
		
		switch(operator) {
		case '+':
			System.out.println(a+ "+" +b+ " = " +  a+b );
			break;
			
		case '-':
			int result=a-b;
			System.out.println(a+ "-" +b+ " = " +  result);
			break;
			
		case '*':
			System.out.println(a+ "*" +b+ " = " +  a*b );
			break;
			
		case '/':
			System.out.println(a+ "/" +b+ " = " +  a/b );
			break;
			
		case '%':
			System.out.println(a+ "%" +b+ " = " +  a%b );
			break;
			
		 default:
		        System.out.println("Invalid operator!");
		        break;
		}
		
		
		int n=100;
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		
		}
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		*/
		
	}

}
