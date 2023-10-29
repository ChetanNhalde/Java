import java.util.Scanner;

public class PizzaShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double total = 0.0;

        while (true) {
            System.out.println("Welcome to our Pizza Shop");
            System.out.println("1. Margherita Pizza - 500");
            System.out.println("2. Veggie Pizza - 600");
            System.out.println("3. Chicken Pizza - 700");
            System.out.println("4. Exit and print total amount");
            System.out.println("Enter your choice:");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    total += 500;
                    System.out.println("You ordered a Margherita Pizza. Current total: " + total);
                    break;
                case 2:
                    total += 600;
                    System.out.println("You ordered a Veggie Pizza. Current total: " + total);
                    break;
                case 3:
                    total += 700;
                    System.out.println("You ordered a Chicken Pizza. Current total: " + total);
                    break;
                case 4:
                    System.out.println("Thank you for your order. Your total amount is: " + total);
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please choose between 1-4.");
            }
        }
    }
}
