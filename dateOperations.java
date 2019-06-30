import java.util.*;
import java.io.*;

public class dateOperations{

    public static void main(String[] args){

        dates date = new dates();
        Scanner scan = new Scanner (System.in);
        String strZone = " ";
        int i = 0;

        date.clearCalendar();
        date.setYear(2020);
        date.setMonth(5);
        date.setDay(29);

        System.out.println("Date: " + date.getYear() + "/" + date.getMonth() + "/" + date.getDay());

        //print date and time
        date.time();

        System.out.println("Please enter the time zone");

        strZone = scan.nextLine();

        try{

            Integer.parseInt(strZone);
            System.out.println("Invalid input");
            System.exit(0);
        }

        catch (NumberFormatException e) {

            //deals with any input which is not an integer
            date.timeZone(strZone);
        }

        

    }
}
