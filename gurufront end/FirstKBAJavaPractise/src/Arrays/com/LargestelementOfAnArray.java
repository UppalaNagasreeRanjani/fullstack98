package Arrays.com;

import java.util.Scanner;

public class LargestelementOfAnArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] array=new int[n];
for(int i=0;i<n;i++) {
	
	array[i]=s.nextInt();
}
int i;int temp=0;
for( i=0;i<n;i++) {
	for(int j=i+1;j<n;j++) {
	if(array[i]>array[j]) {
		 temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		
	
	}
	
}
}
System.out.println(temp);

}
}

