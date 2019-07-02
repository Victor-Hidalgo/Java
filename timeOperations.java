import java.util.*;
import java.io.*;
import java.time.*;
import java.text.*;

public class timeOperations{
    public static void main(String[] args){

    Calendar cal = Calendar.getInstance();
    int requestedDay = 2, requestedMonth = 7, requestedYear = 2019;
    System.out.println();

    //it is important to add 1 as months start from zero.
    System.out.println("Current full date and time is : " + (cal.get(Calendar.MONTH) + 1) + "-"
        + cal.get(Calendar.DATE) + "-" + cal.get(Calendar.YEAR) + " "
        + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":"
        + cal.get(Calendar.SECOND) + "." + cal.get(Calendar.MILLISECOND));
    
    cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    System.out.println(cal.getTime());

    if(args.length>3){

        System.out.println("Cannot find day, check parameters");
        System.exit(0);
    }

    else{

        requestedDay = Integer.parseInt(args[0]);
        requestedMonth = Integer.parseInt(args[1]);
        requestedYear = Integer.parseInt(args[2]);
    }
    
    YearMonth ym = YearMonth.of(requestedYear, requestedMonth);

	 String firstDay = ym.atDay(requestedDay).getDayOfWeek().name();
	 //String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
	 System.out.println();
	 System.out.println(firstDay);
    }
}