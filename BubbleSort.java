import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'countSwaps' function below.
     *
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static void countSwaps(List<Integer> a) {
    // Write your code here

        int i = 0;
        int j = 0;
        int tmp;
        int tally = 0;
        
        while(i < a.size()){
            
            while(j < a.size() - 1){
                
                if(a.get(j) > a.get(j + 1)){
                    
                    tmp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, tmp);
                    tally++;
                }
                j++;
            }
            j = 0;
            //System.out.println("This is " + a.get(i));
            i++;
        }
        
        System.out.println("Array is sorted in " + tally + " swaps." +
        "\nFirst Element: " + a.get(0) + "\nLast Element: " + a.get(a.size() - 1));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.countSwaps(a);

        bufferedReader.close();
    }
}
