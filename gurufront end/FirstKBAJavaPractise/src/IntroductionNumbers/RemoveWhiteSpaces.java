package IntroductionNumbers;

//import java.util.Scanner;

public class RemoveWhiteSpaces {
	public static void main(String[] args)	{
		//Scanner s=new Scanner(System.in);
		String name="Nagasree ranjani uppala skait     ";
		name=name.replaceAll("\\s","#");
		System.out.println(name);
}

}
