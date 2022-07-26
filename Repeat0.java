import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
//Take integer inputs till the user enters 0 and print the largest number from all.

public class Repeat0 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum=0;
        int max =0;
        System.out.println("Enter 0 to terminate");
        while(true){
            System.out.print("Enter numbers: ");
            int num = in.nextInt();
            if(max<num){
                max=num;
            }
            sum+=num;
            if(num==0){
                System.out.println(sum);
                System.out.println(max);
                break;
            }
        }  
    }
}
