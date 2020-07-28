import java.util.Scanner;

public class Pr8820 {
    public static void main(String[] args) {
        Pr8820 a = new Pr8820();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mult = 1;

        for(int i=1; i<=n; i++){
            mult *= 5;
        }

        System.out.println(mult);
    }
}
