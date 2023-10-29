import java.util.Scanner;

public class Triangle{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	System.out.print("Enter the three Angles: ");
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	
	if(a+b+c == 180) System.out.println("The triangle is valid!");
	else System.out.println("The triangle is not valid!");
}
}