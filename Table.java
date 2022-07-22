//Take a number as input and print the multiplication table for it.
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Number:");
            int num = in.nextInt();
            for (int i=1;i<11;i++){
                System.out.println(num*i);
            }
        }
    }
}
