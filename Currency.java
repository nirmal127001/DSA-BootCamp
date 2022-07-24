import java.util.Scanner;

//Input currency in rupees and output in USD.
public class Currency {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Rupee: ");
        float rupees=in.nextFloat();
        System.out.printf("%.2f%n",rupees/79.845);
    }
}
