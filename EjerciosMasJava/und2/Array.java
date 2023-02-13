package und2;

public class Array {//Llamo array a la clase que contendra el main para ejecutar el programa

  public static void main(String[] args) {
    Listaprueba lista1 = new Listaprueba();//Llamo a los dos objetos de la misma clase Listaprueba
    Listaprueba lista2 = new Listaprueba();
    lista1.lisnum();//Invoco a los dos metodos que he creado para decirle la cantidad de numeros que quiero imprimir para cada array
    lista2.lisnum();
    System.out.println("------------");//Realizo una separacion entre la solicitud del tamaño y el comienzo de los metodos run de los dos objetos
    lista1.start();//Llamo a los dos metodos run para comenzar el programa y que me diga la lista y me saque los pares ordenados de menor a mayor
    lista2.start();
  }
}
