import java.util.Scanner;

//Perfect Number In Java
public class Perfect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number: ");
        int num = in.nextInt();
        int sum=0;
        for (int i = 1; i <= num/2; i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println("Perfect");
        }
        else{
            System.out.println("Not Perfect");
        }
    }
}
