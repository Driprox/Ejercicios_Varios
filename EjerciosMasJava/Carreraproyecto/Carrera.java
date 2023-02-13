package Carreraproyecto;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Carrera {//Esta clase contendra el main

  public static void main(String[] args) {
    Tortuga tortuga1 = new Tortuga();//Aqui llamo a la creación del objeto tortuga1 de la clase tortuga
    Thread liebre1 = new Thread(new Liebre());//Aqui llamo a la creación del objeto liebre1 de la clase liebre en la cual he usado runable en vez de thread
    System.out.println("Comienza la carrera ");//Introduzco un pequeño texto para dar la sensacion del comienzo de los dos hilos
    tortuga1.start();//Llamo al metodo run de la clase tortuga
    /* try {//Aqui he decidio usar la instrucion join de la clase Thread para retrasar el comienzo del hilo que contiene la clase liebre para que comienze cuando acabe la clase tortuga y continue la siguiente
      tortuga1.join();//El try y el catch con la exception me la ha generado automaticamente el IDE de neatbeans
    } catch (InterruptedException ex) {
      Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
    }*/
    liebre1.start();//Llamo a el metodo run de la clase liebre
  }//Finaliza el main
}
