package IntroductionNumbers;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class RoundNumberToDecimal {
	public static void main(String[] args)	{
		Scanner s=new Scanner(System.in);
		double num=56.718987986876;
		//System.out.format("%.6f",num);
		DecimalFormat df=new DecimalFormat("#.####");
		df.setRoundingMode(RoundingMode.CEILING);
		System.out.println(df.format(num));
		
		
}
}
