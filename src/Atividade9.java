import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Medidas

        System.out.println("Digite a medida A:");
        float a = sc.nextFloat();

        System.out.println("Digite a medida B:");
        float b = sc.nextFloat();

        System.out.println("Digite a medida C:");
        float c = sc.nextFloat();

        float quad = a * a;
        float tri = a * b;
        float trap = (a + b) * c / 2; 


        System.out.printf("Area do Quadrado: %.4f\n" ,quad);
        System.out.printf("Area do Triângulo: %.4f\n", tri);
        System.out.printf("Area do Trapézio: %4.f", trap);
        
        sc.close();
    }
}
