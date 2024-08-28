//write a program for sorting of elements in java

import java.util.Scanner;
public class bubblesort{
	public static void main(String[] args){
		int i,n,j,t;
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		System.out.println("enter the array size");
		n=sc.nextInt();
		System.out.println("enter the elements in the array");
		for(i=0;i<n;i++) a[i]=sc.nextInt();
		for(i=0;i<=n-1;i++){
			for(j=0;j<=n-i-1;j++){
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;	
				}
				for(i=0;i<=n;i++)
				System.out.println(a[i]+" ");
			}
		}
				
	
	}
}
