package loops;

import java.util.Scanner;

public class secondlarge {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[],size,i,j,k=0;
		System.out.println("enter the size of an array");
		size=s.nextInt();
		a=new int[size];
		
		System.out.println("enter the elements an array");
		
		for( i=0;i<size;i++) 
			a[i]=s.nextInt();
		
}
