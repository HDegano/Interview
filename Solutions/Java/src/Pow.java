/**
 * Created by HDegano on 6/17/2015.
 */
public class Pow {

    public double myPow(double x, int n) {

        boolean isNegative = n < 0;

        if(isNegative)
            n = n * -1;

        double result = innerPow(x, n);

        if(isNegative)
            return 1 / result;

        return result;
    }

    private double innerPow(double a, int b){

        if(a == 0) return 0;
        if(a == 1 || b == 0) return 1;
        if(b == 1) return a;

        double result = innerPow(a, b / 2);

        result = result * result;

        if((b & 1) == 1)
            result = result * a;

        return result;
    }
}