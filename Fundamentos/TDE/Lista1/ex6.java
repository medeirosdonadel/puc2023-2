package TDE.Lista1;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor em Fahrenheit: ");
        double fah = in.nextDouble();

        double cel = (fah - 32) * 5 / 9;

        System.out.println(cel + " Celsius");

    }
}
