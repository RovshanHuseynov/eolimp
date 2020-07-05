import java.util.Scanner;

public class Pr8978 {
    public static void main(String[] args) {
        Pr8978 a = new Pr8978();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int len = s.length();

        if(len >= 2) System.out.print(s.charAt(1));
        if(len >= 4) System.out.print(s.charAt(3));
        if(len >= 10) System.out.print(s.charAt(9));
        System.out.println();

        if(len >= 1) System.out.print(s.charAt(0));
        if(len >= 2) System.out.print(s.charAt(1));
        if(len >= 3) System.out.print(s.charAt(len-1));
        System.out.println();

        for(int i=len-5; i<len; i++){
            System.out.print(s.charAt(i));
        }
        System.out.println();

        for(int i=0; i<len-4; i++){
            System.out.print(s.charAt(i));
        }
        System.out.println();


        int cnt = 0;
        for(int i=0; i<len; i+=2){
            cnt++;
            System.out.print(s.charAt(i));
        }
        System.out.println();
        System.out.println(cnt);

        for(int i=len-1; i>=0; i-=2){
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
