import java.util.*;

public class dateOperations{

    public static void main(String[] args){

        dates date = new dates();

        date.clearCalendar();
        date.setYear(2020);
        date.setMonth(5);
        date.setDay(29);

        //System.out.println("Rompe este ve " + date.getYear() + "/" + date.getMonth() + "/" + date.getDay());
        date.time();
    }
}
