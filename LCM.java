import java.util.Scanner;

//Take 2 numbers as inputs and find their HCF and LCM.
public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number1: ");
        int num1= in.nextInt();
        System.out.print("Number1: ");
        int num2= in.nextInt();
        int max=Math.max(num1, num2);
        int min=Math.min(num1, num2);
        if(max%min==0){
            System.out.println("LCM of " +num1+" and "+ num2+" is: "+max);
        }
        else{
            for(int i=max;i<=num1*num2;i+=max){
                if(i%num1==0 && i%num2==0){
                    System.out.println("LCM of " +num1+" and "+ num2+" is: "+i);
                    break;
                }
            }
        }
    }
}
