package U5;

import java.io.*;

public class Carpeta {
	public static void main(String[] args) throws IOException {
		File Directorio = new File("C:\\EjercicioStream");
		System.out.print(Directorio.exists());
		if (!Directorio.exists()) {
			Directorio.mkdir();
		}
		File Archivo = new File("C:\\EjercicioStream\\uno.java");
		try {
			Archivo.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File Archivo1 = new File("C:\\EjercicioStream\\dos.java");
		try {
			Archivo1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File Archivo2 = new File("C:\\EjercicioStream\\tres.java");
		try {
			Archivo2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File Archivo3 = new File("C:\\EjercicioStream\\cuatro.java");
		try {
			Archivo3.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}