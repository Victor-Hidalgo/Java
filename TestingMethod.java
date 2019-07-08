import java.util.*;
import java.io.*;

public class TestingMethod{

    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);
        BasicMethod test = new BasicMethod();
        String example;
        
        System.out.println("\nPlease type the String: ");
        example = scan.nextLine();
        
        System.out.println("\nMiddle character(s): " + test.middleCharacter(example));

    }
}