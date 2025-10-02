import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Consumo

        System.out.println("Digite a distância percorrida:");
        int dis = sc.nextInt();

        System.out.println("Digite o combustível:");
        float com = sc.nextFloat();

        float media = dis / com;

        System.out.printf("Consumo médio = %.3f", media );

        sc.close();
    }
}
