import java.util.Scanner;

public class Pr2524 {
    public static void main(String[] args) {
        Pr2524 a = new Pr2524();
        a.calc();
    }

    int [] fibo = new int[44];

    public void calc(){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(),n,k;
        String a,b,temp;

        fibo[0] = 1;
        fibo[1] = 1;
        for(int i=2; i<44; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        for(int i=0; i<t; i++){
            a = "a";
            b = "b";
            temp = "";

            n = in.nextInt();
            k = in.nextInt();
            System.out.println(solve(n,k));
        }
    }

    char solve(int n, int k){
        if(n == 0) return 'a';
        else if(n == 1) return 'b';
        else if(k <= fibo[n-2]) return solve(n-2, k);
        else return solve(n-1, k - fibo[n-2]);
    }
}
