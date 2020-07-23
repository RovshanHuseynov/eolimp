import java.util.Scanner;

public class Pr10080 {
    public static void main(String[] args) {
        Pr10080 a = new Pr10080();
        a.calc1();
    }

    int [][] arr;
    int ans,n,m,row,column,limit;

    public void calc() {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        ans = n * m;
        arr = new int[n+1][m+1];
        row = 1;
        column = 1;
        limit = 0;

        while(ans > 0) {
            goRight(true);
            if(ans == 0){
                break;
            }
            column--;
            row++;

            goDown(true);
            if(ans == 0){
                break;
            }
            row--;
            column--;

            goLeft(true);
            if(ans == 0){
                break;
            }
            column++;
            row--;
            limit++;

            goUp(true);
            row++;
            column++;
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(arr[i][m]);
        }
    }

    public void calc1() {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        ans = 1;
        arr = new int[n+1][m+1];
        row = n;
        column = 1;
        limit = 0;

        while(ans <= n * m) {
            goRight(false);
            if(ans == n * m + 1){
                break;
            }
            column--;
            row--;

            goUp(false);
            if(ans == n * m + 1){
                break;
            }
            row++;
            column--;

            goLeft(false);
            if(ans == n * m + 1){
                break;
            }
            column++;
            row++;
            limit++;


            goDown(false);
            if(ans == n * m + 1){
                break;
            }
            row--;
            column++;
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(arr[i][m]);
        }
    }

    public void goRight(boolean flag){
        while(column <= m - limit) {
            arr[row][column++] = ans;

            if(flag){
                ans--;
            }
            else{
                ans++;
            }
        }
    }

    public void goDown(boolean flag){
        while(row <= n - limit) {
            arr[row++][column] = ans;

            if(flag){
                ans--;
            }
            else{
                ans++;
            }
        }
    }

    public void goLeft(boolean flag){
        while(column > limit) {
            arr[row][column--] = ans;

            if(flag){
                ans--;
            }
            else{
                ans++;
            }
        }
    }

    public void goUp(boolean flag){
        while(row > limit) {
            arr[row--][column] = ans;

            if(flag){
                ans--;
            }
            else{
                ans++;
            }
        }
    }
}
