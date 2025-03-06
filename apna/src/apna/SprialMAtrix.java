package apna;

import java.util.Scanner;

public class SprialMAtrix {

	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int columns=sc.nextInt();
		
		int matrix[][]=new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}int top=0;
		int down=rows-1;
		int left=0;
		int right=columns-1;
		int dir=0;
		while(top<=down && left<=right) {
			if(dir==0) {
				for(int i=left;i<=right;i++) {
					System.out.print(matrix[top][i]+ " ");
			
				}	top++;
			}
				else if(dir==1) {
					for(int i=top;i<=down;i++) {
						System.out.print(matrix[i][right]+" ");
						
					}right--;
				}
				else if(dir==2) {
					for(int i=right;i>=left;i--) {
						System.out.print(matrix[down][i]+ " ");
						
					}down--;
				}
				else if(dir==3) {
					for(int i=down;i>=top;i--) {
						System.out.print(matrix[i][left]+" ");
						
					}left++;
					
					
				}
			dir=(dir+1)%4;
			
			
			
			}
		}
		
		
	}

