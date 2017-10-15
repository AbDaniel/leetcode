package math;

/**
 * Created by daniel on 10/15/17.
 */
public class LC50_Pow {

    double myPow(double x, int n) {
        if (n == 0) return 1;

        long absN = Math.abs(n);

        double ans = 1;
        while (absN > 0) {
            if (absN % 2 == 1) ans *= x;
            x *= x;
            absN /= 2;
        }

        return (n < 0) ? 1.0/ans : ans;
    }

    public static void main(String[] args) {
        double ans = new LC50_Pow().myPow(10, 3);
        System.out.println(ans);
    }
}
