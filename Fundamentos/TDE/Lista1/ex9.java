package TDE.Lista1;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite sua altura em metros: ");
        double altura = in.nextDouble();

        double cem = altura * 10;
        double mil = altura * 100;

        System.out.println("Altura em centímetros: " + cem);
        System.out.println("Altura em milímetros: " + mil);

    }
}
