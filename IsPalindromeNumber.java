import java.util.Scanner;

public class IsPalindromeNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Number: ");
        int num = in.nextInt();
        System.out.println(isPalindrome(num));
    }

    static boolean isPalindrome(int a) {
        int temp=a;
        int nnum=0;
        while(a>0){
            int digit=a%10;
            a=a/10;
            nnum=nnum*10+digit;
        }
        return nnum==temp;
    }
}
