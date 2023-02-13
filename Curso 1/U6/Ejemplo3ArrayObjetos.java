import java.util.Scanner;

//Ejemplo:incializar un array en su declaracion 
public class Ejemplo3ArrayObjetos {

	public static void main(String[] args) {
		Vehiculo[] obj_vehiculos= {new Vehiculo("4088GML","audi",1900),new Vehiculo("5000kkk","citroen",1600),new Vehiculo("999HML","SEAT",1900)};

		
		
		for (int i=0;i<obj_vehiculos.length;i++) {
			System.out.println(obj_vehiculos[i].toString());
		}
		
	}

}
