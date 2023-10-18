package TDE.Lista1;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a quantia em R$: ");
        int quantia = in.nextInt();

        int notas100 = quantia / 100;
        quantia %= 100;

        int notas50 = quantia / 50;
        quantia %= 50;

        int notas20 = quantia / 20;
        quantia %= 20;

        int notas10 = quantia / 10;
        quantia %= 10;

        int notas5 = quantia / 5;
        quantia %= 5;

        int notas2 = quantia / 2;
        quantia %= 2;

        int notas1 = quantia;

        System.out.println("Notas de 100: " + notas100);
        System.out.println("Notas de 50: " + notas50);
        System.out.println("Notas de 20: " + notas20);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 5: " + notas5);
        System.out.println("Notas de 2: " + notas2);
        System.out.println("Notas de 1: " + notas1);
        
    }
}
