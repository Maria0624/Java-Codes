package lab1;
import java.util.Scanner;
public class factorial {
	
	public static void main(String[] args) {
		/**Author : Maria John
		 * Date : 17/07/2025
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int fact=1;
		int i=1;
		while(i<=number) {
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of the number "+number+" is "+ fact);
	}
}