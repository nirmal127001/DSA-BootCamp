import java.util.Scanner;
//program to count a digit in a number
public class CountDigit {
	public static void main(String[] args) {
		int count=0;
		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
		while(num!=0) {
			int digit=num%10;
			num=num/10;
			if (digit==7) {
				count++;
			}
		}
		System.out.println(count);
	}
}