import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();

        int result = 0;

        try {
            result = n1 / n2;
            System.out.println("result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        }
    }
}