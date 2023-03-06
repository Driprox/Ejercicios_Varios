
package und2;

import java.util.Arrays;


public class Nuevoarray extends Thread {

  public void run(int lista[]) {
//Listo y ordeno el array solicitado con las siguientes condiciones de accesso
    for (int e = 0; e < lista.length; e++) {
      if ((lista[e] >= 1) && (lista[e] <= 100)) {
        if (lista[e] % 2 == 0) {

          System.out.println("Numero par: " + lista[e]);
        }
      }

    }
    Arrays.sort(lista);
  }
}
