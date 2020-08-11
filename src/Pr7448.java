import java.util.Scanner;

public class Pr7448 {
    public static void main(String[] args) {
        Test a = new Test();
        a.calc();
    }
}

class Test {
    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }

        int cnt = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    for(int p=k+1; p<n; p++){
                        for(int q=p+1; q<n; q++){
                            if(a[i] + a[j] + a[k] + a[p] + a[q] == 0) cnt++;
                        }
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
