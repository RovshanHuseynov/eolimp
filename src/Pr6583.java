import java.util.Scanner;

public class Pr6583 {
    public static void main(String[] args) {
        Pr6583 a = new Pr6583();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();

        System.out.println(rec(b) - rec(a-1));
    }

    public long rec(long n){
        if(n < 1) return 0;
        if(n % 2 == 1) return 2 * rec(n/2) + (n+1)/2;
        return rec(n-1) + cntOne(n);
    }

    public long cntOne(long n){
        int cnt = 0;

        while(n > 0){
            cnt += n % 2;
            n = n /2;
        }

        return cnt;
    }
}
