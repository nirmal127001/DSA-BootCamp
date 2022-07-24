//Take name as input and print a greeting message for that particular name according to time.
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

public class Greeting {
    public static void main(String[] args) {
        //Displaying current time in 12 hour format with AM/PM
    	DateFormat dateFormat = new SimpleDateFormat("hh.mm aa");
    	String dateString = dateFormat.format(new Date()).toString();
        String hour=dateString.substring(0,2);
        String ampm=dateString.substring(6,8);
    	
        int hourInInt=Integer.parseInt(hour);
    
        Scanner in = new Scanner(System.in);
        System.out.print("Name: ");
        String name=in.nextLine();
        String am ="AM";
        String pm ="PM";

        if(hourInInt>=5 && hourInInt<=12 && ampm.equals(am)){
            System.out.println("Good Morning "+name);
        }
        else if(hourInInt>=1 && hourInInt<6 && ampm.equals(pm)){
            System.out.println("Good Afternoon "+name);
        }
        else if(hourInInt>=6 && hourInInt<=8 && ampm.equals(pm)){
            System.out.println("Good Evening "+name);
        }
        else{
            System.out.println("Hello "+name);
        }
    }
}
