import java.util.*;

public class App {
/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int result = 0;

        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526

            if (i == 0){
                result = t;
            }else{
                if(Math.abs(result) == Math.abs(t)){
                    if(result > t){
                        result = result;
                    }else{
                        result = t;
                    }
                }else{
                    if(Math.abs(result) > Math.abs(t)){
                        result = t;
                    }else{
                        result = result;
                    }
                }
            }       
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(result);
    }
    }
