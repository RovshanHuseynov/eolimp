import java.util.Scanner;

public class Pr354 {
    public static void main(String[] args) {
        Pr354 a = new Pr354();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] mem = new int[n+1];
        int a, i;

        for(i=1; i<=n; i++){
            a = in.nextInt();
            if(a <= n) mem[a]++;
        }


        for(i=1; i<=n; i++){
            if(mem[i] == 0)
                break;
        }

        if(i <= n)
            System.out.println(i);
        else
            System.out.println(0);
    }
}