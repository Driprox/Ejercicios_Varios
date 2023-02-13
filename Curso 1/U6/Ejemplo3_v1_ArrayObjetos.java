import java.util.Scanner;

//Ejemplo:rellenar el array pidiendo los datos por teclado.
public class Ejemplo3_v1_ArrayObjetos {

	public static void main(String[] args) {
		Vehiculo[] obj_vehiculos=new Vehiculo[3];

		Scanner sc= new Scanner(System.in);
		String matricula,modelo;
		int pcV;
		for (int i=0;i<obj_vehiculos.length;i++) {
			System.out.print("Introduzca matricula del vehiculo[ "+ i+"] ");
			matricula=sc.next();
			System.out.print("Introduzca modelo del vehiculo[ "+ i+"] ");
			modelo=sc.next();
			System.out.print("Introduzca pcV del vehiculo[ "+ i+"] ");
			pcV=sc.nextInt();
			obj_vehiculos[i]=new Vehiculo(matricula,modelo,pcV); 

		}
		for (int i=0;i<obj_vehiculos.length;i++) {
			System.out.println(obj_vehiculos[i].toString());
		}

	}

}
