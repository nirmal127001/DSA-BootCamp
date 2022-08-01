import java.util.Scanner;

public class PrimeBetween {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Range: ");
        int start=in.nextInt();
        int end=in.nextInt();
        primeBetween(start,end);
    }
    static void primeBetween(int start,int end){
        for(int i = start; i <=end; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int a){
        boolean result =true;
        if(a== 0||a==1 ){
            result = false;
        }
        for(int i = 2; i <a/2; i++){
            if(a%i==0){
                result= false;
            }
        }
        return result;
    }
}
