import java.util.Scanner;

public class Pr2527 {
    public static void main(String[] args) {
        Test5 a = new Test5();
        a.calc();
    }
}

class Test5 {
    long [] fibo = new long[45];

    public void calc(){
        Scanner in = new Scanner(System.in);
        fibo[0] = 1;
        fibo[1] = 1;

        for(int i=2; i<45; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        int t = in.nextInt();

        for(int i=0; i<t; i++){
            int n = in.nextInt();
            int left = in.nextInt();
            int right = in.nextInt();

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
