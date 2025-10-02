import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Circulo

        System.out.println("Digite o valor do raio do circulo:");
        float raio = sc.nextFloat();

        double area = 3.14159 * (raio*raio);


        System.out.println("Area = " + area);

        sc.close();
    }
}
