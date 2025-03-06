package apna;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
	/*	int[] marks=new int[3];
		marks[0]=97;
		marks[1]=98;
		marks[2]=95;
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);

		for(int i=0;i<3;i++) {
			 System.out.println(marks[i]);*/
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int numbers[]=new int[size];
	
//	input
	for(int i=0;i<size;i++) {
		numbers[i]=sc.nextInt();
	}
	int x= sc.nextInt();
	for(int i=0;i<numbers.length;i++) {

		if(numbers[i]==x) {
			System.out.println("x found at index: "+i);
		}
	
		}
	}

}
