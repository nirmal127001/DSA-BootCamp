import java.util.Scanner;

//To find Armstrong Number between two given number.
/*An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits. 
It is also known as pluperfect, or Plus Perfect, or Narcissistic number.
2: 21 = 2
153: 13 + 53 + 33 = 1 + 125+ 27 = 153
 */
public class Armstrong {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Number: ");
        int number = in.nextInt();
        int temp=number;
        String snumber = Integer.toString(number);
        int len = snumber.length();
        int sum=0;
        for(int i=0; i<len; i++){
            int digit=number%10;
            number=number/10;
            sum+=Math.pow(digit,len);
        }
        if(sum==temp){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
