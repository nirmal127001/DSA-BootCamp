import java.util.Scanner;

//Subtract the Product and Sum of Digits of an Integer
public class SumProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0,product=1;
        System.out.print("Number: ");
        int num = in.nextInt();
        while(num!=0){
            int digit=num%10;
            num = num/10;
            sum+=digit;
            product*=digit;
        }
        int res=product-sum;
        System.out.println(res);
    }
}
