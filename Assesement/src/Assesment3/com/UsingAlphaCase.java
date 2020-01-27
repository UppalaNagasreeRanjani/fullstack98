package Assesment3.com;

public class UsingAlphaCase {
	public static void main(String[] args)	{
		String name=new String(" java programming is easy ");
	
	for(int i=0;i<name.length();) {
		i+=2;
		
		System.out.println(name.toUpperCase());
	}

}
}