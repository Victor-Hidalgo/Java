import java.util.Scanner;

public class stringExercises{

    public static void main(String[] args){

        String phrase;
        int position;
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the String");

        phrase = scan.nextLine();

        System.out.println("Enter the index you wish to print");
        
        position = scan.nextInt();

        getCharacter(phrase, position);
        getUniCodePoint(phrase, position);

        scan.close();
    }

    private static void getCharacter(String str, int index){

        System.out.println("The character at position " + index + " is " + str.charAt(index));
    }

    private static void getUniCodePoint(String str, int index){

        System.out.println("The Unicode point of the character is " + str.codePointAt(index));
    }
}