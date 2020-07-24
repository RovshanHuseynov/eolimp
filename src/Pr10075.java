import java.util.Scanner;

public class Pr10075 {
    public static void main(String[] args) {
        Pr10075 a = new Pr10075();
        a.calc();
    }

    int [][] arr;
    int ans,n,m,row,column,limit;

    public void calc(){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        ans = 1;
        arr = new int[n+1][m+1];
        row = n;
        column = m;
        limit = 0;

        while(ans <= n * m) {
            goUp();
            if(ans == n * m + 1){
                break;
            }
            row++;
            column--;

            goLeft();
            if(ans == n * m + 1){
                break;
            }
            column++;
            row++;

            goDown();
            if(ans == n * m + 1){
                break;
            }
            row--;
            column++;
            limit++;

            goRight();
            if(ans == n * m + 1){
                break;
            }
            column--;
            row--;
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(arr[i][m]);
        }
    }

    public void goRight(){
        while(column <= m - limit) {
            arr[row][column++] = (ans++);
        }
    }

    public void goDown(){
        while(row <= n - limit) {
            arr[row++][column] = (ans++);
        }
    }

    public void goLeft(){
        while(column > limit) {
            arr[row][column--] = (ans++);
        }
    }

    public void goUp(){
        while(row > limit) {
            arr[row--][column] = (ans++);
        }
    }
}
