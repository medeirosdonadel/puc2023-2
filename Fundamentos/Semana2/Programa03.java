package Semana2;

import java.util.Scanner;

public class Programa03 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("\fInforme o ano que você nasceu (usando 4 dígitos.ex: 1990): ");
        int ano = in.nextInt();
        System.out.println("Você tem (ou terá) " + (2023 - ano) + " anos.");
    }
}