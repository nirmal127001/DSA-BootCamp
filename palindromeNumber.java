import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        int nnum=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Number: ");
        int num = in.nextInt();
        int temp=num;
        while(num>0){
            int digit=num%10;
            num=num/10;
            nnum=nnum*10+digit;
        }
        System.out.println(nnum);
        if (temp==nnum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
