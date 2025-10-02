import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Idades

        System.out.println("Dados da primeira pessoa:");
        System.out.println("Digite o 1º nome:");
        String nome = sc.nextLine();
        System.out.println("Digite a 1º idade:");
        Float idade = sc.nextFloat();
        sc.nextLine();

        System.out.println("\nDados da segunda pessoa:");
        System.out.println("Digite o 2º nome:");
        String nome2 = sc.nextLine();
        System.out.println("Digite a 2º idade:");
        float idade2 = sc.nextFloat();


        float media = (idade + idade2) / 2;

        System.out.printf("A idade média de "  + nome + " e " + nome2 + " é de " + media + " anos");
        sc.close();
    }
}
