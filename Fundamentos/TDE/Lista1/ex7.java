package TDE.Lista1;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro valor inteiro: ");
        int n1 = in.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        int n2 = in.nextInt();

        double soma = n1 + n2;
        double dif = n1 - n2;
        double media = (n1 + n2) / 2;
        double abs = Math.abs(dif);
        double maior = (soma + abs) / 2;
        double menor = (soma - abs) / 2;

        System.out.println("A soma dos número é: " + soma);
        System.out.println("A difereça dos números: " + dif);
        System.out.println("A média dos números é: " + media);
        System.out.println("O valor absoluto é: " + abs);
        System.out.println("O maior dos dois é: "+maior);
        System.out.println("O menor dos dois é: "+menor);

    }
}
