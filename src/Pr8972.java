import java.util.Scanner;

public class Pr8972 {
    public static void main(String[] args) {
        Pr8972 a = new Pr8972();
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
            if(arr[x[i]+100] > 1){
                cnt++;
                if(cnt > 1){
                    System.out.print(" ");
                }
                System.out.print(x[i]);
                arr[x[i]+100] = 0;
            }
        }

        if(cnt == 0){
            System.out.println("NO");
        }
        else{
            System.out.println();
        }
    }
}
