// timelimit

import java.util.Scanner;

public class Pr8237 {
    public static void main(String[] args) {
        Pr8237 a = new Pr8237();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        int temp;

        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }

            System.out.print(a[0]);
            for(int j=1; j<n; j++){
                System.out.print(" " + a[j]);
            }
            System.out.println();
        }
    }
}
