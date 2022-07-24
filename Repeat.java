import java.util.Scanner;

//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class Repeat {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter x to terminate");
        while(true){
            String str = in.next();
            // System.out.println(str.getClass().getSimpleName());
            int num=Integer.parseInt(str);
            
            sum+=num;
            if(str=="x"){
                System.out.println(sum);
                break;
            }
        }
        
    }
}
