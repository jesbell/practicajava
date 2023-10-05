/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionesejercicio05;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ExcepcionesEjercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random rand = new Random();
        int max = 500, min= 1, intentos=0;
        int num = rand.nextInt(max-min+1);
        int adivina = 0;
        boolean adivino = true;
        String number;
        System.out.println("Adivina el número entre 1 y 500");
        do {
            System.out.println("Ingresa numero");
            number = leer.next();
            intentos++;
            try {
                adivina = Integer.parseInt(number);
                if(adivina > num)
                    System.out.println("El numero es menor");
                else if(adivina < num)
                    System.out.println("El numero es mayor");
                else{
                    System.out.println("CORRECTO! has adivinado");
                    adivino = false;
                }
                    
            } catch (NumberFormatException  e) {
                System.out.println("no es un número");
            }
            
        } while (adivino);
        System.out.println("Intentos: "+intentos);
        
    }
    
}
