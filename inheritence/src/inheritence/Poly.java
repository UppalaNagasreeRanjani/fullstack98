package inheritence;
public class Main{
	public double area(double a){
		return a*a;
	}
	public double area(int a,double b){
		return a*b;
	}
	public double area(int a,int b) {
		return (a*b)/2;
	}
	}

public class Poly {
	
	
	
	
	public static void main(String[] args) {
		Main m=new Main();
		
		System.out.println(m.area(2,3));
		
}
}
