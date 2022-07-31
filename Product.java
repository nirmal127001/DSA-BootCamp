import java.util.Scanner;

public class Product {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(product(num1,num2));
    }

    static int product(int a, int b) {
        return a*b;
    }
}
