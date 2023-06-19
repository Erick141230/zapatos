
/**
 * Write a description of class Zapateria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
//----------- Made by Erick Florez
public class Zapateria
{
    // instance variables - replace the example below with your own
    public static void main (String[] args){
        // An instance of the Scanner object is created.
        Scanner sc = new Scanner(System.in);
        
        // Variables are declared
        int numZapatos, costos, num, i;
        double valorTotal;
        int talla_35 = 0, talla_36 = 0, talla_37 = 0, talla_38 = 0, talla_39 = 0, talla_40 = 0;
        
        // A console output is created and data is collected, then a variable called valorTotal is created.
        System.out.println("Digite cuantos pares de zapatos se adquirieron");
        numZapatos = sc.nextInt();
        valorTotal = 0;
        
        // Now a for loop is created that repeats for the number of shoes.
        for (i = 0; i < numZapatos; i++) {
            System.out.println("Digite la talla del par de zapatos");
            num = sc.nextInt();
            // We create a switch statement based on the size number
            switch (num) {
                case 35:
                    talla_35 = talla_35 + 1;
                    break;
                case 36:
                    talla_36 = talla_36 + 1;
                    break;
                case 37:
                    talla_37 = talla_37 + 1;
                    break;
                case 38:
                    talla_38 = talla_38 + 1;
                    break;
                case 39:
                    talla_39 = talla_39 + 1;
                    break;
                case 40:
                    talla_40 = talla_40 + 1;
                    break;
                default:
                    System.out.println("La talla ingresada no es valida.");
                    break;
            }
            System.out.println("Digite el costo del par de zapatos");
            costos = sc.nextInt();
            // The cost of each shoe entered into the system is added to the variable valorTotal
            valorTotal = valorTotal + costos;
        }
        System.out.println("Se compro "+ talla_35 +" pares de zapatos de la talla 35.");
        System.out.println("Se compro "+ talla_36 +" pares de zapatos de la talla 36.");
        System.out.println("Se compro "+ talla_37 +" pares de zapatos de la talla 37.");
        System.out.println("Se compro "+ talla_38 +" pares de zapatos de la talla 38.");
        System.out.println("Se compro "+ talla_39 +" pares de zapatos de la talla 39.");
        System.out.println("Se compro "+ talla_40 +" pares de zapatos de la talla 40.");
        System.out.println("Con un gato total de: " + valorTotal);
        
    }
}
