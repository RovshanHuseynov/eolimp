import java.util.Scanner;

public class Pr8381 {
    public static void main(String[] args) {
        Pr8381 a = new Pr8381();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n > 10) n = 10;

        long ans = 9;
        long mult;

        for(int i=2; i<=n; i++){
            mult = 9;

            for(int j=1; j<i; j++){
                mult *= (10-j);
            }

            ans += mult;
        }

        System.out.println(ans);
    }
}
