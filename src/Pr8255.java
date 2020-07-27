import java.util.Scanner;

public class Pr8255 {
    public static void main(String[] args) {
        Pr8255 a = new Pr8255();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        rec(n, s, "");
    }

    public void rec(int n, int s, String cur){
        if(n > 0 && 9 * n < s){
            return;
        }

        if(n == 0 && s == 0){
            System.out.println(cur);
            return;
        }

        if(n == 0 || s < 0){
            return;
        }

        if(cur.length() > 0) rec(n-1, s-0, cur + "0");
        rec(n-1, s-1, cur + "1");
        rec(n-1, s-2, cur + "2");
        rec(n-1, s-3, cur + "3");
        rec(n-1, s-4, cur + "4");
        rec(n-1, s-5, cur + "5");
        rec(n-1, s-6, cur + "6");
        rec(n-1, s-7, cur + "7");
        rec(n-1, s-8, cur + "8");
        rec(n-1, s-9, cur + "9");
    }
}
