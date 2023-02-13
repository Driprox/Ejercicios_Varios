package U6;

import java.util.Arrays;

public class copy {

	public static void main(String[] args) {
		int[] array1 = new int[] { 2, 3, 4, 5, 6, 7 };
		int[] array2 = Arrays.copyOf(array1, array1.length);
		for (int i = 0; i < array2.length; i++) {
			System.out.println("arra2 posicion " + i + ": " + array2[i]);
		}
	}
}
