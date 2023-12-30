import java.util.Scanner;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package examen_midiola;

/**
 *
 * @author Usuario
 */
public class Examen_midiola {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         System.out.println("edades");
        int edad;
        
        System.out.println("Ingrese la edad:");
        Scanner ingresar = new Scanner(System.in);
        edad = ingresar.nextInt();
        
        if (edad < 4) {
            System.out.println("Bebé");
        } else if (edad < 18) {
            System.out.println("Menor de edad");
        } else if (edad < 65) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Tercera edad");
        }
    }

    }
   

