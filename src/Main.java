import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scr = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite um segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolhe uma operação entre: +, -, *, / ");
        char operation = scr.next().charAt(0);

        resolution(num1, num2, operation);
    }

    public static void resolution(double num1, double num2, char operation) {

        if (operation == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (operation == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (operation == '*') {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (operation == '/') {
            if (num2 == 0) {
                System.out.println("Meu amor, um número não pode ser dividido por zero! =)");
            } else {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
        }
    }
}