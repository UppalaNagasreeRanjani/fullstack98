
package loops;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[],size,i,j=0,k=0,b[],c[],n1=0,n2=0;
		System.out.println("enter the size of an array");
		size=s.nextInt();

		a=new int[size];
		b=new int[size];
		c=new int[size];
		
		System.out.println("enter the elements an array");
		
		for( i=0;i<size;i++) 
			a[i]=s.nextInt();
		
		for( i=0;i<size;i++) {
			if(a[i]%2==0)
			{
				n1++;
				b[i]=a[i];
				j++;
				
			}
			else
			{
				n2++;
				c[k]=a[i];
				k++;
			}
		}
		System.out.println("even numbers");
		for(j=0;j<n1;j++)
			System.out.println(b[j]);
		System.out.println("odd numbers");
		
		for(k=0;k<n2;k++)
			System.out.println(c[k]);
			
			}
		}
			
			
		
