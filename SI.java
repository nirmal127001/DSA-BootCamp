import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class SI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal=in.nextDouble();
        System.out.print("Time: ");
        int time=in.nextInt();
        System.out.print("Rate: ");
        int rate=in.nextInt();
        double si=(principal*rate*time)/100;
        System.out.printf("Simple Interest: %.2f%n",si);
    }
}
