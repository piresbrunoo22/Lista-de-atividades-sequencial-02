import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Troco

        System.out.println("Digite o preço unitário do produto:");
        float preco = sc.nextFloat();

        System.out.println("Digite a quantidade de compra:");
        int qtd = sc.nextInt();

        System.out.println("Digite o valor recebido:");
        float valor = sc.nextFloat();

        float troco = valor - (preco * qtd);

        System.out.printf("Troco = " + troco);
        sc.close();
    }
}
