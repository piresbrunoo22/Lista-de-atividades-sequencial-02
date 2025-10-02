import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pagamento

        System.out.println("Digite o nome do funcionário:");
        String nome = sc.nextLine();

        System.out.println("Digite o valor recebido por hora:");
        Float valor = sc.nextFloat();

        System.out.println("Digite as horas trabalhadas:");
        int hora = sc.nextInt();

        float pagamento = valor * hora;
        System.out.printf("O pagamento para " + nome + " deve ser %.2f",pagamento);

        sc.close();
    }
}
