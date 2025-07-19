package module1;
import java.util.Scanner;
public class details {

	public static void main (String[] args) {
		/**Author : Maria John
	 * Date : 12/07/2025
	 */
	//Details of Student
		Scanner in = new Scanner(System.in);
		String name;
		int age;
		long mobilenumber;
		double cgpa;
		System.out.println("Enter your Name");
		name = in.nextLine();
		System.out.println("Age");
		age = in.nextInt();
		System.out.println("Mobile Number");
		mobilenumber = in.nextLong();
		System.out.println("CGPA");
		cgpa = in.nextDouble();
		System.out.println("Name " + name);
		System.out.println("Age " + age);
		System.out.println("Mobile Number " + mobilenumber);
		System.out.println("CGPA " + cgpa);	
	}
}