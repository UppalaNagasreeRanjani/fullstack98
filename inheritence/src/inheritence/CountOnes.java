package inheritence;

import java.util.Scanner;

public class CountOnes {
	public static void main(String[] args) {
		int i,st,e,c=0,n,r;
		Scanner s=new Scanner(System.in);
		st=s.nextInt();
		e=s.nextInt();
		for(i=st;i<=e;i++) {
			n=i;
			while(n!=0) {
				r=n%10;
				if(r==1)
				{
					c++;
				}
					n=n/10;
				}
		}
				System.out.println(c);
				}
			
		}
	

