package IntroductionNumbers;

import java.util.Scanner;

public class LeapYearOrNOt {
	public static void main(String[] args)	{
		Scanner s=new Scanner(System.in);
int n=s.nextInt();
if((n%4==0)||(n%100==0)&&(n%400==0)) {
	System.out.println("leapyaear");
	
}
else {
	System.out.println("not leapyaear");
}
}
}