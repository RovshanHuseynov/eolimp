import java.util.Scanner;

public class Pr9895 {
    public static void main(String[] args) {
        Pr9895 a = new Pr9895();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        long p = in.nextLong();
        long q = in.nextLong();
        long k = in.nextLong();

        System.out.println(p + (k-1)*(q-p));
    }
}
