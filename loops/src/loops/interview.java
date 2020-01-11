package loops;

import java.util.Scanner;
/*5. Consider a scenario where all candidates have to take two tests before appearing for an
   interview. A candidate is selected for the interview round, based on the scores of the two
   tests. The individual score in each test should be greater than 75, and the average
   score for the two tests should be a minimum of 80. A call letter for the interview is to
   be sent to candidates who have been selected, and a rejection letter is to be sent to
   the rest.
*/

public class interview {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n1,n2;
n1=s.nextInt();
n2=s.nextInt();
if((n1>75) && (n2>75))
{
	if(((n1+n2)/2)>=80){
	
		System.out.println("call leter send that declare it as selected");
		
	}
}
else {
	System.out.println("rejected");
}



	}

}
