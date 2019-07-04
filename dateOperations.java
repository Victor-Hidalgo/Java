import java.util.*;
import java.io.*;

public class dateOperations{

    public static void main(String[] args){

        dates date = new dates();
        Scanner scan = new Scanner (System.in);
        String strZone = " ";
        int requestedDay = 3, requestedMonth = 7, requestedYear = 2019;

        date.clearCalendar();

        if(args.length>3){

            System.out.println("Cannot find day, check parameters");
            System.exit(0);
        }

        else{

            requestedDay = Integer.parseInt(args[0]);
            requestedMonth = Integer.parseInt(args[1]);
            requestedYear = Integer.parseInt(args[2]);
        }

        date.setYear(requestedYear);
        date.setMonth(requestedMonth);
        date.setDay(requestedDay);

        //System.out.println("Date: " + date.getYear() + "/" + date.getMonth() + "/" + date.getDay());

        //print date and time
        date.time();

        //same date last year
        date.setYear(requestedYear - 1);
        System.out.print("\nDate 1 year before: ");
        date.time();

        //same date next year
        date.setYear(requestedYear + 1);
        System.out.print("\nDate 1 year after: ");
        date.time();

        System.out.println("\nPlease enter the time zone");

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

        scan.close();
    }
}
