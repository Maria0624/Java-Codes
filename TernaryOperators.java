package module1;
import java.util.Scanner;
public class TernaryOperators {
	public static void main(String[] args) {
		/**Author : Maria John
		 * Date :12/07/2025 */
		//Finding Big Number
		Scanner sc = new Scanner(System.in);
		int firstNumber,secondNumber;
		System.out.println("Enter the first Number ");
		firstNumber=sc.nextInt();
		System.out.println("Enter the second number");
		secondNumber=sc.nextInt();
		int bigNumber;
		bigNumber = firstNumber>secondNumber ? firstNumber : secondNumber;
		System.out.println("I am "+ bigNumber+", the big number");
	}

}
