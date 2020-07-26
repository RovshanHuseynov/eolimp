import java.util.Scanner;

public class Pr2766 {
    public static void main(String[] args) {
        Test6 a = new Test6();
        a.calc();
    }
}

class Test6 {
    public void calc(){
        Scanner in = new Scanner(System.in);
        int n;

        while(true){
            n = in.nextInt();

            if(n == 0){
                break;
            }

            if(n % 2 == 0) {
                System.out.println(n);
            }
            else{
                System.out.println(n+1);
            }
        }
    }
}
