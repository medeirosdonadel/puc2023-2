package Semana6;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o saldo");
        double saldo = in.nextDouble();
        System.out.println("Digite 1 para ver o saldo.");
        System.out.println("Digite 2 para sacar o saldo.");
        System.out.println("Digite 3 para creditar um valor.");
        int menu = in.nextInt();

        switch (menu) {
            case 1:
                System.out.println("O saldo da conta é" + saldo);
                break;
            case 2:
                System.out.println("Quanto deseja sacar: ");
                double valor = in.nextDouble();
                if (valor < saldo) {
                    saldo = saldo - valor;
                    System.out.println("O saldo atual é: " + saldo);
                } else
                    System.out.println("Saldo insuficiente:");
                break;
            case 3:
                System.out.println("Quanto deseja depositar: ");
                valor = in.nextDouble();
                if (valor > 0) {
                    saldo = saldo - valor;
                    System.out.println("O saldo atual é: " + saldo);
                } else
                    System.out.println("Valor incorreto");
                break;
        }

    }
}
