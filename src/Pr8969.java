import java.util.Scanner;

public class Pr8969 {
    public static void main(String[] args) {
        Pr8969 a = new Pr8969();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];

        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
            if(i > 0){
                System.out.print(" " + (a[i] - a[i-1]));
            }
            else{
                System.out.print(a[0]);
            }
        }
        System.out.println();
    }
}