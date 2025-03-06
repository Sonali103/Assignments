package apna;

public class hwPAttern {

	public static void main(String[] args) {

		int n=5;
	  /* Hollow butterfly
*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *

	      
	      for(int i=1;i<=n;i++) {
	   
	    	
	    	for(int j=1;j<=i;j++) {
	    		if(j==1 || j==i) {
	    			System.out.print("*");
	    		}
	    		else {
	    			System.out.print(" ");
	    		}
	    	}
	    	for(int j=1;j<=2*(n-i);j++) {
	    		System.out.print(" ");
	    	}
	    	for(int j=1;j<=i;j++) {
	    		if(j==1 ||  j==i) {
	    			System.out.print("*");
	    		}
	    		else {
	    			System.out.print(" ");
	    		}
	    	
	    	
	    }System.out.println();
	}
  for(int i=n;i>=1;i--) {
	    	
	    	for(int j=1;j<=i;j++) {
	    		if(j==1 || j==i) {
	    			System.out.print("*");
	    		}
	    		else {
	    			System.out.print(" ");
	    		}
	    	}
	    	for(int j=1;j<=2*(n-i);j++) {
	    		System.out.print(" ");
	    	}
	    	for(int j=1;j<=i;j++) {
	    		if(j==1 ||  j==i) {
	    			System.out.print("*");
	    		}
	    		else {
	    			System.out.print(" ");
	    		}
	    	
	    	
	    }System.out.println();
	}
	    
	    */
		
		   

/*
		
//		Half pyramid
		
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
		Half inverted traingle
		11111
		2222
		333
		44
		5
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++) {
				System.out.print(i);
			}
			System.out.println();
		}*/
	
	}
	
}


