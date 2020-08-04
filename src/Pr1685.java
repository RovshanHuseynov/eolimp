import java.util.Scanner;

public class Pr1685 {
    public static void main(String[] args) {
        Test a = new Test();
        a.calc();
    }
}

class Test {
    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Point [] p = new Point[n];
        for(int i=0; i<n; i++){
            p[i] = new Point(in.nextInt(), in.nextInt());
        }

    }

    class Point {
        int x,y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
