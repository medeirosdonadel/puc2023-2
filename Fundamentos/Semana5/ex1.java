package Semana5;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\fDigite a altura da pessoa: ");
        double altura = in.nextDouble();

        System.out.println("Digite 1 para o sexo feminino e 2 para o masculino: ");
        int sexo = in.nextInt();

        if (sexo == 2) {
            double pesoIdeal = 72.7 * altura - 58;
            System.out.println("Peso ideal é: " + pesoIdeal + "kg");
        } else {
            double pesoIdeal = 62.1 * altura - 44.7;
            System.out.println("Peso ideal é: " + pesoIdeal + "kg");
        }
    }
}
