import java.util.*;
import java.io.*;

public class BasicMethod{

    private String mid = "";

    public String middleCharacter(String str){

        if(str.length() % 2 == 0){

            mid = str.charAt(str.length() / 2) + "" + str.charAt((str.length() / 2) -1);
        }

        else{

            mid = "" + str.charAt((str.length() / 2));
        }

        return mid;
    }
}