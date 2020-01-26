package loops;

import java.util.Scanner;
/*1. Write a Program that accepts a number and checks whether it's positive, negative, or
   zero.*/

public class Positive {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
				n=s.nextInt();
		if(n>0) {
			System.out.println("positive");
			
		}
		else {
			System.out.println("negative");	
		}
			
		
	}

}
