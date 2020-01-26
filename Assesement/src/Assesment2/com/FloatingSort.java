package Assesment2.com;

import java.util.Scanner;

public class FloatingSort {
	public static void main(String[] args)	{
		Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	float[] array=new float[n];
	for(int i=0;i<n;i++) {
		array[i]=s.nextFloat();
		}
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(array[i]>array[j])	{
				float temp=array[i];
				array[i]=array[j];
				array[j]=temp;
	}
	}
	
}for(int i=0;i<n-1;i++) {
	System.out.println(array[i]);
	}
System.out.println(array[n-1]);
	}
}


