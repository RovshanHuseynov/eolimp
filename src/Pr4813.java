import java.util.Scanner;

public class Pr4813 {
    public static void main(String[] args) {
        Test1 a = new Test1();
        a.calc();
    }
}

class Test1 {
    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        int [] ans = new int[1000];

        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }

        int s = in.nextInt();

        int cnt = 0;

        for(int i=n-1; i>=0; i--){
            if(s >= a[i]){
                while(s >= a[i]){
                    ans[cnt++] = a[i];
                    s -= a[i];
                }
            }
        }

        if(cnt == 0){
            System.out.println(-1);
            return;
        }

        System.out.println(cnt);
        System.out.print(ans[0]);
        for(int i=1; i<cnt; i++){
            System.out.print(" " + ans[i]);
        }
        System.out.println();
    }
}
