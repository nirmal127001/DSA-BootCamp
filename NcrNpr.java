import java.math.BigInteger;
import java.util.Scanner;

//Find Ncr & Npr
public class NcrNpr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        System.out.print("r: ");
        int r = in.nextInt();
        if(n>=r &&r>=0){
            int npr=fact(n)/fact(n-r);
            int ncr=fact(n)/(fact(n-r)*fact(r));
            System.out.println("npr: "+npr);
            System.out.print("ncr: "+ncr);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
    static int fact(int a) {
        int fact=1;
        if(a>=1){
            fact = fact*a*fact(a-1);
        }
        return fact;
    }
}
