package lab1;
import java.util.Scanner;
public class primeNumber {
	
	public static void main(String[] args) {
		/**Author : Maria John
	 * Date : 12/07/2025
	 */
	//Prime Number Checking
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a positive number ");
	int num=sc.nextInt();
	int i,flag=0;
	if(num<=1) {
		flag=1;
	}
	for(i=2;i<=num/2;i++) {
		if(num%i==0) {
			flag=1;
			break;
		}
	}
	if(flag==0) {
		System.out.println(num+" is a prime number");
	}
	else {
		System.out.println(num+" is not prime number");
	}
	}
}
