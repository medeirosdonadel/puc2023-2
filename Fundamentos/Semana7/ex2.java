package Semana7;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double n = in.nextDouble();

        for (int i = 0; i * i < n; i++) {
            double soma = i * i;
            System.out.println(soma);

        }

    }
}
