package inheritence;

public class Methodoverriding {
	public static void main(String[] args) {
		E1 e=new E2();
		e.display();
		
	}

}
class E1{
	public void display() {
		System.out.println("hi");
		
	}
}
class E2 extends E1{
	public void display() {
		System.out.println("hello");
		
	}	
}
