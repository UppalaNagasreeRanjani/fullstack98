package loops;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[],size,i;
		
		System.out.println("enter the size iof array");
	
	
			size=s.nextInt();
			arr=new int[size];
			System.out.println("enter the elements into array");
			for(i=0;i<size;i++) {
				
				arr[i]=	s.nextInt();
					System.out.println(" the elements in the array are");
					for(i=0;i<size;i++)
						System.out.println(arr[i]);
					
			}
		
		
			System.out.println("reverse of an array is");
			for(i=size-1;i>=0;i--) {
		
				System.out.println(arr[i]);
		
		}
		
	}
}

