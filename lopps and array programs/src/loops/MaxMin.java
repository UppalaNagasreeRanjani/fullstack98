package loops;

import java.util.Scanner;
/*5. Write a program in C to find the maximum and minimum element in an array. 
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 45 
element - 1 : 25 
element - 2 : 21 
Expected Output : 
Maximum element is : 45 
Minimum element is : 21 */


public class MaxMin {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[],size,i,j,k;
		System.out.println("enter the size of an array");
		size=s.nextInt();
		a=new int[size];
		
		System.out.println("enter the elements an array");
		
		for( i=0;i<size;i++) 
			a[i]=s.nextInt();
		j=a[0];
		for( i=0;i<size;i++) {
		 
		 if(a[i]>j)
			 j=a[i];
		 
		}
		System.out.println("max element is"+j);
		k=a[0];
		for( i=0;i<size;i++) {
		 
			
			if(a[i]<k)
				k=a[i];
				 
		}

		System.out.println("min element is"+k);
	}
				
		
}