package inheritence;

import java.util.Scanner;

public class Excersize {
public static void main(String[] args) {
	int n;
	Scanner s2=new Scanner(System.in);
	n=s2.nextInt();
	Steve st=new Steve();
	Employee e=new Employee();
	switch(n){
	case 1:st.getData();
	         st.display();
	         break;
	case 2:e.getData();
	        e.display();
	        break;
	  default:System.out.println("invalid ");
	  
		}
	
	
	
	
}
}
class Steve{
	String fname;
	String lname;
	int age;
	String courseName;
	int stuId;
	public void getData()
	{
		System.out.println("enter student details");
		Scanner s=new Scanner(System.in);
		fname=s.nextLine();
		lname=s.nextLine();
		age=Integer.parseInt(s.nextLine());
		courseName=s.nextLine();
		stuId=s.nextInt();
		
	}
	public void display()
	{
		System.out.println("details are"+fname+lname+age+courseName+stuId);
		
	}
	
}
class Employee extends Steve{
	String fname;
	String lname;
	int age;
	long sal;
	String depName;
	String designation;
	int empId;
	public void getData()
	{
		System.out.println("enter emp details");
		Scanner s1=new Scanner(System.in);
		fname=s1.nextLine();
		lname=s1.nextLine();
		age=s1.nextInt();
		sal=s1.nextInt();
		depName=s1.nextLine();
		designation=s1.nextLine();
		empId=s1.nextInt();
	}
	public void display()
	{
		System.out.println("emp details are"+fname+lname+age+sal+depName+designation+empId);
		
	}
	
	
}