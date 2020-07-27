import java.util.Scanner;

public class Pr9546 {
    public static void main(String[] args) {
        Pr9546 a = new Pr9546();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = s.length();
        int cur;
        int [] arr = {2,22,222,3,33,333,4,44,444,5,55,555,6,66,666,7,77,777,7777,8,88,888,9,99,999,9999};

        for(int i=0; i<n; i++){
            if(s.charAt(i) == ' ')
                System.out.print(0);
            else
                System.out.print(arr[(int)s.charAt(i) - 65]);

            if(i == n-1)
                System.out.println();
            else
                System.out.print(" ");
        }

    }
}
