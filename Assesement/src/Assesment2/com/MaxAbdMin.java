package Assesment2.com;

import java.util.Scanner;

public class MaxAbdMin {
	public static void main(String[] args)	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=s.nextInt();
			}
		int max=0,min=0;
		for(int i=0;i<n;i++) {
			 max=array[0];
			for(int j=1;j<array.length;j++) {
			if(array[j]>max) 
				max=array[j];
			
			}
			
		}
		System.out.println(max);	
		
		for(int i=0;i<n;i++) {
		 min=array[0];
			for(int j=1;j<n;j++) {
				if(array[j]<min) 
					min=array[j];
					
			}
			
		}
		System.out.println(min);
		
}
}