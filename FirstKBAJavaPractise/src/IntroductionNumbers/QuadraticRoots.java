package IntroductionNumbers;

import java.util.Scanner;

public class QuadraticRoots {
	public static void main(String[] args)	{
		Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	double r1,r2;
	double de=(b*b)-(4*a*c);
	System.out.println(de);
	if(de>0)
		{
		 r1=-b+(Math.sqrt(de)/(2*a));
	 r2=-b-(Math.sqrt(de)/(2*a));
		System.out.println(r1);
		System.out.println(r2);
		}
	else if(de==0) {
		r1=r2=(-b/(2*a));
		System.out.println(r1+""+r2);
	}
	else {
		r1=-b/(2*a);
		r2=(Math.sqrt(de)/(2*a));
		System.out.println(r1+""+r2);
		
	}
		}
}
