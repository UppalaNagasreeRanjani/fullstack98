package IntroductionNumbers;

 class Ex {
	
public void display() throws Exception {
	System.out.println("hi");
	
}
 }
class B extends Ex{
	public void display() throws ArithmeticException{
		System.out.println("hi");
	}
	public static void main(String[] args) {
		B b =new B();
		b.display();
	}
	}





