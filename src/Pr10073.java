import java.util.Scanner;

public class Pr10073 {
    public static void main(String[] args) {
        Pr10073 a = new Pr10073();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        StringBuilder ans = new StringBuilder();
        int n = in.nextInt();


        while(n > 1){
            if(n % 3 == 0){
                ans.append("3");
                n /= 3;
            }
            else{
                ans.append("1");
                n -= 1;
            }
        }

        System.out.println(ans.reverse());
    }
}
