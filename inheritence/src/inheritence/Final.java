package inheritence;

public class Final {
	public final double PI;
	Final()
	{
		PI=4.5;
	}
	Final(int a){
		PI=5.5;
	}
	
	public static void main(String[] args) {
		 final double PIE;
		 PIE=45.87;
		System.out.println(PIE);
		Final f=new Final();
		Final f1=new Final(2);

		System.out.println(f.PI);
		System.out.println(f1.PI);
		
		
		
	}
}

