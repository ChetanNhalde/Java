import java.util.Scanner;

public class Divisible{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a;
	System.out.println("Enter Number: ");
	a = sc.nextInt();
	if(a%5 == 0 && a%7 == 0) System.out.println("The Number is divisible by 5 and 7");
	else System.out.println("The Number is not divisible by 5 and 7");
}
}