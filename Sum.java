import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Sum of two numbers
        Scanner in = new Scanner(System.in);
        System.out.print("First number: ");
        int num1 = in.nextInt();
        System.out.print("Second number: ");
        int num2 = in.nextInt();
        //int sum=num1+num2;
        //System.out.println("Sum of "+num1+ " and "+ num2+" = "+sum);
        System.out.println("Sum of "+num1+ " and "+ num2+" = "+sum(num1,num2));
    }
    static int sum(int a, int b) {
        return a+b;
    }
}
