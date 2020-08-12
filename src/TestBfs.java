import java.util.*;

public class TestBfs {
    public static void main(String[] args) {
        Test1 a = new Test1();
        a.calc();
    }
}

/*7 6
1 2
1 3
2 4
2 5
3 6
6 7*/

class Test1 {
    Queue<Integer> q = new LinkedList<>();
    int n;
    int [][] a;
    boolean[] used;
    public void calc(){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int m = in.nextInt();
        a = new int[n+1][n+1];
        used = new boolean[n+1];
        int x,y;
        for(int i=0; i<m; i++){
            x = in.nextInt();
            y = in.nextInt();

            a[x][y] = 1;
            a[y][x] = 1;
        }

        bfs(1);
    }

    public void bfs(int from){
        used[from] = true;
        q.add(from);
        int top;

        if(!q.isEmpty()) {
            top = q.remove();
            System.out.println(top);
            used[top] = true;

            for(int i=1; i<=n; i++){
                if(a[top][i] == 1 && !used[i]){
                    q.add(i);
                }
            }
        }

    }
}
