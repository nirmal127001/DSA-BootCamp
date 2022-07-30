import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        int sum=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Number: ");
        int num = in.nextInt();
        while(num>0){
            int digit = num%10;
            num=num/10;
            sum+=digit;
        }
        System.out.println(sum);
    }
}
