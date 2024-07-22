import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a base: ");
        double base = scanner.nextDouble();

        System.out.println("Entre com a altura");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("Área: " + area);
    }
}