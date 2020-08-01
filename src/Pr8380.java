import java.util.Scanner;

public class Pr8380 {
    public static void main(String[] args) {
        Test1 a = new Test1();
        a.calc();
    }
}

class Test1 {
    public void calc(){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int digit = String.valueOf(n).length();
        long ans = 1;
        if(n > 1) ans++;



    }

    public void calc1(){
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