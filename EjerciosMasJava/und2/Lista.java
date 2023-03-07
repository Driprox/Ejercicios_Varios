package und2;

import java.util.Arrays;

public class Lista  extends Thread{

  public int[] array;

 
  @Override
  public void run() {
    System.out.println("Inicio de la lista ");
  }

  public void listanumero (int numero) {
    array = new int[numero];
    for (int i = 0; i < numero; i++) {
      int aleat = (int) (Math.random() * 99 + 1);
      System.out.println("" + aleat);
      array[i] = aleat;
    }
  }

  public void contarpares(int[] lista) {
    Arrays.sort(lista);
    for (int e = 0; e < lista.length; e++) {
      if (lista[e] % 2 == 0) {
        System.out.println("Es par:\n  " + lista[e]);
      }
    }
  }
}