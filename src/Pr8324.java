import java.util.Scanner;

public class Pr8324 {
    public static void main(String[] args) {
        Pr8324 a = new Pr8324();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int i = in.nextInt();
        int j = in.nextInt();

        System.out.println(j-i+2);
        for(int a=i; a<j; a++){
            System.out.println(s.substring(a,j));
        }
    }
}
