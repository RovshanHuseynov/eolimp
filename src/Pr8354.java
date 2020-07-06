import java.util.ArrayList;
import java.util.Scanner;

public class Pr8354 {
    public static void main(String[] args) {
        Pr8354 a = new Pr8354();
        a.calc1();
    }

    public ArrayList<Integer> ans;
    public ArrayList<Integer> arr;
    int n;
    long minn = 920_000_000_000_000_0L;
    String s;

    public void calc(){
        // 53% accepted
        //Scanner in = new Scanner(System.in);
        //n = in.nextInt();

        for(int z=7500; z<=8000; z++) {
            n = z;
            int temp;
            ans = new ArrayList<>();
            arr = new ArrayList<>();

            arr.add(0);
            for (int i = 1; i <= 9; i++) {
                temp = i * i * i;
                if (temp <= n) {
                    arr.add(temp);
                }
            }

            while (n > 0) {
                fill(9);
                fill(8);
                fill(7);
                fill(6);
                fill(5);
                fill(4);
                fill(3);
                fill(2);
                fill(1);
            }

            System.out.print(z + " ");
            for (int i = ans.size() - 1; i >= 0; i--) {
                System.out.print(ans.get(i));
            }
            System.out.println();


        }
    }

    public void fill(int x){
        if(x >= arr.size()){
            return;
        }
        //System.out.println(arr.get(x));
        while(n >= arr.get(x)){
            n -= arr.get(x);
            ans.add(x);
        }
    }

    public void calc1(){
        // 73% accepted
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        rec(0, 0);
        System.out.println(minn);
    }

    public void rec(long cur, int sum){
        if(cur > minn){
            return;
        }

        if(cur < 0){
            return;
        }

        s = String.valueOf(cur);
        if(s.length() > 15){
            return;
        }

        if(sum > n){
            return;
        }
        else if(sum == n){
            //System.out.println(cur);
            if(cur < minn){
                minn = cur;
            }
            else{
                return;
            }
        }

        rec(cur * 10 + 1, sum + 1);
        rec(cur * 10 + 2, sum + 8);
        rec(cur * 10 + 3, sum + 27);
        rec(cur * 10 + 4, sum + 64);
        rec(cur * 10 + 5, sum + 125);
        rec(cur * 10 + 6, sum + 216);
        rec(cur * 10 + 7, sum + 343);
        rec(cur * 10 + 8, sum + 512);
        rec(cur * 10 + 9, sum + 729);
    }
}
