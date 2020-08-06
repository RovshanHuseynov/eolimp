import java.util.Scanner;

public class Pr4818 {
    public static void main(String[] args) {
        Test a = new Test();
        a.calc();
    }
}

class Test {
    int [][] a;
    int n;
    boolean [] used;

    public void dfs(int from){
        used[from] = true;

        for(int to=0; to<n; to++){
            if(a[from][to] == 1 && !used[to]) {
                dfs(to);
            }
        }
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n][n];
        used = new boolean[n];
        int cnt = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = in.nextInt();

                if(a[i][j] == 1) cnt++;
            }
        }

        if(n-1 != cnt/2){
            System.out.println("NO");
        }
        else {
            cnt = 0;
            for (int i = 0; i < n; i++) {
                if (!used[i]) {
                    cnt++;
                    dfs(i);
                }
            }

            if (cnt > 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
