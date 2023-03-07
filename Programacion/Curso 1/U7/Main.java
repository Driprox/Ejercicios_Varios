package U7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Ingreso> ingreso = new ArrayList<>();
		String x, nombrefichero, nombreficherolectura, codigomed;
		do {
			System.out.println("Dime la hora en la que ingresa (H:Min): ");
			int h = sc.nextInt();
			int min = sc.nextInt();
			Hora horaentrada = new Hora(h, min);

			System.out.println("Dime la hora en la que sale (H:Min): ");
			h = sc.nextInt();
			min = sc.nextInt();
			Hora horaalta = new Hora(h, min);
			sc.nextLine();

			System.out.println("Dime el codigo del medico: ");
			String codigomedico = sc.nextLine();
			System.out.println("Dime el codigo de la seguridad social ");
			String numeross = sc.nextLine();
			grado valor = grado.Moderado;
			System.out.println("Dime la gravedad del 0 al 2 ");
			int gravedad = sc.nextInt();
			switch (gravedad) {
			case 0:
				valor = grado.Moderado;
				break;
			case 1:
				valor = grado.Leve;
				break;
			case 2:
				valor = grado.Grave;
				break;
			default:
				System.out.println("No se a introducido un numero correcto");
			}
			ingreso.add(new Ingreso(horaentrada, horaalta, valor, codigomedico, numeross));
			sc.nextLine();
			System.out.println("Quieres escribir otro: ");
			x = sc.nextLine();

		} while (x.equals("s"));
		System.out.println("Dime el dia: ");
		int dia = sc.nextInt();
		System.out.println("Dime el mes: ");
		int mes = sc.nextInt();
		Urgencia ur = new Urgencia(dia, mes, ingreso);

		ur.agregar(ingreso);
		System.out.println("Los ingresos atendidos son: " + ur.atendido());
		sc.nextLine();
		System.out.println("Dime el codigo del medico: ");
		codigomed = sc.nextLine();
		System.out.println("El numero es: " + ur.pacientesPorMedico(codigomed));
		System.out.println("Fichero de lectura: ");
		nombreficherolectura = sc.nextLine();
		ur.agregaServicio(nombreficherolectura);
		System.out.println("La diferencia es de " + ur.ingresosPorTiempoDeAtencion());
		System.out.println("Se escribira en: ");
		nombrefichero = sc.nextLine();
		ur.escribefichero(nombrefichero, ur);

		sc.close();

		System.out.println(ur);
	}

}
