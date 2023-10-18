package Semana2;
import java.util.Scanner;

public class Programa04 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("\fInforme um valor inteiro positivo: ");
        int numero = in.nextInt();

        System.out.println("Resultado 1: " + (numero + 2));
        System.out.println("Resultado 2: " + (numero - 2));
        System.out.println("Resultado 3: " + (2 * numero));
        System.out.println("Resultado 4: " + (numero / 2));
        System.out.println("Resultado 5: " + (numero / 2.0));
        System.out.println("Resultado 6: " + Math.sqrt(numero));
    }
}