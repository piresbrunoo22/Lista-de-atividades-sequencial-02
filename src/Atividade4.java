import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Soma

        System.out.println("Digite o valor de X:");
        int x = sc.nextInt();

        System.out.println("Digite o valor de Y:");
        int y = sc.nextInt();

        int soma = x + y;
        System.out.printf("Soma = " + soma);
        sc.close();
    }
}
