import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = in.nextDouble();

        System.out.println("Digite o valor de b: ");
        double b = in.nextDouble();

        System.out.println("Digite o valor de c: ");
        double c = in.nextDouble();

        double media = (a + b + c) / 3;

        System.out.println("A média aritmética é: " + media);

    }
}