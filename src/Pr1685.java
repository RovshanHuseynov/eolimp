import java.util.Scanner;

public class Pr1685 {
    public static void main(String[] args) {
        Pr1685 a = new Pr1685();
        a.calc();
    }

    boolean [] used;
    boolean [][] a;
    int n;
    public void calc(){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Point [] p = new Point[n];
        for(int i=0; i<n; i++){
            p[i] = new Point(in.nextInt(), in.nextInt());
        }

        a = new boolean[n][n];
        used = new boolean[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i != j && !a[i][j]) {
                    if ((Math.abs(p[i].x - p[j].x) == 1 && p[i].y == p[j].y) ||
                            (Math.abs(p[i].y - p[j].y) == 1 && p[i].x == p[j].x) ||
                            (Math.abs(p[i].x - p[j].x) == 1 && Math.abs(p[i].y - p[j].y) == 1)) {
                        a[i][j] = true;
                        a[j][i] = true;
                    }
                }
            }
        }

        int cnt = 0;
        boolean flag;

        for(int i=0; i<n; i++) {
            if(!used[i]) {
                used[i] = true;
                //System.out.println("call dfs " + i);
                dfs(i);
                cnt++;
            }
        }

        /*for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if(a[i][j]) System.out.print(1 + " ");
                else System.out.print(0 + " ");
            }
            System.out.println();
        }*/

        System.out.println(cnt);
    }

    public void dfs(int i){
        //System.out.println("dfs " + i);
        used[i] = true;

        for(int j=0; j<n; j++){
            if(a[i][j] && !used[j]){
                dfs(j);
            }
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
