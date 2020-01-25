package IntroductionNumbers;

import java.util.Scanner;

public class LargestAmongThree {
	public static void main(String[] args)	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b &&a>c) {
			System.out.println("A is big");
		}
		else if(b>a && b>c){
			System.out.println("b is big");
			
		}
		else {
			System.out.println("c is big");
		}
}
}
