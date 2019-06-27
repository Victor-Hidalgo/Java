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
}