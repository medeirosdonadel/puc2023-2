package TDE.Lista1;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo em segundos: ");
        int segundos = scanner.nextInt();

        int horas = segundos / 3600;
        int restoS = segundos % 3600;
        int minutos = restoS / 60;
        int segundos1 = restoS % 60;

        System.out.println("Tempo decomposto:");
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos1);

        
    }
}
