import java.util.Scanner;

public class Series {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		while(n!=0) {
			sum+=sc.nextInt();
			n--;
		}
		
		System.out.println("Sum: " + sum);
	}

}
