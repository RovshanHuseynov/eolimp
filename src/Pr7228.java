import java.util.Scanner;

public class Pr7228 {
    public static void main(String[] args) {
        Pr7228 a = new Pr7228();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        StringBuilder a = new StringBuilder(in.next());
        StringBuilder b = new StringBuilder(in.next());
        int n = a.length();
        int m = b.length();
        int [] ans;

        if(n > m){
            for(int i=1; i<=(n-m); i++){
                b.insert(0, '0');
            }
        }
        else if(m > n){
            for(int i=1; i<=(m-n); i++){
                a.insert(0, "0");
            }
            n = m;
        }
        ans = new int[n+1];

        int reqem1, reqem2;
        for(int i=n-1; i>=0; i--){
            reqem1 = (int)a.charAt(i) - 48;
            reqem2 = (int)b.charAt(i) - 48;
            //System.out.println(reqem1 + " " + reqem2);
            if(reqem2 == 0) reqem2 = 9;
            ans[i] = ans[i+1] * (reqem2 - reqem1 + 1);

            if(reqem1 <= 6 && reqem2 >= 6){
                //1System.out.println("yes");
                ans[i] += Math.pow(10, n - i - 1);
            }
        }

        System.out.println(ans[0]);
    }
}
