import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number1: ");
        int num1=in.nextInt();
        System.out.print("Number2: ");
        int num2=in.nextInt();
        if(num1>num2){
            System.out.println(num1+" is the greatest");
        }
        else{
            System.out.println(num2+" is the greatest");
        }
    }
}
