package IntroductionNumbers;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args)	{
		Scanner s=new Scanner(System.in);
int n=s.nextInt();
int n1=0,n2=1;
for(int i=0;i<n;i++) {
	System.out.println(n1);
int sum=n1+n2;
n1=n2;
n2=sum;

	
}
	

}
}