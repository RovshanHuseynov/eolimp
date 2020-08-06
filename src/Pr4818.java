import java.util.Scanner;

public class Pr4818 {
    public static void main(String[] args) {
        Pr4818 a = new Pr4818();
        a.calc();
    }

    int [][] a;
    int n;
    boolean [] used;
    int [] parent;
    boolean isCycle;

    public void dfs(int from){
        used[from] = true;

        for(int to=0; to<n; to++){
            if(a[from][to] == 1){
                if(!used[to]){
                    parent[to] = from;
                    dfs(to);
                }
                else if(parent[from] != to){
                    isCycle = true;
                }
            }
        }
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n][n];
        used = new boolean[n];
        parent = new int[n];
        int cnt = 0;
        isCycle = false;

        for(int i=0; i<n; i++){
            parent[i] = i;
            for(int j=0; j<n; j++){
                a[i][j] = in.nextInt();

                if(a[i][j] == 1) cnt++;
            }
        }

        cnt = 0;
        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                cnt++;
                dfs(i);
            }
        }

        if (isCycle || cnt > 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
