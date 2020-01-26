package IntroductionNumbers;

import java.util.Scanner;

public class ComputeQuotientAndRemainder {
	public static void main(String[] args)	{
		Scanner s=new Scanner(System.in);
		int dividend=s.nextInt();
		int diviser=s.nextInt();
		int quotient=dividend/(diviser);
		int remainder=dividend%diviser;
		System.out.println(quotient);
		System.out.println(remainder);

}
}