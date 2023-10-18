package TDE.Lista1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        double raio = in.nextDouble();

        double area = 4 * Math.PI * Math.pow(raio, 2);

        System.out.println("A área é = " + area);
    }
}
