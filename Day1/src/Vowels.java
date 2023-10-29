import java.util.Scanner;

public class Vowels{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	char a;
	System.out.println("Enter Character: ");
	a = sc.next().charAt(0);
	if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') 
		System.out.print("The character is vowel");
	else System.out.print("The character is consonent");
	
}
}