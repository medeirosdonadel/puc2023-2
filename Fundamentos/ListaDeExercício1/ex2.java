import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = in.nextDouble();

        System.out.println("Digite o valor de b: ");
        double b = in.nextDouble();

        System.out.println("Digite o valor de c: ");
        double c = in.nextDouble();

        double media = 3 / ((1 / a) + (1 / b) + (1 / c));

        System.out.println("A média harmônica é: " + media);

    }
}