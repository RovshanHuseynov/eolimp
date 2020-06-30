import java.util.Scanner;

public class Pr8595 {
    private final long mod = 1000000007;

    public static void main(String[] args) {
        Pr8595 a = new Pr8595();
        a.calc();
    }

    public long fac(long n){
        long mult = 1;

        for(int i=2; i<=n; i++){
            mult *= i;
        }

        return mult;
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        if(n == m){
            System.out.println(2 * n * fac(n-1) * fac(m));
        }
        else if(n - m == -1 || n - m == 1){
            System.out.println(fac(n) * fac(m));
        }
        else{
            System.out.println("0");
        }

    }
}
