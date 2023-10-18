package Semana2;

import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\fInforme o primeiro valor inteiro: ");
        int valor1 = in.nextInt();
        System.out.println("Informe o segundi valor inteiro: ");
        int valor2 = in.nextInt();

        System.out.println("Resultado: " + (valor1 + valor2));
    }
}
