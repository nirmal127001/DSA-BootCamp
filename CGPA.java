import java.util.Scanner;

//CGPA = ∑(Ci x Si) / ∑ Ci
//Here, Si is the SGPA of the ith semester and Ci is the total number of credits obtained in that semester. CGPA shall be rounded off to two decimal points.
public class CGPA {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float res=0;
        int totalCredits=0;
        System.out.print("Current Sem: ");
        int sem = in.nextInt();
        for (int i=1;i<sem;i++){
            System.out.print("Credits in sem "+i+": ");
            int credit= in.nextInt();
            System.out.print("SGPA in sem "+i+": ");
            float sgpa= in.nextFloat();
            float cgpa=credit*sgpa;
            totalCredits+=credit;
            res+=cgpa;
        }
        System.out.println("CGPA "+res/totalCredits);
    }
}
