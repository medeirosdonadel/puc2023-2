package TDE.Lista1;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a capacidade: ");
        double capacidade = in.nextDouble();
        System.out.println("Digite o consumo médio: ");
        double consumo = in.nextDouble();
        System.out.println("Digite a distância: ");
        double distancia = in.nextDouble();

        double paradas = distancia / (capacidade * consumo);

        System.out.println("Será necessario fazer " + paradas + " paradas");
    }
}
