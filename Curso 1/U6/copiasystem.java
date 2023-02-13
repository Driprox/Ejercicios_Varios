package U6;

public class copiasystem {
	public static void main(String[] args) {
		int[] array1 = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] array2 = new int[array1.length];
		System.arraycopy(array1, 0, array2, 0, array1.length);
		for (int i = 0; i < array2.length; i++) {
			System.out.println("array2  posicion " + i + ": " + array2[i]);
		}
	}
}
