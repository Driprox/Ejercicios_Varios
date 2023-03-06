package Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fichero {

	public void leerfichero(String nombreFichero) {
		try {
			BufferedReader bf = new BufferedReader(new FileReader(nombreFichero));
			String linea = "";

			while (linea != null) {

				System.out.println(linea);
				linea = bf.readLine();

			}
			bf.close();
		} catch (IOException io) {
			System.out.println("Error de lectura");
		}
	}

	public void ficheroestadistica(String nombreFichero) {
		try {
			BufferedReader bf = new BufferedReader(new FileReader(nombreFichero));
			String linea = "";
			int cuentalineas = 0;
			int cuentaletras = 0;
			while (linea != null) {
				for (int i = 0; i < linea.length(); i++) {
					if (linea.charAt(i) != ' ') {
						cuentaletras++;
					}
				}
				cuentalineas++;
				linea = bf.readLine();
			}
			cuentalineas--;
			System.out.println("El numero de lineas es: " + cuentalineas);
			System.out.println("El numero de letras es: " + cuentaletras);
			bf.close();
		} catch (IOException io) {
			System.out.println("Error de lectura");
		}
	}

	public void escritura(String nombreFichero) {

		File fichero = new File(nombreFichero);

		try {
			if (fichero.exists() == false) {
				fichero.createNewFile();
				System.out.println("Fichero creado");
			} else {
				System.out.println("El archivo ya existe");
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero, true));
			Scanner sc = new Scanner(System.in);
			System.out.println("Que quieres escribir: ");
			String texto = sc.nextLine();
			bw.write(texto);
			sc.close();
			bw.newLine();
			bw.flush();
			bw.close();
			System.out.println("Se termino de escribir");
		} catch (IOException io) {
			System.out.println("Error de escritura");
		}

	}
}
