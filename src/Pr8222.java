import java.util.Scanner;

public class Pr8222 {
    public static void main(String[] args) {
        Pr8222 a = new Pr8222();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int i = in.nextInt();
        int j = in.nextInt();

        System.out.println(j-i+1);
        System.out.println(s.substring(i-1,j));
    }
}
