package apna;

import java.util.Scanner;

public class TWoDArrary {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int rows= sc.nextInt();
		int columns=sc.nextInt();
		
		/*
		int[][]numbers=new int[rows][columns];
		
//		input
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				numbers[i][j]=sc.nextInt();
			}
		}
//		Output
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}*/
        int[][]numbers=new int[rows][columns];
		
//		input
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				numbers[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		int x=sc.nextInt();
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(numbers[i][j]==x) {
					System.out.println("x indices found at location(" +i+", " +j+ ") ");
				}
			}
		}
		
		
	}

}
