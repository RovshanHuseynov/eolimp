import java.util.Scanner;

public class Pr8361 {
    public static void main(String[] args) {
        Test a = new Test();
        a.calc();
    }
}

class Test {
    public void calc(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = s.length();
        int cnt = 0;
        int dis = -100;
        boolean left = false;
        boolean ans = false;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == 'L') left = true;
            else if(s.charAt(i) == 'R') left = false;
            else if(left){
                cnt++;
                dis--;
            }
            else{
                cnt++;
                dis++;
            }

            if(dis == 0){
                ans = true;
                break;
            }
            else if(dis == -100){
                dis = 0;
            }
        }

        if(ans)
            System.out.println(cnt+1);
        else
            System.out.println(-1);
    }
}
