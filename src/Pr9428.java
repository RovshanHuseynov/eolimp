
import java.util.Scanner;

public class Pr9428 {
    public static void main(String[] args) {
        Pr9428 a = new Pr9428();
        a.calc();
    }

    public void calc() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int ekob = ekob(b,d);

        if(ekob / b * a < ekob / d * c){
            System.out.println(a + "/" + b + " " + c + "/" + d);
        }
        else{
            System.out.println(c + "/" + d + " " + a + "/" + b);
        }
    }

    public int ebob(int a, int b){
        while(b != 0){
            a = a % b;
            int temp = a;
            a = b;
            b = temp;
        }

        return a;
    }

    public int ekob(int a, int b){
        int eb = ebob(a, b);

        if(a % eb == 0){
            return a / eb * b;
        }
        else{
            return b / eb * a;
        }
    }
}
