import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pr53 {
    public static void main(String[] args) {
        Test a = new Test();
        a.calc();
    }
}

class Test {
    int n, m, start, finish, cur_i, cur_j, cur_position;
    Node [][] a;
    Node [][] used;
    Node [][] dis;
    Queue<Integer> q = new LinkedList<>();

    public void calc(){
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        start = in.nextInt();
        finish = in.nextInt();
        a = new Node[n][m];
        used = new Node[n][m];
        dis = new Node[n][m];
        int cnt = 1;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = new Node();
                used[i][j] = new Node(0,0);
                dis[i][j] = new Node(0,0);
                if(cnt == start){
                    cur_i = i;
                    cur_j = j;
                    cur_position = 1; // left
                }
                a[i][j].first = cnt++;
                if(cnt == start){
                    cur_i = i;
                    cur_j = j;
                    cur_position = 2; // right
                }
                a[i][j].second = cnt++;
                //System.out.print(a[i][j].first + "/" + a[i][j].second + "   ");
            }
            //System.out.println();
        }

        bfs();


    }

    public void bfs(){
        q.add(start);
        int top;

        while(!q.isEmpty()){
            top = q.remove();

            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(top == a[i][j].first){
                        cur_i = i;
                        cur_j = j;
                        cur_position = 1; // left
                        i = n;
                        j = m;
                    }
                    else if(top == a[i][j].second){
                        cur_i = i;
                        cur_j = j;
                        cur_position = 2; // right
                        i = n;
                        j = m;
                    }
                }
            }

            if(cur_position == 1)
                used[cur_i][cur_j].first = 1;
            else if(cur_position == 2)
                used[cur_i][cur_j].second = 1;


            if(finish == top){
                if(cur_position == 1)
                    System.out.println(dis[cur_i][cur_j].first);
                else if(cur_position == 2)
                    System.out.println(dis[cur_i][cur_j].second);

                break;
            }

            if(cur_position == 1) {
                if(cur_j > 1 && used[cur_i][cur_j-1].second == 0){
                    q.add(a[cur_i][cur_j-1].second);
                    dis[cur_i][cur_j-1].second = dis[cur_i][cur_j].first + 1;
                }
                if(used[cur_i][cur_j].second == 0){
                    q.add(a[cur_i][cur_j].second);
                    dis[cur_i][cur_j].second = dis[cur_i][cur_j].first + 1;
                }
                if(cur_i > 1 && used[cur_i-1][cur_j].second == 0){
                    q.add(a[cur_i-1][cur_j].second);
                    dis[cur_i-1][cur_j].second = dis[cur_i][cur_j].first + 1;
                }
            }
            else if(cur_position == 2) {
                if(used[cur_i][cur_j].first == 0){
                    q.add(a[cur_i][cur_j].first);
                    dis[cur_i][cur_j].first = dis[cur_i][cur_j].second + 1;
                }
                if(cur_j < (m-1) && used[cur_i][cur_j+1].first == 0){
                    q.add(a[cur_i][cur_j+1].first);
                    dis[cur_i][cur_j+1].first = dis[cur_i][cur_j].second + 1;
                }
                if(cur_i < (n-1) && used[cur_i+1][cur_j].first == 0){
                    q.add(a[cur_i+1][cur_j].first);
                    dis[cur_i+1][cur_j].first = dis[cur_i][cur_j].second + 1;
                }
            }
        }

    }

    class Node {
        int first;
        int second;

        public Node() {
        }

        public Node(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
