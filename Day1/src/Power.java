import java.util.Scanner;

public class Power{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int m,n,pow=1;
	System.out.print("Enter the numbers: ");
	m = sc.nextInt();
	n = sc.nextInt();
	for(int i = 1;i<=n;i++) {
	pow *= m;
}

System.out.println(m + " to power " + n + ": " + pow);
}
}