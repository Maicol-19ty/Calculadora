import java.util.Scanner;

public class Calculadora {

    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static int sumar(int a, int b) {
        return a + b;
    }
    public static double dividir(int a, int b){
        if (b ==0) {
            System.out.println("Error no se puede dividir por cero");
            return Double.NaN;
        }
        return (double) a / b;
    }
    public static int restar(int a, int b) {
        return a - b;
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

        double resultadoDivision = dividir(numero1, numero2);
        System.out.println("El resultado de la división es: " + resultadoDivision);

        int resultadoResta = restar(numero1, numero2);
        System.out.println("El resultado de la resta es: " + resultadoResta);

        scanner.close();
    }
}

