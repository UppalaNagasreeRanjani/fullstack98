package loops;

import java.util.Scanner;
/*4. Write a program in C to count a total number of duplicate elements in an array.
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 5 
element - 1 : 1 
element -
Expected Output : 
Total number of duplicate elements found in the array is : 1 */
public class duplicate {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[],size,i,j,duplicate=0;
		System.out.println("enter the size of an array");
		size=s.nextInt();
		a=new int[size];
		
		System.out.println("enter the elements an array");
		
		for( i=0;i<size;i++) 
			a[i]=s.nextInt();
		
	
		
		for(i=0;i<size;i++) {
			for(j=i+1;j<size;j++) {
				
				if(a[j]==a[i])
				duplicate++;
				else break;
			}
		}
		System.out.println(" duplicate are"+duplicate);
	}
		
				}
				
				
	
			
			
	
