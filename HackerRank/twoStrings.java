import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

        int i=0;
        int j=0;
        boolean common = false;

        Set<Character> s1LetterSet = new HashSet<>();
        Set<Character> s2LetterSet = new HashSet<>();

        while(i<s1.length()){

            s1LetterSet.add(s1.charAt(i));
            i++;
        }
            
        while(j<s2.length()){

            s2LetterSet.add(s2.charAt(j));
            j++;
        }
        
        s1LetterSet.retainAll(s2LetterSet);

        if(s1LetterSet.size() > 0){

            return "YES";
        }

        else{

            return "NO";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
