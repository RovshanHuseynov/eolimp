import java.util.ArrayList;
import java.util.Scanner;

public class TestLast {
    public static void main(String[] args) {
        Testtt a = new Testtt();
        a.calc();
    }
}

class Testtt {
    public ArrayList<Integer> ans;
    public ArrayList<Integer> arr;
    int n;
    long ans1, ans2;

    public void calc(){
        //Scanner in = new Scanner(System.in);
        //n = in.nextInt();

        for(int z=1; z<=50; z++) {
            n = z;
            int temp;
            ans = new ArrayList<>();
            arr = new ArrayList<>();

            arr.add(0);
            for (int i = 1; i <= 9; i++) {
                temp = i * i * i;
                if (temp <= n) {
                    arr.add(temp);
                }
            }
/*
        for(int i=0; i<arr.size(); i++){
            System.out.println(i + " " + arr.get(i));
        }
 */


            while (n > 0) {
                fill(9);
                fill(8);
                fill(7);
                fill(6);
                fill(5);
                fill(4);
                fill(3);
                fill(2);
                fill(1);
            }

            //System.out.print(z + " ");

            /*
            for (int i = ans.size() - 1; i >= 0; i--) {
                System.out.print(ans.get(i));
            }
            System.out.println();
             */

            ans1  = 0L;
            ans2 = 0L;
            long mult = 1;

            for (int i = 0; i < ans.size(); i++) {
                ans1 += mult * (long)ans.get(i);
                mult *= 10L;
            }

            doo:
            for(int a=1; a<=9; a++){
                if(a*a*a == z) { ans2 = a; break doo; }
                for(int b=1; b<=9; b++){
                    if(a*a*a + b*b*b == z) { ans2 = a*10 + b; break doo; }
                    for(int c=1; c<=9; c++){
                        if(a*a*a + b*b*b + c*c*c== z) { ans2 = a*100 + b*10 + c; break doo; }
                        for(int d=1; d<=9; d++){
                            if(a*a*a + b*b*b + c*c*c + d*d*d == z) { ans2 = a*1000 + b*100 + c*10 + d; break doo; }
                            for(int e=1; e<=9; e++){
                                if(a*a*a + b*b*b + c*c*c + d*d*d + e*e*e == z) { ans2 = a*10000 + b*1000 + c*100 + d*10 + e; break doo; }
                                for(int f=1; f<=9; f++){
                                    if(a*a*a + b*b*b + c*c*c + d*d*d + e*e*e + f*f*f == z) { ans2 = a*100000 + b*10000 + c*1000 + d*100 + e*10 + f; break doo; }
                                }
                            }
                        }
                    }
                }
            }

            if(ans1 != ans2){
                System.out.println(z + " " + ans1 + " " + ans2);
            }

        }
    }

    public void fill(int x){
        if(x >= arr.size()){
            return;
        }
        //System.out.println(arr.get(x));
        while(n >= arr.get(x)){
            n -= arr.get(x);
            ans.add(x);
        }
    }
}
