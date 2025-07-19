package lab1;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		/**Author : Maria John
	 * Date : 12/07/2025
	 */
	//Fibonnacci Series
		int num,i,a=0,b=1,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of term");
		num=sc.nextInt();
		c=a+b;
		System.out.println ("Fibonacci Series" + a + b);
		while(c<num) {
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
	}
}