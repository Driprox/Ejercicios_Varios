/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U4;

import java.util.Scanner;

/**
 *
 * @author Yo
 */
public class Uno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //1
        /* String dia;
        System.out.println("Dime un dia de la semana");
        dia = sc.nextLine();
        switch (dia) {
            case "L":
                System.out.println("TOCAL");
                break;
            case "M":
                System.out.println("TOCAM");
                break;
            case "X":
                System.out.println("TOCAX");
                break;
            case "J":
                System.out.println("TOCAJ");
                break;
            case "V":
                System.out.println("TOCAV");
                break;
            case "S":
                System.out.println("TOCAS");
                break;
            case "D":
                System.out.println("TOCAD");
                break;
           default:
        }*/
//2
/*System.out.println("Dime una");
        int hora = sc.nextInt();
        if((hora>=6) && (hora<=12)){
        System.out.println("Buenos dias");   
        }
        if((hora>=13) && (hora<=20)){   
            System.out.println("Buenos tardes");
        }
        if((hora>=21) && (hora<=5)){   
            System.out.println("Buenos noches");
        }  */
//3
/*String dia;
        System.out.println("Dime un dia de la semana");
        dia = sc.nextLine();
switch (dia) {
            case "1":
                System.out.println("TOCAL");
                break;
            case "2":
                System.out.println("TOCAM");
                break;
            case "3":
                System.out.println("TOCAX");
                break;
            case "4":
                System.out.println("TOCAJ");
                break;
            case "5":
                System.out.println("TOCAV");
                break;
            case "6":
                System.out.println("TOCAS");
                break;
            case "7":
                System.out.println("TOCAD");
                break;
           default:
        }*/
//4
/*System.out.print("Dime las horas");

int hora =sc.nextInt();

if ((hora>=1) && (hora<=40)){
    int horastotales=hora*12;
        System.out.println("En total son: "+horastotales);
}else{
   int horastotales=hora*16;
        System.out.println("En total son: "+horastotales);
}*/
//5
/*int a,b;
System.out.print("Dime a");
a = sc.nextInt();
System.out.print("Dime b");
b = sc.nextInt();
if(( a==0) || ( b==0)){
 System.out.print("No es valido");
}else{
    double resultado=(double)b/(double)-a;
    System.out.println("X="+resultado);
}*/
        //10
       /* int dia, mes;
        System.out.println("Dime mes");
        mes = sc.nextInt();
        dia = sc.nextInt();
        switch (mes) {
            case 2:
                if (dia <= 12) {
                      System.out.println(" mes2");
                } else {
                    System.out.println("otro mes3");
                }
                break;
            case 3:
                if (dia <= 12) {
                    System.out.println(" mes3");
                } else {
                    System.out.println("otro mes2");
                }
                break;
            case 1:
                if (dia <= 12) {
                    System.out.println(" mes1");
                } else {
                    System.out.println("otro mes1");
                }
                break;
            default:
        }*/
//11
/*int hora,minuto;
System.out.print("Dime hora");
hora = sc.nextInt();
System.out.print("Dime minuto");
minuto = sc.nextInt();
int horafalta=24-hora;
int minutofalta=60-minuto;
int horaminuto=horafalta*60;
int minutosegundo=minutofalta*60;
int horasegundo=horaminuto*60;
int total=horasegundo+minutosegundo;
System.out.print("Total: "+total);*/

    }
}
