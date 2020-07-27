import java.util.Scanner;

public class Pr5091 {
    public static void main(String[] args) {
        Pr5091 a = new Pr5091();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f=2,s=3,temp=0;

        if(n == 1){
            System.out.println(f);
        }
        else if(n == 2){
            System.out.println(s);
        }
        else{
            for(int i=3; i<=n; i++) {
                temp = f + s;
                f = s;
                s = temp;
            }
            System.out.println(temp);
        }
    }
}
