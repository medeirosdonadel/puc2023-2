package TDE.Lista1;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um valor inteiro de quatro dígitos: ");
        int num = in.nextInt();

        int digito1 = num % 10;
        int digito2 = (num / 10) % 10;
        int digito3 = (num / 100) % 10;
        int digito4 = num / 1000;

        int numeroInvertido = digito1 * 1000 + digito2 * 100 + digito3 * 10 + digito4;
    }
}
