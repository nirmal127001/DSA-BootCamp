import java.util.Scanner;

//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. 
//The list terminates when the user enters a zero.
public class NumberOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int negSum=0,sumPosEven=0,sumPosOdd=0;
        while(true){
            System.out.print("Numbers: ");
            int num = in.nextInt();
            if(num<0){
                negSum+=num;
            }
            else if(num>0 && num%2==0)
            {
                sumPosEven+=num;
            }
            if(num>0 && num%2!=0){
                sumPosOdd+=num;
            }
            if(num==0){
                System.out.println("Sum of negative numbers: "+negSum);
                System.out.println("Sum of positive even numbers: "+sumPosEven);
                System.out.println("Sum of positive odd numbers: "+sumPosOdd);
                break;
            }
        }
    }
}
