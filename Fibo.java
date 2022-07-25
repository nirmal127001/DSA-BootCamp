import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Value of n: ");
        int n = in.nextInt();
        int a=0,b=1,c=0;
        System.out.print(0+" ");
        System.out.print(1+" ");
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
