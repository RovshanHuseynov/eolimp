import java.util.Scanner;

public class Pr8670 {
    public static void main(String[] args) {
        Pr8670 a = new Pr8670();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while(n % 2 == 0){
            n /= 2;
        }

        if(n == 1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
