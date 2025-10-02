import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Retângulo
        System.out.println("Digite a base do retângulo:");
        float base = sc.nextFloat();

        System.out.println("Digite a altura do retângulo:");
        float altura = sc.nextFloat();

        float area = base*altura;
        float perimetro = (base+altura) * 2;
        float diagonal = ((base*base) + (altura*altura));
        double h = Math.sqrt(diagonal);

        System.out.printf("Área:" + area + "\n Perímetro:" + perimetro + "\n Diagonal: %.2f",h);
        sc.close();
    }
}
