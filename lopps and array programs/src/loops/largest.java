package loops;

import java.util.Scanner;
/*7. Write a Program to accept three numbers and to display the largest of the three numbers.
*/

public class largest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,c;
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if((a>b)&&(a>c)) {
			System.out.println("a is greater"+a);
			
		}
		else if((b>a)&&(b>c)) {
			System.out.println("b is greater"+b);
			
		}
		else
		{
			System.out.println("c is greater"+c);
		}
	}

}
