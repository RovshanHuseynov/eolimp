import java.util.Scanner;

public class Pr8538 {
    public static void main(String[] args) {
        Pr8538 a = new Pr8538();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 0;
        while(n > 1){
            cnt++;

            if(n % 3 == 0){
                n /= 3;
            }
            else{
                n--;
            }

            //System.out.println(n);
        }

        System.out.println(cnt);
    }
}
