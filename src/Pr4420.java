import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Pr4420 {
    public static void main(String[] args) {
        Pr4420 a = new Pr4420();
        a.calc();
    }

    double a,b,c,d;

    public void calc(){
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        d = in.nextDouble();

        double left,right,mid;

        right = 1;
        while(f(right) * f(-right) >= 0) right *= 2;
        left = -right;


        while (right - left > 1e-12) {
            mid = (left + right) / 2;
            if (f(mid) * f(right) > 0) right = mid; else left = mid;
        }

        BigDecimal bd = new BigDecimal(left).setScale(10, RoundingMode.HALF_EVEN);
        left = bd.doubleValue();
        System.out.println(left);

        /*
        BigDecimal tempBig = new BigDecimal(Double.toString(left));
        tempBig = tempBig.setScale(10, BigDecimal.ROUND_HALF_EVEN);
        String strValue = tempBig.stripTrailingZeros().toPlainString();
        System.out.println(strValue);
         */
        //System.out.println(String.format("%.10f", left));
        //System.out.printf("%.9f\n", left);
        //System.out.println(left);
    }

    double f(double x) {
        return a*x*x*x + b*x*x + c*x + d;
    }
}
