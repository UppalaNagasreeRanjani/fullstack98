package IntroductionNumbers;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args)	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=0;
		for(int i=0;i<=10;i++) {
			m=n*i;
			System.out.println(m);
		}
		
	}
}
