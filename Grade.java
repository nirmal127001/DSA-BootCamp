import java.util.Scanner;

//Finding grade according to marks obtained
public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Marks: ");
        float marks=in.nextFloat();
        System.out.println(whatGrade(marks));
    }
    static String whatGrade(float a){
        String res="";
        if(a>90 && a<=100)
            res= "AA";
        if(a>80 && a<=90)
            res= "AB";
        if(a>70 && a<=80)
            res= "BB";
        if(a>60 && a<=70)
            res= "BC";
        if(a>50 && a<60)
            res= "CD";
        if(a>40 && a<50)
            res= "DD";
        if(a<=40)
            res= "Fail";
        return res;
    }
}
