import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number: ");
        int num = in.nextInt();
        System.out.println(findFactoral(num));
        // System.out.println(findFactoralByRec(num));
    }
    static int findFactoralByRec(int a) {
        int fact=1;
        if(a>=1){
            fact = fact*a*findFactoralByRec(a-1);
        }
        return fact;
    }
    static int findFactoral(int a) {
        int fact=1;
        while(a>=1){
            fact = fact*a;
            a--;
        }
        return fact;
    }
}
