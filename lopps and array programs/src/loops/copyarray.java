package loops;

import java.util.Scanner;

/*3. Write a program in C to copy the elements of one array into another array.*/
public class copyarray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[],b[],size,i;
		System.out.println("enter the size of an array");
		size=s.nextInt();
		a=new int[size];
		b=new int[size];
		System.out.println("enter the elements an array");
		
		for( i=0;i<size;i++) {
			a[i]=s.nextInt();
		
			System.out.println(" array of a are"+a[i]);
		
		}
		
		for( i=0;i<size;i++) {
		b[i]=a[i];
		System.out.println(" array of b are"+b[i]);
		}
		
		
	}

}