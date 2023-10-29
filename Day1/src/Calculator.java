import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Enter an operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("The result is: " + (num1 + num2));
                break;
            case '-':
                System.out.println("The result is: " + (num1 - num2));
                break;
            case '*':
                System.out.println("The result is: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("The result is: " + ((double) num1 / num2));
                } else {
                    System.out.println("Error! Dividing by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator! Please enter either +, -, * or /.");
        }
    }
}
