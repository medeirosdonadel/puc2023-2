import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro cateto: ");
        double c1 = in.nextDouble();
        System.out.println("Digite o segundo cateto: ");
        double c2 = in.nextDouble();
        
        double hip = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));

        System.out.println("Hipotenusa: "+ hip);
    }
}
