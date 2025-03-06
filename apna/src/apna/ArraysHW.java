package apna;

import java.util.Scanner;

public class ArraysHW {

	public static void main(String[] args) {
/*
		//		Take an array of names as input from the user and print them on the screen.

		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String name[]=new String[size];
		
//		input
		for(int i=0;i<size;i++) {
			 name[i]=sc.next();
		}
		for(int i=0;i<name.length;i++) {
			System.out.println("names "+ (i+1)+" is"  +name[i]);
		}*/
		
//		Find the maximum & minimum number in an array of integers. 
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int numbers[]=new int[size];
		
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		/*int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<numbers.length;i++) {if(numbers[i]<min) {
				min=numbers[i];
			}
			if(numbers[i]>max)
			{
				max=numbers[i];
			}
			}
			System.out.println("LArgest number is: "+max);
			System.out.println("Smallest number is: "+min);
		*/
		
//		Take an array of numbers as input and check if it is an array sorted in ascending order.
//		Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//		       {3, 4, 6, 2} is not sorted in ascending order

		boolean isAscending=true;
		
		for(int i=0;i<numbers.length-1;i++) {
			if(numbers[i]>numbers[i+1]) {
				isAscending=false;
				break;
			}
		}
		if(isAscending) {
			System.out.println("It is in Ascending order");
		}
		else {
			System.out.println("It is not ascending order");
		}
	}

}
