import java.util.Scanner;

public class Pr8973 {
    public static void main(String[] args) {
        Pr8973 a = new Pr8973();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int [] arr = new int[202];
        int n = in.nextInt();
        int [] x = new int[n];

        for(int i=0; i<n; i++){
            x[i] = in.nextInt();
            arr[x[i]+100]++;
        }

        int cnt = 0;
        for(int i=0; i<n; i++){
            if(arr[x[i]+100] == 1){
                cnt++;
                if(cnt > 1){
                    System.out.print(" ");
                }
                System.out.print(x[i]);
            }
            arr[x[i]+100]--;
        }

        System.out.println();
    }
}
