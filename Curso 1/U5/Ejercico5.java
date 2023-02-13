package U5;

import java.io.*;

public class Ejercico5 {
	public static void main(String[] args) throws IOException {
		try {
			FileReader in = new FileReader(
					"C:\\Users\\FP\\Desktop\\Curso\\Projectos\\Projectos Java\\Programacion\\Curso 1\\U5\\datos.txt");
			BufferedReader br = new BufferedReader(in);
			String Cadena;
			while ((Cadena = br.readLine()) != null) {
				System.out.println("" + Cadena);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}