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
public class Tres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que sacastes: ");
         int primer=sc.nextInt();
        System.out.println("Que nota quieres sacar: ");   
        int trimestre=sc.nextInt();
        int segundo=(int) (trimestre-(primer*0.4)/0.6);
        System.out.println(" Necesitas sacar: "+segundo);

    }
}
