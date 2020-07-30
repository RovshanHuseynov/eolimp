import java.util.Scanner;

public class Pr8380 {
    public static void main(String[] args) {
        Test1 a = new Test1();
        a.calc();
    }
}

class Test1 {
    public void calc(){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        String s = String.valueOf(n);
        int len = s.length();
        int digit;
        StringBuilder temp;

        for(int i=len-1; i>=1; i--){
            digit = (int)s.charAt(i) - 48;
            digit--;
            temp = new StringBuilder(digit);

            for(int j=1; j<=len-i-1; j++){
                temp.append("9");
            }
            System.out.println(temp);
        }
    }
}
