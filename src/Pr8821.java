import java.util.Scanner;

public class Pr8821 {
    public static void main(String[] args) {
        Pr8821 a = new Pr8821();
        a.calc();
    }

    public void calc() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mult = 4;

        for(int i=2; i<=n; i++){
            mult *= 5;
        }

        System.out.println(mult);
    }
}
