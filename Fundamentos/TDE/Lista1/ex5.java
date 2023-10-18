package TDE.Lista1;

import java.util.Scanner;

public class ex5 {
    private static final double Ma = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = in.nextDouble();

        double n2 = Math.pow(num, 2);
        double n3 = Math.pow(num, 3);
        double n4 = Math.pow(num, 4);

        System.out.println(n2 + " " + n3 + " " +n4);


    }
}
