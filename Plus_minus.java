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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int p = 0, g = 0, z = 0;
    // System.out.println(arr);
    int n=arr.size();
    for(int i=0;i<n;i++){
        if(arr.get(i)>0){
            // System.out.println("+");
            p=p+1;
            // System.out.println(p);
        }
        if(arr.get(i)<0){
            // System.out.println("-");
            g=g+1;
            // System.out.println(g);
        }
        if(arr.get(i)==0){
            // System.out.println("0");
            z=z+1;
            // System.out.println(z);
        }
    }
    double pr=(double)p/n;
    double gr=(double)g/n;
    double zr=(double)z/n;
            // Format the ratios with specific precision
        String formattedPr = String.format("%.6f", pr);
        String formattedGr = String.format("%.6f", gr);
        String formattedzr = String.format("%.6f", zr);
    System.out.println(formattedPr+"\n"+formattedGr+"\n"+formattedzr);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
