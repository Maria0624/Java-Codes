package lab1;
import java.util.Scanner;
public class leapYear {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int year,flag= 0;
		System.out.println("Enter the year");
		year=sc.nextInt();
		if(year % 400 == 0) {
			System.out.println("Leap Year");}
		else if(year % 100 == 0) {
			System.out.println("Not Leap Year");}
		else if(year % 4==0) {
			System.out.println("Leap Year");}
		else 
		System.out.println(year + " is not leap year");
	}
}
