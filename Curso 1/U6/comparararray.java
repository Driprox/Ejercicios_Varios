package U6;
import java.util.*;
public class comparararray {
	public static void main (String [ ] Args) {

        int [ ] Array1 = {2, -4, 3, -7};

        for (int i=0; i<Array1.length; i++) {

        int [ ] Array2 = {2, -4, 3, -7};

        for (int e=0; e<Array2.length; e++) {

        System.out.println ("Son el mismo array: " + Arrays.equals(Array1, Array2) );
}
	}
}
}