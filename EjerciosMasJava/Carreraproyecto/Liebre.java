package Carreraproyecto;

public class Liebre implements Runnable {//Aqui en est clase he querido implentar Runnable para hacerlo diferente a la clase tortuga

  @Override
  public void run() {//Comienzo con el método run que se usa tambien en runnable
    int i = 1;//Nombro la valriable a la cual le he dado el valor que contendra el inicio de la carrera
    System.out.println("La liebre empieza");//Señalo cuando comienza el metodo con un mensaje
    while (i <= 10) {//Realizo el bucle while para que cumpla la condición hasta llegar al valor i=10 que sera la longitud que recorra 
      try {//Introduzco la instrución de la clase Thread que es Thread.sleep para que la toruga tarde 5 segundos en incrementar en 1 cada numero hasta el 10 y le añado el mensaje para que se mestre en la pantalla
        Thread.sleep(1000);//El try y catch los ha generado neatbeans con la excepción
        System.out.println("La liebre lleva " + i + " m");//Imprimira  el contador de la carrera hasta que termine el bucle
      } catch (InterruptedException e) {
      }
      i++;//Procedo a incrementarar el valor en +1 hasta que llege a 10
    }//Finaliza el while
    System.out.println("La liebre ha terminado");//Marco el final para saber cuando acaba el hilo en la carrera
  }//Final de metodo run
}//Finaliza la clase liebre
