package Carreraproyecto;

public class Tortuga extends Thread {//En esta clase heredare de la clase Thread

  @Override
  public void run() {//Comienzo con el metodo run propio de thread
    int i = 1;//Marco el valor que contendra el inicio de la carrera
    System.out.println("La tortuga empieza");//Señalo cuando comienza el proceso con un mensaje
    while (i <= 10) {//Realizo el bucle while para que cumpla la condición hasta llegar al valor i=10 que sera la longitud que recorra 
      try {//Introduzco la instrución de la clase Thread que es  Thread.sleep para que la toruga tarde 5 segundos en incrementar en 1 cada numero hasta el 10 y le añado el mensaje para que se mestre en la pantalla
        Thread.sleep(5000);//El try y catch los ha generado neatbeans con la excepción
        System.out.println("La tortuga lleva " + i + " m");//Imprimira  el contador de la carrera hasta que termine el bucle
      } catch (InterruptedException e) {
      }
      i++;//Procedo a incrementarar el valor en +1 hasta que llege a 10
    }//Finaliza el while
    System.out.println("La tortuga ha terminado");//Marco el final para saber cuando acaba el hilo en la carrera
  }//Final de metodo run
}//Finaliza la clase tortuga
