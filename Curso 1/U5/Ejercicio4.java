package U5;

import java.io.*;

public class Ejercicio4 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile ran = null;
		try {
			ran = new RandomAccessFile("datosaleatorio", "rw");
			ran.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}