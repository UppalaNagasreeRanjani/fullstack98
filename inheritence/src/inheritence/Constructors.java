package inheritence;

public class Constructors {
	public static void main(String[] args) {
		A a=new A();
		A a1=new A(5);
		B b=new B(5);
		
	}

}
class A{
	A()
	{
		super();
		System.out.println("1");
	}
	A(int a){
		this();
		System.out.println("2");
	}
	{
		System.out.println("3");
	}
	}
class B extends A{
	B(int b){
		super(3);
		System.out.println("4");
	}
	{
		System.out.println("5");
	}
	}

