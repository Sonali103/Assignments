package apna;

import java.util.Scanner;

public class Exercise1 {
	
	public static  void averageOfTwoNum(int num1,int num2,int num3) {
		int average=(num1+num2+num3)/3;
		 System.out.println("The average of number is "+ average);
	}
	
	public static void sumOfOdd(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			
			sum+=i;
		}			System.out.println("The  sum of odd numbers :" +sum);
	}
	public static void greatertwo(int num1,int num2) {
		System.out.println(Math.max(num1, num2));
	}
	public static double radiusOfCircle(double i) {
		return 2*Math.PI*i;
	}
	public static String election(int n) {
		if(n> 18) {
			return "Eligible to vote";
		}
		else {
			return "you need atleast 18 age";
		}
	}
	public static double power(double x,int n) {
		double result=1;
		for(int i=0;i<n;i++) {
			result *=x;
		}
		return result;
		
	}
	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the first number");
    int n= scan.nextInt();
   /*System.out.println("Enter the second number");
    int b=scan.nextInt();
     System.out.println("enter the third number");
    int c=scan.nextInt();
    averageOfTwoNum(a, b, c);
    sumOfOdd(a); 
    greatertwo(a, b);
    System.out.println("Enter the radius of circle");
    double i=scan.nextDouble();
//    System.out.println(radiusOfCircle(i));
   System.out.println(election(a));
//   System.out.println(;
    
   do {
	   System.out.println("infinite loop");
   }while(true);
    int positive=0,negative=0,zeros=0;
    System.out.println("Press 1 to continue & 0 to stop");
    int input=scan.nextInt();
    while(input==1) {
    	System.out.println("Enter the number: ");
    	int num=scan.nextInt();
    	if(num>0) {
    		positive++;
    		}
    	else if(num<0) {
    		negative++;
    	}
    	else {
    		zeros++;
    	}
    	System.out.println("Press 1 to continue & 0 to stop");
        input=scan.nextInt();
    }
    System.out.println("Positives: " +positive);
    System.out.println("Negatives: " +negative);
    System.out.println("Zeros: "+zeros);
	}
	
//	Function to calculate x raised to the power of n
    System.out.println("Enter n");
     double x=scan.nextDouble();
    System.out.println("Enter x");
    int n=scan.nextInt();
    double result=power(x,n);
    System.out.println(result);
    int n1=scan.nextInt();
    int n2=scan.nextInt();
    
    while(n1!=n2) {
    	if(n1>n2) {
    		n1=n1-n2;
    	}
    	else {
    		n2=n2-n1;
    	}
    }
    System.out.println("the gcd is:" +n2);*/
    
   int firstnum=0,secondnum=1;
    
   if(n>1) {
    for(int i=1;i<=n;i++) {
    	System.out.print(firstnum+ ", ");
    	
    	int nextnum=firstnum+secondnum;
    	firstnum=secondnum;
    	secondnum=nextnum;
    	
    }}
	}
	
}
