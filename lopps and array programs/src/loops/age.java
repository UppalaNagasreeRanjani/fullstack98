package loops;

import java.util.Scanner;
/*8. Write a Program to accept the age of the user and then, display the category of the
   user. Based on the age, the categories of the users are:
	05-12 Children
	13-19 Teenagers
	20-35 Young adults
	36-45 Mature adults
	46-55 Elders
	56 and above Seniors
	*/

public class age {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age;
		age=s.nextInt();
		if((age>=5) && (age<=12))
		{
			System.out.println("children");
			
		}
		else if((age>=13) && (age<=19))
			{
			System.out.println("teenager");
			
			}
		else if((age>=20) && (age<=35)) {
			System.out.println("young adults");
			
		}
		else if((age>=36) &&(age<=45))
		{
			System.out.println("mature adults");
			
		}
		else if((age>=46) &&(age<=55)) {
			System.out.println("children");
			
		}
		else
		{
			System.out.println("seniors");
			
		}
			}

}
