package basicjavaassignment;

import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args)
    {
        int i,j,temp=0;
        int a[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int n=a.length;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j]=temp;
                }
            }
        }
        System.out.println("The elements in array after sorting");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}

