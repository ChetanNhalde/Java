import java.util.Scanner;

public class Fact{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int fact = 1;
	System.out.println("Enter the number: ");
	int a = sc.nextInt();
	for(int i=1;i<=a;i++) {
	fact *= i;
}
System.out.println("Factorial: " + fact);
}
}