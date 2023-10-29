import java.util.Scanner;

public class Tax{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int sal;
	System.out.print("Enter Salary: ");
	sal = sc.nextInt();
	if(sal < 150000) System.out.println("Tax: " + 0);
	else if(sal >= 150000 && sal <300000) System.out.println("Tax: " + (sal * 0.20));
	else System.out.println("Tax: " + (sal * 0.3));
	
}
}