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
public class Dos {
   
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
       System.out.println("alturarectangulo: ");
         int alturarect = sc.nextInt();
       System.out.println("baserectangulo: ");
         int baserect = sc.nextInt();
        System.out.println("basetriangulo: ");
         int basetriangulo = sc.nextInt();
          System.out.println("alturatriangu: ");
         int alturatrian = sc.nextInt();
        int arearectangulo=baserect*alturarect;
    
        int areatriangulo =basetriangulo*alturatrian/2;
        System.out.println("rectangulo: "+arearectangulo);
        System.out.println("triangulo: "+areatriangulo);
        //Segunda parte
        System.out.println("Valor del producto");
        int productocatidad=sc.nextInt();
        double producoiva=productocatidad*0.21;
        double productototal=productocatidad+producoiva;
        System.err.println("total es :"+productototal);
        //Tercera
        System.out.print("Horas trabajaas: ");
        int horas=sc.nextInt();
        int horastotales=horas*12;
        System.out.println("En total son: "+horastotales);
        //cuarta
        System.out.println("Altura del cono: ");
        int alturacono=sc.nextInt();
        System.out.println("Radio del cono");
        int radiocono=sc.nextInt();
        double volumen=3.14*(radiocono*radiocono)*alturacono/3;
        System.out.println("El volumen es : "+volumen);
    }
}
