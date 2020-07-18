import java.util.Scanner;

public class Pr9423 {
    public static void main(String[] args) {
        Pr9423 a = new Pr9423();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double k = in.nextDouble();
        x = Math.abs(x);
        double c = Math.sqrt(x);
        double a = c * c * c * c + k * k * k;
        double log = Math.log10(a) * Math.log10(a) * Math.log10(a);
        double cos = Math.cos(x) * Math.cos(x) * Math.cos(x) * Math.cos(x) * Math.cos(x);
        double y = log + cos;
        System.out.printf("%.2f", y);
    }
}
