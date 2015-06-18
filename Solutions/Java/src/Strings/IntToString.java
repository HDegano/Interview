package Strings;

/**
 * Created by HDegano on 6/17/2015.
 */
public class IntToString {

    public String IntegerToString(int n){

        if(n == 0) return "0";

        boolean isNegative = false;

        if(n < 0){
            isNegative = true;
            n = n * -1;
        }

        StringBuilder sb = new StringBuilder();

        while(n > 0){

            int current = n % 10;

            sb.insert(0, (char)(current + 48));

            n /= 10;
        }

        if(isNegative) sb.insert(0, '-');

        return sb.toString();
    }
}
