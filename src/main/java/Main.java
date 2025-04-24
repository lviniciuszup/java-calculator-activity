import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite um segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolhe uma operação entre: +, -, *, / ");
        char operation = scanner.next().charAt(0);

        resolution(num1, num2, operation);
    }

    public static double calcular(double num1, double num2, char operation){
        return switch (operation){
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if (num2 == 0){
                    throw new ArithmeticException("Divisão por zero!");
                }
                yield num1 / num2;
            }
            default -> throw new IllegalArgumentException("Operação inválida");
        };
    }

    public static void resolution(double num1, double num2, char operation) {
       try{
           double resultado = calcular(num1, num2, operation);
           System.out.println("Resposta "+ resultado);
       }catch (ArithmeticException | IllegalArgumentException e){
           System.out.println("Erro: "+ e.getMessage());
       }
    }
}
