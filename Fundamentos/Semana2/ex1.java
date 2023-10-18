package Semana2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double p1, p2, me, tf;

        System.out.println("Digite a p1: ");
        p1 = in.nextDouble();
        System.out.println("Digite a p2: ");
        p2 = in.nextDouble();
        System.out.println("Digite a Média dos Exercícios: ");
        me = in.nextDouble();
        System.out.println("Digite o Trabalho final: ");
        tf = in.nextDouble();

        double g1 = (p1 + 2 * p2 + me + 2 * tf) / 6;

        System.out.println(g1);

    }
}
