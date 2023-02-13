package U5;

import java.io.*;

public class Ejercicio2 {
	public static void main(String[] args) {
		File Archivo = new File("C:\\EjercicioStream\\uno.java");
		if (Archivo.exists())
			;
		else {
			System.out.print("el archivo no esiste");
		}
		FileWriter in = null;
		PrintWriter out = null;
		try {
			in = new FileWriter("C:\\EjercicioStream\\uno.java");
			out = new PrintWriter(in);
			for (int i = 0; i <= 10; i++)
				out.println(i);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != in)
					in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
