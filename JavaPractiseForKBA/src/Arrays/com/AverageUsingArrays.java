package Arrays.com;

import java.util.Scanner;

public class AverageUsingArrays {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int avg=0;
		int n=s.nextInt();
		int[] array=new int[n];
		System.out.println("enter elemnts");
		for(int i=0;i<n;i++) {
			
			array[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			avg=avg+array[i];
		}
		System.out.println(avg/n);
		
		
	}

}
