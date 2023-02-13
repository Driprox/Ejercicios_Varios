import java.util.Scanner;

public class Principalbase {
	public static void main(String[] args) {
		String nombre, apellido, curso, respuesta; // Nombro las variables que usare en la clase principal
		int edad, asig;

		Acceso ac = new Acceso();// Llamo a la clase Acceso y a un escaner para comenzar
		Scanner sc = new Scanner(System.in);
		ac.conectar();// Comienzo la sesion en la BBDD

		do {// Creo el metodo do while para que pregunte cuantos alumnos quiero crear y asi
			// agregar mas sin tener que iniciar varias veces el metodo de insertar

			System.out.print("Nombre: ");// Aqui hire solicitando todos los datos por pantalla para crear el alumno
			nombre = sc.nextLine();
			System.out.print("Apellidos: ");
			apellido = sc.nextLine();
			System.out.print("Curso: ");
			curso = sc.nextLine();
			System.out.print("Edad: ");
			edad = sc.nextInt();
			System.out.print("Numero de asiganturas: ");
			asig = sc.nextInt();

			Alumno alum = new Alumno(nombre, apellido, curso, edad, asig);// Llamo al alumno al que le introduzco los
																			// datos anteriores
			ac.insertarAlumno(alum);// Inserto el alumno creado con el metodo insertar

			sc.nextLine();

			System.out.println("Quiere dar de alta otro usuario s/n: ");// Pregunto si quiere insertar otro
			respuesta = sc.nextLine();

		} while (respuesta.equals("s"));

		sc.close();

		ac.listarAlumno();// Llamo al metodo de listaralumno y me lo mostrara en pantalla

		ac.salir();// Cierro la sesion en la BBDD

		System.out.println("Aplicacion cerrada");

	}
}
