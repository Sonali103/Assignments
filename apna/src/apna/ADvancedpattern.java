package apna;

import java.util.Iterator;
import java.util.Scanner;

public class ADvancedpattern {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the rows: ");
		int n =sc.nextInt();
		
/*
		Butterfly pattern
		*      *
		**    **
		***  ***
		********
		********
		***  ***
		**    **
		*      *
		  for(int i=1;i<=n;i++) {
			  
			  for(int j=1; j<=i;j++) {
				  System.out.print("*");
			  }
			  for(int j=1;j<=2*(n-i);j++) {
				  System.out.print(" ");
			  }
			  for(int j=1;j<=i;j++) {
				  System.out.print("*");
			  }
			  System.out.println();
			  			  
		  }
		  for(int i=n;i>=1;i--) {
			  for(int j=1; j<=i;j++) {
				  System.out.print("*");
			  }
			  for(int j=1;j<=2*(n-i);j++) {
				  System.out.print(" ");
			  }
			  for(int j=1;j<=i;j++) {
				  System.out.print("*");
			  }
			  System.out.println(); 
		  }
		
		rhombus
	    *****
	    *****
	   *****
	  *****
	 *****
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		Hollow rhombus
		
	    *****
	    *   *
	   *   *
	  *   *
	 *****

		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++) {
				if(i==1|| j==1||i==n||j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
//		Number pyramid
		
	    1 
	   2 2 
	  3 3 3 
	 4 4 4 4 
    5 5 5 5 5 
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+ " ");
			}
			
			System.out.println();
		}
		
		PAlindrome pyramid
		
	      1
	     212
	    32123
	   4321234
	  543212345
	 65432123456
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		Diamond PAttern 
		   * 
		   ***  
		  *****   
		 *******    
		 *******    
		  *****   
		   ***  
		    * 
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		*/
	} 

}
