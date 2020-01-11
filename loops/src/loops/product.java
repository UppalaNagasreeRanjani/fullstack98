package loops;

import java.util.Scanner;
/*3. You have to write a Program that accepts the product name and quantity as input
   and displays the total price using the unit prices already stored in the system.
*/
public class product {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String m,m1,m2;
		m=s.nextLine();
		m1=s.nextLine();
		m2=s.nextLine();
		int quantity,p;
		quantity=s.nextInt();
		
		
	if(m.equals("cs")) {
		
	p=quantity*10;
			System.out.println("price is"+p);
			
		}
	else if(m1.equals("sri")) {
		p=quantity*11;
		System.out.println("price is"+p);
	}
	else if(m2.equals("naga")) {
		p=quantity*12;
		System.out.println("price is"+p);
		
		
		
		
	}
		
		
		
	}

}
