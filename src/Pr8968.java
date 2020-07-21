import java.util.Scanner;

public class Pr8968 {
    public static void main(String[] args) {
        Test8 a = new Test8();
        a.calc();
    }
}

class Test8 {
    public void calc(){
        int n,maxx=-101,minn=101,x,y;
        int [] a = new int[100001];
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
            if(a[i] > maxx){
                maxx = a[i];
            }
            if(a[i] < minn){
                minn = a[i];
            }
        }

        if(minn == 0){
            for (int i = 0; i < n; i++) {
                a[i] = a[i] - (maxx + 1);
                if(i == 0){
                    System.out.print(a[0]);
                }
                else{
                    System.out.print(" " + a[i]);
                }
            }
            System.out.println();
        }
        else {
            x = maxx / 2;
            y = minn / 2;

            for (int i = 0; i < n; i++) {
                if (a[i] >= 0) {
                    a[i] -= x;
                } else {
                    a[i] -= y;
                }
            }

            System.out.print(a[0]);
            for (int i = 1; i < n; i++) {
                System.out.print(" " + a[i]);
            }

            System.out.println();
        }
    }
}
