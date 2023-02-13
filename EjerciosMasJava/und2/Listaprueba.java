package und2;

import java.util.*;//He decidido importar todo java util

public class Listaprueba extends Thread {//Uitlizo la herencia de la clase Thread

  private int[] array; //Nombro a las dos variables que seran los atributos de la clase una sera el array y la otra contendra el numero con el tamaño del array
  private int tamaño;

//Metodos
  public void lisnum() {//Este metodo se encargara de pedir el tamaño del array que quiera el usuario con un simple Scanner
    Scanner sc = new Scanner(System.in);
    System.out.println("Cantidad de numeros");
    tamaño = sc.nextInt();
  }//Fin del metodo de la solicitud del tamaño

  @Override//Generado automaticamente por neatbeans
  public void run() {//Este método sera el que muestre el array y me separe los números pares que haya en el,en este metodo se introducira la variable tamaño que se solicito antes y le dara el tamaño del array
    array = new int[tamaño];//Invoco al objeto con el tamaño anterior solicitado
    for (int i = 0; i < array.length; i++) {//Usare el bucle for para ir rellenando el array con números aleatorios usando Math.random con el inetervalo de 1 a 100
      int num = (int) (Math.random() * 99 + 1);//Y los introducire en la variable num
      array[i] = num;
      System.out.println("Lista: " + num);//Luego los imprimo en pantalla
    }//Acaba el for
    Arrays.sort(array);//Invoco Arrays.sort para que me ordene los números pares de menor a mayorque sacare depues del array
    for (int e = 0; e < array.length; e++) {
      if (array[e] % 2 == 0) {//Usare el bucle for para leer el array pero con el condicional if para que solo coga del array los numeros con resto 0 que seran lo pares
        System.out.println("Numero par: " + array[e]);//Imprimo los numeros pares
      }
    }
  }//Finaliza el método run
}//Finaliza la clase ListaPrueba
