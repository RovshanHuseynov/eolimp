import java.util.Scanner;

public class Pr2770 {
    public static void main(String[] args) {
        Pr2770 a = new Pr2770();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        if(n == k){
            System.out.println(1);
        }
    }
}
