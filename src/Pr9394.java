import java.util.Scanner;

public class Pr9394 {
    public static void main(String[] args) {
        Test4 a = new Test4();
        a.calc1();
    }
}

class Test4 {
    public void calc(){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        if(n < 0){
            n = -n;
        }
        System.out.println(sum(n));
    }

    long sum(long n){
        if(n == 0){
            return n;
        }

        return n%10 + sum(n/10);
    }

    public void calc1(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if(s.length() == 1 && s.charAt(0) == '0'){
            System.out.println("1");
            return;
        }
        int i = 0;
        if(s.charAt(0) == '-'){
            i++;
        }
        System.out.println(5/0);
        int sum = 0;
        while(i < s.length()){
            sum += (int)s.charAt(i) - 48;
            i++;
        }

        System.out.println(sum);
    }
}
