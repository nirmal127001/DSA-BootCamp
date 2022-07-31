import java.util.Scanner;

public class IsPrime{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isPrime(num));
    }
    static boolean isPrime(int a){
        boolean result =true;
        for(int i = 2; i <a; i++){
            if(a%i==0){
                result= false;
            }
        }
        return result;
    }
}