package U3;
import static org.junit.Assert.*;

import org.junit.Test;

public class Restatest {

	@Test
	public void test() {
		Resta R=new Resta(12, 10);
		assertTrue(R.restar()==2);
	}
}
