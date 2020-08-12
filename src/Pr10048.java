import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr10048 {
    public static void main(String[] args) {
        Pr10048 a = new Pr10048();
        a.calc();
    }

    List<List<Integer>> arr;
    boolean [] used;
    int n;
    public void calc(){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        used = new boolean[n+1];
        arr = new ArrayList<>(n+1);

        for(int i=0; i<=n; i++){
            arr.add(new ArrayList<>());
        }
        int m = in.nextInt();
        int x, y;

        for(int i=0; i<m; i++){
            x = in.nextInt();
            y = in.nextInt();

            arr.get(x).add(y);
        }

        /*
        for(int i=1; i<=n; i++) {
            System.out.print(i + "--> ");
            for(int j=0; j<arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
        */

        int cnt = 0;
        for(int i=1; i<=n; i++) {
            if(!used[i]) {
                dfs(i);
                cnt++;
                /*System.out.println(cnt);
                for(int j=1; j<=n; j++) {
                    System.out.println(j + " " + used[j]);
                }
                System.out.println("-------------");*/
            }
        }

        if(cnt % 2 == 0) cnt /= 2;
        else cnt = cnt / 2 + 1;

        System.out.println(cnt);
    }

    public void dfs(int from){
        used[from] = true;
        int to, len = arr.get(from).size();

        for(int i=0; i<len; i++){
            to = arr.get(from).get(i);
            if(!used[to]){
                dfs(to);
            }
        }
    }
}
