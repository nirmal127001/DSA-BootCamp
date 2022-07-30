import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Numbers: ");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int max =Math.max(num1, num2);
        int min = Math.min(num1,num2);
        if(max%min==0){
            System.out.print("HCF: "+min);
        }
        else{
            while(max%min!=0){
                int temp=min;
                min=max%min;
                max=min;
            }
            System.out.print("HCF: "+min);
        }
        
    }
}
