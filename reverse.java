package lab1;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		/**Author : Maria John
	 * Date : 17/07/2025
	 */
	//Reverse Number
		int num,reversed=0,digit=0,i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		for(;num!=0; num/=10) {
			digit=num % 10;
			reversed = reversed * 10 + digit;
		}
		System.out.println("Reversed Number is " + reversed);
	}

}
