import java.util.Scanner;
import java.util.Stack;

/*
8 7
1 2
1 3
2 4
2 5
4 7
3 6
6 8
*/

public class Pr1111010 {
    public static void main(String[] args) {
        Pr1111010 a = new Pr1111010();
        a.calc();
    }

    boolean [] used;
    Stack<Integer> s;
    int n;
    int [][] a;
    public void calc() {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        used = new boolean[n+1];
        a = new int[n+1][n+1];
        s = new Stack<>();
        int m = in.nextInt();
        int x, y;

        for(int i=0; i<m; i++){
            x = in.nextInt();
            y = in.nextInt();
            a[x][y] = 1;
            a[y][x] = 1;
        }

        dfs();
    }

    public void dfs(){
        s.add(1);

        while(!s.empty()){
            int from = s.pop();
            used[from] = true;
            System.out.println(from);

            for(int to=1; to<=n; to++){
                if(a[from][to] == 1 && !used[to]){
                    s.add(to);
                }
            }
        }
    }
}
