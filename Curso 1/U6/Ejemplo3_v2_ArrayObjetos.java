import java.util.Scanner;

//Ejemplo:incializar un array en su declaracion 
public class Ejemplo3_v2_ArrayObjetos {

	public static void main(String[] args) {
		Vehiculo[] obj_vehiculos=new Vehiculo[3];
		obj_vehiculos[0]=new Vehiculo("4088GML","audi",1900);
		obj_vehiculos[1]=new Vehiculo("5000kkk","citroen",1600);
	    obj_vehiculos[2]=new Vehiculo("999HML","SEAT",1900);

		
		
		for (int i=0;i<obj_vehiculos.length;i++) {
			System.out.println(obj_vehiculos[i].toString());
		}
		
		

	}

}
