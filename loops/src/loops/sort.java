package loops;

import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[],size,i,j,k=0;
		System.out.println("enter the size of an array");
		size=s.nextInt();
		a=new int[size];
		
		System.out.println("enter the elements an array");
		
		for( i=0;i<size;i++) 
			a[i]=s.nextInt();
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i]>a[j]) {
					k=a[i];
				a[i]=a[j];
				a[j]=k;
				}
			}
		}
		System.out.println("sorting array is");
		for( i=0;i<size;i++) 
			System.out.println(a[i]);
		
	}		
}
