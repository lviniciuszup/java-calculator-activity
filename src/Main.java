public class Main {
    public static void main(String[] args) {
        double x = 25;
        double y = 2;
        char control = '+';

        resolution(x, y, control);
    }
    public static void resolution(double x, double y, char control) {
        if (control == '+') {
            System.out.println(x + " + " + y + " = " + (x + y));
        } else if (control == '-') {
            System.out.println(x + " - " + y + " = " + (x - y));
        } else if (control == '*') {
            System.out.println(x + " * " + y + " = " + (x * y));
        } else if (control == '/') {
            if (y == 0) {
                System.out.println("Erro");
            } else {
                System.out.println(x + " / " + y + " = " + (x / y));
            }
        }
    }
}