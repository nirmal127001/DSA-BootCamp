import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Calci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number1: ");
        int num1=in.nextInt();
        System.out.print("Number2: ");
        int num2=in.nextInt();
        System.out.print("Operator: ");
        char ch=in.next().trim().charAt(0);
        
        if(ch=='+'){
            System.out.println(num1+num2);
        }
        if(ch=='-'){
            System.out.println(num1-num2);
        }
        if(ch=='*'){
            System.out.println(num1*num2);
        }
        if(ch=='/'){
            System.out.println((float)num1/num2);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
