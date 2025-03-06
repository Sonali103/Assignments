

package apna;

import java.util.Scanner;

public class Patterns {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for rows: ");
		int n= sc.nextInt();
//		System.out.println("Enter the value for columns: ");
//		int m= sc.nextInt();
		int num=1;
	/*
	 * for solid triangle
output should be=
*****
*****
*****
*****
	
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		} */
		
		
		/* Hollow Triangle
		 * 
output should be 
		 
******
*    *
*    *
*    *
******
		 
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(i==1 || j==1 || i==n || j==m ) {
					System.out.print("*");
				}
				else {
				System.out.print(" ");
				}
				System.out.println();
			}System.out.println();
		}*/
		
		
		/* Half pyramid
output should be
*
**
***
****
*****
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
		System.out.println();}*/
		
		/*Inverted half pyramid
the output should be
*****
****
***
**
*
		 
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/  
	/* half pyramid(rotated 180)
	 * output shoukd be
	     *
	    **
	   ***
	  ****
	 *****
		
	for (int i=1;i<=n; i++ ) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}	 */
		
		
	/*	Half pyramid(numerical)
		output should be
		1
		12
		123
		1234
		12345
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
				
			}
			System.out.println();
		}*/
		
		
		/*Inverted half pyramid (numerical)
		 * output should be
1 2 3 4 5 6 7 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

		
 		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
			
		}
		*/
		
		/*
		
//		Flyod triangle
//		the output  will be:
		1 
		2 3 
		4 5 6 
		7 8 9 10 
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}*/
		
		/* 0-1 triangle
		 * 
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
0 1 0 1 0 1 
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				int sum=i+j;
				if(sum %2==0) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
				
			}
			System.out.println();
		}*/
		
	
	
	}
	

}
