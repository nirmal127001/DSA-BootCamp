import java.util.Scanner;

//Calculate Discount Of Product
public class Discount{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Actual Price: ");
        float actualPrice = in.nextInt();
        System.out.print("Sale Price: ");
        float salePrice = in.nextInt();
        float discount=((actualPrice-salePrice)/actualPrice)*100;
        System.out.printf("%.2f%n",discount);
    }
}