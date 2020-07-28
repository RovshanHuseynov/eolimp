import java.util.Scanner;

public class Pr8819 {
    public static void main(String[] args) {
        Pr8819 a = new Pr8819();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = "45";
        if(n == 1){
            System.out.println(s.charAt(0));
        }
        else if(n == 2){
            System.out.println(s);
        }
        else{
            System.out.print(s);
            for(int i=3; i<=n; i++){
                System.out.print(0);
            }
            System.out.println();
        }
    }
}