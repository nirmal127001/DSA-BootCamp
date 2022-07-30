//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class LargestOfThree{
    public static void main(String[] args) {
        int max=max(14,5,58);
        int min=min(14,5,58);
        System.out.println(max);
        System.out.println(min);
    }
    static int max(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else{
            return c;
        }
    }
    static int min(int a,int b,int c){
        if(a<b && a<c){
            return a;
        }
        else if(b<a && b<c){
            return b;
        }
        else{
            return c;
        }
    }
}