/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package und2;

import java.util.Scanner;

/**
 *
 * @author FP
 */
public class Main {
//Prorciona un aarray aleatorio de tamaño
  public static void main(String[] args) {
    Nuevoarray lista = new Nuevoarray();
    Nuevoarray lista2 = new Nuevoarray();
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[(int) (Math.random() * 100)];
    for (int i = 0; i < numeros.length; i++) {//introduce los numeros del array
      System.out.println("Introduce un numero: ");
      numeros[i] = sc.nextInt();
    }
    lista.run(numeros);//uso el thread
    System.out.println("Siguiente array");
    lista2.run(numeros);
    
  }
}
