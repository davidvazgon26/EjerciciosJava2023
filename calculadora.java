import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingresa el primer numero");
            double num1 = scanner.nextDouble();
            System.out.println("Ingresa el segundo numero");
            double num2 = scanner.nextDouble();
            double resultado = num1 + num2;
            System.out.println("El resultado ahora es: " + resultado);
        }

    }
}
