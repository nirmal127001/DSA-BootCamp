//sum of first n natural numbers
import java.util.Scanner;

public class NnaturalNumSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        return sum;
    }
}
