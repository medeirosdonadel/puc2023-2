package TDE.Lista1;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a quantidade de bolinhas: ");
        double bolinhas = in.nextDouble();

        double caixas = Math.ceil(bolinhas / 100);

        System.out.println("Será necessario usar " + caixas + " caixas.");
    }
}
