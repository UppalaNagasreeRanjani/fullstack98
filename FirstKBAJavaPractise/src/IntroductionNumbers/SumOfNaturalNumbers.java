package IntroductionNumbers;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args)	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		for(int i=0;i<n;i++) {
			
			sum=((n*(n+1))/2);
			
		}
		System.out.println(sum);
}
}

