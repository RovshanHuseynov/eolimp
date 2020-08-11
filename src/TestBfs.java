import java.util.Scanner;

public class TestBfs {
    public static void main(String[] args) {
        Test1 a = new Test1();
        a.calc();
    }
}

class Test1 {
    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }


    }
}
