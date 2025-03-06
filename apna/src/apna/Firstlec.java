package apna;

import java.util.Arrays;
import java.util.Scanner;

//import java.util.Arrays;

public class Firstlec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Variables
		/*
		String name="Aman";
		String nrighbour="akku";
		int age=18;
		String friend=nrighbour;
		
		
//		Types in java
//		primitive
//		byte age=35;
//		int phone=123456789;
//		long phone2=12345678913652L;
//		float pi=3.14F;
//		char letter='@';
//		boolean  isadult=true;
		
//		Non primitive
		String name="sonali";
		System.out.println(name.length());
		*/

		/*
		
		Strings
,//		Concatenate
		String name1="Sonali";
		String name2="Akku";
//		String name3=name1 +  " and " + name2;
//		System.out.println(name1+ " and  " .concat(name2));
		System.out.println(name1.charAt(0));
//		replace
		String hold=name1.replace('n', 'h');
		System.out.println(hold);
		String dance="I love to code";
		System.out.println(dance.substring(10,14));
		*/
		
	
//		arrays
		int[] marks=new int[3];
		marks[0]=97;
		marks[1]=89;
		marks[2]=96;
	 
//		length
//		System.out.println(marks.length);
		
//		sort
//		System.out.println(marks[0]);
//		Arrays.sort(marks);
//		System.out.println(marks[0]);
		
//		already knowing the element of aarray
//		int[]mark= {97,95,89};
//		int [][]finalMarks= {{95,98,94},{96,98,97}};
//		System.out.println(finalMarks[0 ][2]);

		
//		casting
		/*
		double price=100.00;
		double finalPrice=price+18;
		System.out.println(finalPrice);
		
		int p=100;
		int fp=p+(int)18.45;
		System.out.println(fp);
		
		
//		 int age=30;
//		 age=31;
//		 age=32;
//		 
//		 final float Pi=3.14f;
////		 Pi=1.1f;
				 
//		operators
		int a=1;
		int b=2;
		int sum=a % b;
		System.out.println(sum);
		
	
	int numb= 1;
	System.out.println(numb--);
	System.out.println(numb);
	
//		MAth
		System.out.println(Math.min(5, 6));
//		random
		System.out.println((int)(Math.random()*100));
		*/
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Input your name: ");
//		String name=sc.nextLine();
//		System.out.println("The Person is: "+name);
		
//		comparison operator
//		a==b
//		a!=b
//		a<b or a>b
//		a<=b
//		a>=b
//		
//		Conditional statement
		boolean isSunup=false;
		if(isSunup==true)
			System.out.println("day");
		else
			System.out.println("night");
	
	
	int age=45;
			if(age>=18) {
				System.out.println("can vote");
			}
			else {
				System.out.println("can't vote");
			}
			
//			Logical operators
//			&&
//			int a=30;
//			int b=90;
//			if (a<50 && b<50)
//				System.out.println("both less than 50");
			
//			OR operator
//			if(a<50 || b < 50)
//				System.out.println("atleast one less than 50");
			
//			! operator
			boolean isADult= false;
			if(!isADult)
				System.out.println("is adult");
			else
				System.out.println("not adult");
			}
	}
