import java.util.Scanner;

public class Pr8380 {
    public static void main(String[] args) {
        Pr8380 a = new Pr8380();
        a.calc();
        //a.calc1();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int len = String.valueOf(n).length();
        long ans = 1;
        if(len > 2) ans += 9 * 2;

        long mult;
        for (int i = 3; i < len; i++) {
            mult = 9;
            for (int j = 3; j <= i; j++) {
                mult *= 10;
            }
            ans += mult * i;
        }

        if(len > 1) {
            mult = 1;
            for (int i = 1; i < len; i++) {
                mult *= 10;
            }

            ans += ((n - mult) / 10 + 1) * len;
        }

        if(n != 1 && n % 10 != 0){
            ans += String.valueOf(n).length();
        }

        System.out.println(ans);
    }

    public void calc1(){
        // 40% accepted. Timelimit problem
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long cnt = 1;
        for(int i=10; i<=n; i+=10){
            cnt += String.valueOf(i).length();
        }

        if(n > 1 && n % 10 != 0){
            cnt += String.valueOf(n).length();
        }

        System.out.println(cnt);
    }
}