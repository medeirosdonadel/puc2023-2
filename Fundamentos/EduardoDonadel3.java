import java.util.Scanner;

public class EduardoDonadel3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o nome da cidade: ");
        String cidade = in.nextLine();

        System.out.println("Digite o número de eleitores na cidade: ");
        int numEleitores = in.nextInt();

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int votoBraco = 0;
        int nulo = 0;

        for (int i = 0; i < numEleitores; i++) {
            System.out.println("Digite em quem deseja votar: ");
            int voto = in.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                case 0:
                    votoBraco++;
                    break;
                default:
                    nulo++;
                    break;
            }
        }

        System.out.println("Candidato 1: " + candidato1 + " voto(s).");
        System.out.println("Candidato 2: " + candidato2 + " voto(s).");
        System.out.println("Candidato 3: " + candidato3 + " voto(s).");
        System.out.println("Candidato 4: " + candidato4 + " voto(s).");
        System.out.println("Branco(s): " + votoBraco + " voto(s).");
        System.out.println("Nulo(s): " + nulo + " voto(s).");

    }
}
