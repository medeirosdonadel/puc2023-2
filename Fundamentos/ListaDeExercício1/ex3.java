import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor em metros: ");
        double a = in.nextDouble();

        double deci = a * 10;
        double centi = a * 100;
        double mili = a * 1000;

        System.out.println("Valor em decímetros: " + deci );
        System.out.println("Valor em centímetros: " + centi );
        System.out.println("Valor em milímetros: " + mili );

    }
    
}
