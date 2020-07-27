import java.util.Scanner;

public class Pr8234 {
    public static void main(String[] args) {
        Pr8234 a = new Pr8234();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long f=2,s=3;

        if(n == 1){
            System.out.println(f);
        }
        else if(n == 2){
            System.out.println(s);
        }
        else {
            long temp = 0;
            for(int i=3; i<=n; i++){
                temp = f + s;
                f = s;
                s = temp;
            }
            System.out.println(temp);
        }
    }
}
