import java.util.Scanner;

public class Pr8822 {
    public static void main(String[] args) {
        Pr8822 a = new Pr8822();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long mult = 8;

        for(int i=2; i<=n; i++){
            mult *= 9;
        }

        System.out.println(mult);
    }
}