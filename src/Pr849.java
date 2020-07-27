import java.util.Scanner;

public class Pr849 {
    public static void main(String[] args) {
        Pr849 a = new Pr849();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        rec(n, "");
    }

    public void rec(int target, String cur){
        if(target < 0){
            return;
        }
        else if(target == 0){
            if(cur.length() > 2)
                System.out.println(cur.substring(1 ,cur.length()));
            return;
        }

        if(last(cur) <= 1) rec(target-1, cur + "+1");
        if(last(cur) <= 2) rec(target-2, cur + "+2");
        if(last(cur) <= 3) rec(target-3, cur + "+3");
        if(last(cur) <= 4) rec(target-4, cur + "+4");
        if(last(cur) <= 5) rec(target-5, cur + "+5");
        if(last(cur) <= 6) rec(target-6, cur + "+6");
        if(last(cur) <= 7) rec(target-7, cur + "+7");
        if(last(cur) <= 8) rec(target-8, cur + "+8");
        if(last(cur) <= 9) rec(target-9, cur + "+9");
    }

    public int last(String s){
        int len = s.length();
        if(len > 0){
            return s.charAt(len-1) - 48;
        }
        else{
            return 0;
        }
    }
}
