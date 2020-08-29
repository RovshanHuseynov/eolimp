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
    int n, m, start, finish;
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
                a[i][j].first = cnt++;
                a[i][j].second = cnt++;
                System.out.print(a[i][j].first + "/" + a[i][j].second + "   ");
            }
            System.out.println();
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
