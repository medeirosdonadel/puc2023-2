package Semana7;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        int num = 100;
        int cont = 0;

        while (cont < 50)
            if (num % 7 == 0) {
                cont++;
                System.out.println("O" + cont + "o número divisível por 7 é: " + num);
            }
        num++;
    }
}
