package loops;

import java.util.Scanner;

public class sumof {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[],size,i,sum=0;
		
		System.out.println("enter the size iof array");
	size=s.nextInt();
			arr=new int[size];
			System.out.println("enter the elements into array");
			for(i=0;i<size;i++) {
				
				arr[i]=	s.nextInt();
				
				System.out.println(arr[i]);
			}
			
			for(i=0;i<size;i++) 
    sum=sum+arr[i];
    System.out.println("sum of  array"+sum);
	}
			

}
