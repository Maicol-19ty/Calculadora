import java.util.Scanner;

public class Calculadora {

    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static int sumar(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar primer número
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        // Solicitar segundo número
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        int resultado = multiplicar(numero1, numero2);
        System.out.println("El resultado de la multiplicación es: " + resultado);

        int resultadoSuma = sumar(numero1, numero2);
        System.out.println("El resultado de la suma es: " + resultadoSuma);

        scanner.close();
    }
}

