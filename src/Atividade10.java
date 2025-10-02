import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Duração

        System.out.println("Digite a duração em segundos:");
        int time = sc.nextInt();

        int hora = time / 3600;
        int minuto = (time % 3600) / 60;
        int segundo = time % 60;

        System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);

        sc.close();
    }
}