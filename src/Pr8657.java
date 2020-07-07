import java.util.Arrays;
import java.util.Scanner;

public class Pr8657 {
    public static void main(String[] args) {
        Pr8657 a = new Pr8657();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int [] a = new int[4];
        for(int i=0; i<4; i++){
            a[i] = in.nextInt();
        }

        Arrays.sort(a);

        System.out.println(a[2] - a[1]);
    }
}
