package lab1;
import java.util.Scanner;
public class gcd {
	public static void main(String[] args) {
		/**Author : Maria John
	 * Date : 19/07/2025
	 */
	//GCD
		Scanner sc=new Scanner(System.in);
		int num1,num2,temp;
		System.out.println("Enter the numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		while(num2!=0) {
			temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		System.out.println("GCD is " +num1);
	}

}
