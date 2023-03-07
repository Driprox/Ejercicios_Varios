package U5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

import java.util.Scanner;

public class Ficherocreacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fichero = new File("C:\\EjercicioStream");
		File fichero1 = new File("C:\\EjercicioStream\\uno.java");
		File fichero2 = new File("C:\\EjercicioStream\\dos.java");
		File fichero3 = new File("C:\\EjercicioStream\\tres.java");
		File fichero4 = new File("C:\\EjercicioStream\\cuatro.java");
		File ficherotexto = new File("C:\\EjercicioStream\\datosAleatorio.txt");

		// Creo el directorio y compruebo
		if (fichero.exists() == false) {
			fichero.mkdir();
			System.out.println("Fichero creado");
		} else {
			System.out.println("Fichero ya existente");
		}

		// Creo el fichero txt para el cuarto archivo
		if (ficherotexto.exists() == false) {
			try {
				ficherotexto.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Fichero aleatorio creado");
		} else {
			System.out.println("Fichero aleatorio ya existente");
		}

		// Creo el primer archivo
		if (fichero1.exists() == false) {
			try {
				fichero1.createNewFile();
			} catch (IOException e) {

				e.printStackTrace();
			}
			System.out.println("El fichero uno.java sea creado");
		} else {
			System.out.println("El fichero uno.java ya existe");
		}

		// Creo el segundo archivo
		if (fichero2.exists() == false) {
			try {
				fichero2.createNewFile();
			} catch (IOException e) {

				e.printStackTrace();
			}
			System.out.println("El fichero dos.java sea creado");
		} else {
			System.out.println("El fichero dos.java ya existe");
		}

		// Creo el tercer archivo
		if (fichero3.exists() == false) {
			try {
				fichero3.createNewFile();
			} catch (IOException e) {

				e.printStackTrace();
			}
			System.out.println("El fichero tres.java sea creado");
		} else {
			System.out.println("El fichero tres.java ya existe");
		}

		// Creo el cuarto archivo
		if (fichero4.exists() == false) {
			try {
				fichero4.createNewFile();
			} catch (IOException e) {

				e.printStackTrace();
			}
			System.out.println("El fichero cuatro.java sea creado");
		} else {
			System.out.println("El fichero cuatro.java ya existe");
		}

		// Realizo el metodo del archivo1
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fichero1));
			int numeros = 0;
			for (int i = 0; i <= 10; i++) {
				numeros++;
			}
			bw.write(numeros);
			bw.close();
		} catch (IOException io) {
			System.out.println("Error en el uno.java");
		}

		// Realizo el metodo para el archivo2
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fichero2));
			Scanner sc = new Scanner(System.in);
			System.out.println("Dime el area del triangulo: ");
			String formula = sc.nextLine();
			bw.write(formula);
			sc.close();
			bw.close();
		} catch (IOException io) {
			System.out.println("Error en el dos.java");
		}

		// Realizo el metodo para el archivo3
		try {
			BufferedReader bf = new BufferedReader(new FileReader("C:\\EjercicioStream\\datos.txt"));
			String linea = "";
			while (linea != null) {
				System.out.println(linea);
				linea = bf.readLine();
			}
			bf.close();
		} catch (IOException io) {
			System.out.println("Error en el tres.java");
		}

		// Creo el metodo para el archivo4 que sera aleatorio
		try {
			BufferedReader bf = new BufferedReader(new FileReader("C:\\EjercicioStream\\datos.txt"));

			RandomAccessFile random = new RandomAccessFile(ficherotexto, "rw");

			String linea = "";
			while (linea != null) {

				for (int i = 0; i < linea.length(); i++) {
					random.writeUTF(linea);
				}
				linea = bf.readLine();
			}
			bf.close();

			random.close();
		} catch (IOException io) {
			System.out.println("Error en el cuatro.java");
		}
	}

}
