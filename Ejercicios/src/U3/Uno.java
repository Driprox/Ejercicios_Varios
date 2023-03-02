/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U3;

import java.util.Scanner;

/**
 *
 * @author Yo
 */
public class Uno {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Dime un numero: ");
        int numero1=sc.nextInt();
        System.out.println("Dime un numero: ");
        int numero2=sc.nextInt();
        int multiplicacion=numero1*numero2;
        System.out.println("El resultado es: "+multiplicacion);
        //Segunda parte
  System.out.println("Que cantida de euros: ");
         int euro=sc.nextInt();
         int peseta=euro*166;
   System.out.print("Son "+peseta+"pesetas");
   //quinta parte
     System.out.println("Que cantida de megas: ");
         int mb=sc.nextInt();
         int kb=mb*1000;
   System.out.print("Son "+kb+"kb");
//Tercera parte
System.out.println("Dime un numero: ");
        int numero3=sc.nextInt();
        System.out.println("Dime un numero: ");
        int numero4=sc.nextInt();
        int resta=numero3-numero4;
         int suma=numero3+numero4;
        int multiplicacion1=numero3*numero4;
         int divide=numero3/numero4;
 System.out.println(suma+" "+resta+" "+multiplicacion1+" "+divide);
    }
}
