package Semana5;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor real: ");
        double real = in.nextDouble();

        if (real == 0) {
            System.out.println("Valor é zero!");
        } 
        if (real > 0) {
            System.out.println("Valor é positivo!");
        } 
        if (real < 0){
            System.out.println("Valor é negativo!");

        }
        if (1 > Math.abs(real)) {
            System.out.println("Valor é pequeno!");
        } 
        if (1000000 < Math.abs(real)) {
            System.out.println("Valor é grande!");
        }
    }
}
