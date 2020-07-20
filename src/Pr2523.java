import java.util.Scanner;

public class Pr2523 {
    public static void main(String[] args) {
        Pr2523 a = new Pr2523();
        a.calc();
    }

    int [] fibo = new int[44];

    public void calc(){
        Scanner in = new Scanner(System.in);
        fibo[0] = 0;
        fibo[1] = 1;

        for(int i=2; i<44; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        int n = in.nextInt();
        int m = in.nextInt();
        int l = in.nextInt();

        System.out.println(solve(n,m,m+l-1));
    }

    public String solve(int n, int left, int right){
        if(n == 0) return "0";
        else if(n == 1) return "1";
        else if(right <= fibo[n-1]) return solve(n-1, left, right);
        else if(left > fibo[n-1]) return solve(n-2, left - fibo[n-1], right- fibo[n-1]);
        else return solve(n-1, left, fibo[n-1]) + solve(n-2, 1, right - fibo[n-1]);
    }
}
