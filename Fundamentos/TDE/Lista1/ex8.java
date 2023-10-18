package TDE.Lista1;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double larT, compT, larC, compC;

        System.out.println("Digite a largura do terreno: ");
        larT = in.nextDouble();
        System.out.println("Digite o comprimento do terreno: ");
        compT = in.nextDouble();
        System.out.println("Digite a largura da casa: ");
        larC = in.nextDouble();
        System.out.println("Digite o comprimento da casa: ");
        compC = in.nextDouble();

        double areaT = larT * compT;
        double areaC = larC * compC;
        double areaLivre = areaT - areaC;

        System.out.println("A área livre no terreno é: " + areaLivre);
    }
}
