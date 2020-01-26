package IntroductionNumbers;

import java.util.Scanner;

public class CharAlphabetOrNot {
	public static void main(String[] args)	{
		Scanner s=new Scanner(System.in);
char ch='&';
if((ch>'a' && ch<'z')||(ch>'A' && ch<'Z')) {
	System.out.println("character");
}
else {
	System.out.println("not a cahracter");
}
}
}