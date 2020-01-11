package inheritence;

import java.util.Scanner;
/*addin array of elements and display nber of 1 s in that sum*/
public class Neww {
public static void main(String[] args) {
	int a[],size,i,sum=0,c=0,t;
	Scanner s=new Scanner(System.in);
	//f=s.nextInt();
	//l=s.nextInt();
	size=s.nextInt();
	a=new int[size];
	for(i=0;i<size;i++) {
		a[i]=s.nextInt();
		sum=sum+a[i];
		
		}
	System.out.println(sum);
	
	t=sum/10;
	if(t==1)
	{
		c++;
	}
	t=t/10;
	System.out.println(c);

	
	
	
	
	
}
}
