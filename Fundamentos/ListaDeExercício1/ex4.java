import java.util.Scanner;

public class ex4 {
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double g = 6.67426 * (Math.pow(Math.pow(Math.pow(Math.pow(10, -11), 3), -1), -2)); 
        double m = 5.97 * Math.pow(10, 24);
        

        double h = Math.pow(((g * m * Math.pow(90, 2)) / (4 * Math.pow(Math.PI, 2))), 1/3) - 637100;

        System.out.println(h);
    }
}
