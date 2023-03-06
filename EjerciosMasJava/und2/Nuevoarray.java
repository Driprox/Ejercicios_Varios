/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package und2;

import java.util.Arrays;

/**
 *
 * @author FP
 */
public class Nuevoarray extends Thread {

  public void run(int lista[]) {

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
