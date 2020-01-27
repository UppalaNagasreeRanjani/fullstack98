package loops;

import java.util.*;

/*4. Consider an example, where the discount percentage on a TV needs to be decided
   on the basis of the type of TV. If the TV is CRT (C), the discount will be 5% of the
   selling price (SP). If the TV is LCD (L), then the discount will depend on the size of
   the TV screen. For 14 inches screen, the discount is 8% of the SP. For 21 inches
   screen, the discount is 10% of the SP.*/
public class Tv {
	public static void main(String[] args) {
		String tv;
		int d, size, sp;
		Scanner s = new Scanner(System.in);
		
		tv = s.nextLine();
		sp = s.nextInt();
		size = s.nextInt();
		if (tv.equals("crt")) {
			d = (5 / 100) * sp;
			System.out.println("discount" + d);

		} else if (tv.equals("Lcd")) {
			if (size == 14) {
				d = (8 / 100) * sp;
				System.out.println("discount" + d);
			} else if (size == 21) {
				d = (10 / 100) * sp;
				System.out.println("discount" + d);
			}
		}

	}

}
