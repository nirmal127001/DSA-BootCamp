import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

public class Repeat0 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter 0 to terminate");
        while(true){
            System.out.print("Enter numbers: ");
            int num = in.nextInt();
            sum+=num;
            if(num==0){
                System.out.println(sum);
                break;
            }
        }
        
    }
}
