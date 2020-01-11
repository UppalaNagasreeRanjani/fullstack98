package loops;

import java.util.Scanner;

/*6. Write a Program to accept hours and number of resources and display the total
   number of productive hours. (Total number of productive hours = hours * number of
   resources).*/
public class hours {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int h,num,product;
		h=s.nextInt();
		num=s.nextInt();
		product=h*num;
		System.out.println("the productivityis"+product);
	}

}
