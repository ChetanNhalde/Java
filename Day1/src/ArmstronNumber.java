import java.util.Scanner;

public class ArmstronNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        int originalNum, remainder, result = 0, n = 0;

        originalNum = num;

        for (;originalNum != 0; originalNum /= 10, ++n);

        originalNum = num;

        for (;originalNum != 0; originalNum /= 10) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
