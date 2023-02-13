package U3;
import static org.junit.Assert.*;

import org.junit.Test;

public class divisionTest {
		@Test
		public void test() {
			division D=new division(99, 1000);
			assertTrue(D.dividir()==98);
		}
	}