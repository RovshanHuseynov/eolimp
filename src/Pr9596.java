import java.util.Scanner;

public class Pr9596 {
    public static void main(String[] args) {
        Pr9596 a = new Pr9596();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String s;
        int curLen = 0;

        for(int i=0; i<n; i++){
            s = in.next();

            if(curLen == 0){
                System.out.print(s);
                curLen = s.length();
            }
            else if(s.length() + curLen <= k){
                System.out.print(" " + s);
                curLen += s.length();
            }
            else{
                System.out.println();
                System.out.print(s);
                curLen = s.length();
            }
        }
    }
}
