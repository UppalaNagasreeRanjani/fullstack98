package IntroductionNumbers;

import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String[] args)	{
		Scanner s=new Scanner(System.in);
	int a,b;
	char ch=2;
	a=s.nextInt();
	b=s.nextInt();
	System.out.println(a+b);
	switch(ch) {
	case 1:System.out.println(a);
	case 2:System.out.println(b);
	
	}

}
}