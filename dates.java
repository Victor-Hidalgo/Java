import java.util.*;

public class dates{

    Calendar cal = Calendar.getInstance();

    private int year = 2019;
    private int month = 0;
    private int day = 1;

    public void clearCalendar(){

        cal.clear();
    }

    public void setYear(int year){

        this.year = year;
        cal.set(Calendar.YEAR, year);
    }

    public int getYear(){

        return year;
    }

    public void setMonth(int month){

        this.month = month;
        cal.set(Calendar.MONTH, month);
    }

    public int getMonth(){

        return month;
    }

    public void setDay(int day){

        this.day = day;
        cal.set(Calendar.DATE, day);
    }

    public int getDay(){

        return day;
    }

    public void time (){

        System.out.println(cal.getTime());
    }

    public void timeZone (String city){

        //get a new calendar instance as it could have been cleared beforehand

        cal = Calendar.getInstance();

        cal.setTimeZone(TimeZone.getTimeZone(city));

        System.out.println("Time in " + city +" "+ cal.get(Calendar.HOUR_OF_DAY) + ":"
        + cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
    }

}
