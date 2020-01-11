package loops;

import java.util.Scanner;
/*2. Write a Program that accepts the length and breadth of a
   rectangle and displays its area and perimeter.*/

public class Area {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int l,b;
	float a,p;
	l=s.nextInt();
	b=s.nextInt();
	a=l*b;
	System.out.println(a);
	p=(2*(l+b));
	System.out.println(p);
	}
	
	
}
