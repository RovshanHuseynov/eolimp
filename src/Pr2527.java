import java.util.Scanner;

public class Pr2527 {
    public static void main(String[] args) {
        Pr2527 a = new Pr2527();
        a.calc();
    }

    long [] fibo = new long[48];

    public void calc(){
        Scanner in = new Scanner(System.in);
        fibo[0] = 1;
        fibo[1] = 1;

        for(int i=2; i<=47; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        int t = in.nextInt();

        for(int i=0; i<t; i++){
            int n = in.nextInt();
            int left = in.nextInt();
            int right = in.nextInt();

            if(n > 46) n -= (n - 46) / 2 * 2;
            System.out.println(solve(n, left, right));
        }
    }

    public String solve(int n, long left, long right){
        if(n == 0) return "0";
        else if(n == 1) return "1";
        else if(left >= fibo[n-2]) return solve(n-1, left - fibo[n-2], right - fibo[n-2]);
        else if(right < fibo[n-2]) return solve(n-2, left, right);
        else return solve(n-2, left, fibo[n-2] - 1) + solve(n-1, 0, right - fibo[n-2]);
    }
}
