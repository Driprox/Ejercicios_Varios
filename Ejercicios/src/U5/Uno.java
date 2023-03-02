/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U5;

import java.util.Scanner;

/**
 *
 * @author Yo
 */
public class Uno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1,2,3
        /*for(int i=0;i<100;i++){
            if(i%5==0){
            System.out.println("Son"+i);}
        }*/
 /*   int i=0;
       while( i<100){
        i++;
        if(i%5==0){
            System.out.println("Son"+i);}
    }*/
 /* do{
            i++;
            if(i%5==0){
            System.out.println("Son"+i);}
        } while(i<100);*/
        //4
        /* for(int i=320;i>=160;i-=20){          
       System.out.println("Son"+i); 
       }*/
        //7
        /*System.out.println("Dime la combinacion: ");
        int combinacion = sc.nextInt();
        for (int i = 0; i < 4; i++) {
            System.out.println("Dime que crees: ");
            int introducir = sc.nextInt();
            if (introducir == combinacion) {
                System.out.println("Lo has abierto");
                i = 4;
            } else {
                System.out.println("NO lo has abierto te quedan: " +(3-i)  + " intentos");                
                }
            if (i == 3) {
                    System.out.println("Se acbaron los intentos");
            }
        }*/
        //24
        System.out.println("Dime las filas que quieres: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            
            //espacio no tocar
            for (int z = n; z > i; z--) {
                System.out.print(" ");
            }
            
            //System.out.print("*");

            for (int j = 1; j <= i;j++ ) {
                System.out.print("*"); 
                for (int z = 0; z <= i; z++) {
                System.out.print(" ");
            }
                 System.out.print("*");
                  
            } 

        

            System.out.println();
        }
    }
}
