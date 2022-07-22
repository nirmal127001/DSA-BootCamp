import java.util.Scanner;

public class LeapOrNot {

	public static void main(String[] args) {
		// Program to find if a year is a leap or not
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.print("Enter a year: ");
			int year=in.nextInt();
			if(year%4==0 && year%100!=0) {
				System.out.println(year + " is a leap year");
			}
			else if(year%100==0 && year%400==0) {
				System.out.println(year + " is a leap year");
			}
			else {
				System.out.println(year + " is not a leap year");
			}
		}

	}

}
