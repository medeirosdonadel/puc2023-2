package TDE.Lista1;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do raio 1: ");
        double raio1 = in.nextDouble();
        System.out.println("Digite o valor do raio 2: ");
        double raio2 = in.nextDouble();
        System.out.println("Digite o valor da altura 1:  ");
        double altura1 = in.nextDouble();
        System.out.println("Digite o valor altura 2: ");
        double altura2 = in.nextDouble();
        System.out.println("Digite o valor altura 3: ");
        double altura3 = in.nextDouble();

        double cone = Math.PI * ((Math.pow(raio1, 2) + raio1 * raio2 + (Math.pow(raio2, 2))) * altura3) / 3;
        double cilindro1 = Math.PI*Math.pow(raio1, 2)*altura1;
        double cilindro2 = Math.PI*Math.pow(raio2, 2)*altura2;
        double volumeGarrafa = cone + cilindro1 + cilindro2;

        System.out.println("Volume da garrafa é: " + volumeGarrafa);

    }
}
