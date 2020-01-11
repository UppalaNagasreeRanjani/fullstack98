package inheritence;

import java.util.Scanner;

public class Inheritence1 {
public static void main(String[] args) {
	Emp e=new Emp();
	e.getData();
	e.display();
	Department d=new Department();
	
	d.dname="sce";
	System.out.println(d.dname);
	d.getDe();
	d.displayDe();
}
}
class Emp{
	int id;
	String name;
	String lname;
	public void getData()
	{
		Scanner s=new Scanner(System.in);
		//System.out.println("enter id");
		id=Integer.parseInt(s.nextLine());
		name=s.nextLine();
		lname=s.nextLine();
		
		
	}
	public void display()
	{
		System.out.println(+id+name+lname);
		
	}
}
 class Department extends Emp{
		
	 String dname;
	 String[] nam;
		Scanner s1=new Scanner(System.in);
	
	nam=new String[5];
	int n=3;
	public void getDe() {
	for(int i=0;i<n;i++) {
		nam[i]=s1.nextLine();
		System.out.println(nam[i]);
	}
	}
	public void displayDe()
	
	{
		for(int i=0;i<n;i++) 
			System.out.println(nam[i]);
		
		
	}
	
	
	
	
	//public void d(){
	//dname=s.nextLine();
	//System.out.println(dname);
	
 }

 class Module extends Emp{
	String mname;
	

	
}


