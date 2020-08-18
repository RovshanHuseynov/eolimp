import java.util.Scanner;

public class Pr5471 {
    public static void main(String[] args) {
        Pr5471 a = new Pr5471();
        a.calc();
    }

    int n;
    boolean [] used;
    double [] dis;
    int[][] arr;
    private final double MAX = 10.0;

    public void calc(){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        used = new boolean[n+1];
        arr = new int[n+1][n+1];
        dis = new double[n+1];

        for(int i=0; i<=n; i++){
            dis[i] = MAX;
        }

        int m = in.nextInt();
        int u,v,w;

        for(int i=0; i<m; i++){
            u = in.nextInt();
            v = in.nextInt();
            w = in.nextInt();

            arr[u][v] = w;
        }

        dis[1] = 0;
        dij(1);

        for(int i=2; i<=n; i++){
            System.out.printf("%8f\n", dis[i]);
        }
    }

    public void dij(int from){
        used[from] = true;

        for(int i=1; i<=n; i++){
            if(arr[from][i] != 0 && !used[i] && dis[i] > dis[from] + (double) 1 / (double)arr[from][i]){
                dis[i] = dis[from] + (double) 1 / (double)arr[from][i];
            }
        }
    }
}
