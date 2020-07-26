import java.util.Scanner;

public class Pr704 {
    public static void main(String[] args) {
        Pr704 a = new Pr704();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int x;
        int [] fac = new int[1001];
        fac[0] = 1;
        for(int i=1; i<=1000; i++){
            fac[i] = fac[i-1] * i;

            while (fac[i] % 10 == 0) {
                fac[i] /= 10;
            }

            if(fac[i] > 1000) {
                fac[i] %= 1000;
            }
        }

        for(int i=0; i<t; i++) {
            x = in.nextInt();
            System.out.println(fac[x] % 10);
        }
    }
}
