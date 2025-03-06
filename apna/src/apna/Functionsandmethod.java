package apna;

import java.util.Scanner;

public class Functionsandmethod {
	/*
	public static void printMyName(String name)
	{
		System.out.println(name);
//		return;
	}
	
	public static int calculateSum(int a,int b) {
		int sum=a+b;
		return sum;
	}
	public static double calculateMultiply(int i,int j) {
		double mul=i*j;
		return mul;
	}
	public static void printFactorial(int n) {
		if(n<0) {
			System.out.println("Invalid number");
			return;
		}
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
			
		}
		System.out.println(fact);
		return ;
	}
	public static void printEvenNumber(int n) {
		if(n%2==0) {
			System.out.println("It is a even number");
		}
		else {
			System.out.println("IT is not even number");
		}
	}*/
	public static void printTable(int n) {
		
		for(int i=1;i<=10;i++) {
			int total=n*i;
			System.out.println(n +" x " + i + " = " + total);
		}
//		System.out.println(n +" x " + i + " = " + total);
		return;
	}
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
//		String name=sc.next();
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int i=sc.nextInt();
//		int j=sc.nextInt();
////		printMyName(name);
//		int sum=calculateSum(a,b);
//		System.out.println("Sum of 2 number is: "+sum);
//		double mul=calculateMultiply(i, j);
//		System.out.println("product of 2 number is: "+mul);
		int n =sc.nextInt();
//		printFactorial(n);
//		printEvenNumber(n);
		printTable(n);
		

		
	}

}
