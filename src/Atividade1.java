import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
        //Terreno
    System.out.println("Digite a largura do terreno:");
       float largura = sc.nextFloat();

       System.out.println("Digite o comprimento do terreno:");
       float comprimento = sc.nextFloat();

       System.out.println("Digite o valor do metro quadrado:");
       float m2 = sc.nextFloat();

        float area = largura * comprimento;
        float preco = area * m2;

        System.out.printf("Area do terreno:" + area + "\n");
        System.out.printf("Preço do terreno:" + preco);
        sc.close();
    }
}
