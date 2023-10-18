import java.util.Scanner;

public class EduardoDonadel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int n1 = in.nextInt();
        System.out.println("Digite o segundo número");
        int n2 = in.nextInt();
        System.out.println("Digite o terceiro número");
        int n3 = in.nextInt();
        System.out.println("Digite: 1 para ordem crescene, 2 para ordem descrescente e 3 para por o maior entre eles");
        int opcao = in.nextInt();

        if (opcao == 2) {
            if (n1 > n2 && n2 > n3) {
                System.out.println(n1 + ", " + n2 + ", " + n3);
            } else if (n2 > n1 && n1 > n3) {
                System.out.println(n2 + ", " + n1 + ", " + n3);
            } else if (n1 > n3 && n3 > n2) {
                System.out.println(n1 + ", " + n3 + ", " + n2);
            } else if (n2 > n3 && n3 > n1) {
                System.out.println(n2 + ", " + n3 + ", " + n1);
            } else if (n3 > n1 && n1 > n2) {
                System.out.println(n3 + ", " + n1 + ", " + n2);
            } else if (n3 > n2 && n2 > n1) {
                System.out.println(n3 + ", " + n2 + ", " + n1);
            }

        } else if (opcao == 1) {
            if (n1 > n2 && n2 > n3) {
                System.out.println(n3 + ", " + n2 + ", " + n1);
            } else if (n2 > n1 && n1 > n3) {
                System.out.println(n1 + ", " + n1 + ", " + n2);
            } else if (n1 > n3 && n3 > n2) {
                System.out.println(n2 + ", " + n3 + ", " + n1);
            } else if (n2 > n3 && n3 > n1) {
                System.out.println(n1 + ", " + n3 + ", " + n2);
            } else if (n3 > n1 && n1 > n2) {
                System.out.println(n2 + ", " + n1 + ", " + n3);
            } else if (n3 > n2 && n2 > n1) {
                System.out.println(n1 + ", " + n2 + ", " + n3);
            }

        } else if (opcao == 3) {
            if (n1 > n2 && n2 > n3) {
                System.out.println(n3 + ", " + n1 + ", " + n2);
            } else if (n2 > n1 && n1 > n3) {
                System.out.println(n1 + ", " + n2 + ", " + n1);
            } else if (n1 > n3 && n3 > n2) {
                System.out.println(n2 + ", " + n1 + ", " + n3);
            } else if (n2 > n3 && n3 > n1) {
                System.out.println(n1 + ", " + n2 + ", " + n3);
            } else if (n3 > n1 && n1 > n2) {
                System.out.println(n2 + ", " + n3 + ", " + n1);
            } else if (n3 > n2 && n2 > n1) {
                System.out.println(n1 + ", " + n3 + ", " + n2);
            }

        }
        else {
            System.out.println("Opção errada.");
        }

    }
}
