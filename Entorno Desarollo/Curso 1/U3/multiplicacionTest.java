package U3;
import static org.junit.Assert.*;
import org.junit.Test;
public class multiplicacionTest {
	@Test
	public void test() {
		multiplicacion M=new multiplicacion(9, 1);
		assertTrue(M.multiplicar()==9);
	}
}