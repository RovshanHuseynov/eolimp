import java.util.Scanner;

public class Pr8823 {
    public static void main(String[] args) {
        Pr8823 a = new Pr8823();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long mult1 = 9;
        long mult2 = 8;

        for(int i=2; i<=n; i++){
            mult1 *= 10;
            mult2 *= 9;
        }

        System.out.println(mult1 - mult2);
    }
}