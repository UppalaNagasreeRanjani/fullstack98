import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.NewProject.New;

public class test {
New n;
	@Before
	
	public void create() {
		n=new New();
		System.out.println("created");
	}
	@After
	public void remove() {
		n=null;
		System.out.println("remove");
		
			}
	@Test
	public void testadd() {
		assertEquals(4,n.add(3, 1));
	}
	@Test
	public void testsub() {
		assertEquals(5,n.sub(10,5));
	}

}
