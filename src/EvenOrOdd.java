import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number to see if it is even or Odd: ");
		
		if (calc(input.nextInt()) == true)
			System.out.println("The number you have entered is even");
		else
			System.out.println("The number you have entered is odd");
		
	}
	
	public static boolean calc(int i) {
		if (i%2 == 0)
			return true;
		else
			return false;
	}
}
