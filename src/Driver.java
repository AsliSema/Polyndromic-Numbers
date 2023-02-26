import java.util.Scanner;

public class Driver {
	static boolean isPolyndromic(int number) {
		int tempNumber = number, reverseNumber = 0, lastNumber;
		
		while(tempNumber !=0) {
			lastNumber = tempNumber%10;
			reverseNumber = reverseNumber*10 + lastNumber;
			tempNumber = tempNumber/10;
		}
		if(number == reverseNumber)
			return true;
		else
			return false;
			
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		if(isPolyndromic(number))
			System.out.println(number + " is a Polyndromic Number");
		else
			System.out.println(number + " isn't a Polyndromic Number");
		
	}
}
