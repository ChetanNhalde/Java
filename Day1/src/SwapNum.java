import java.util.Scanner;

public class SwapNum{


public static void main(String[] args){
	int a,b;
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	b = sc.nextInt();
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.print("After Swapping: " + a + " " + b);	
}
}