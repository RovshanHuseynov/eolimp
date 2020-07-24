import java.util.Scanner;

public class Pr2668 {
    public static void main(String[] args) {
        Pr2668 a = new Pr2668();
        a.calc();
    }

    int [][] arr;
    int cnt,n,row,column,limit;

    public void calc(){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        if(n == 1){
            System.out.println(0);
            return;
        }
        arr = new int[n+1][n+1];
        cnt = 0;
        row = 1;
        column = 1;
        limit = 0;

        while(true) {
            cnt++;
            goRight();
            if(cnt == n){
                break;
            }
            column--;
            row++;

            cnt++;
            goDown();
            if(cnt == n){
                break;
            }
            row--;
            column--;

            cnt++;
            goLeft();
            if(cnt == n){
                break;
            }
            column++;
            row--;

            limit+=2;
            cnt++;
            goUp();
            if(cnt == n){
                break;
            }
            row++;
            column++;
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(arr[i][n]);
        }
    }

    public void goRight(){
        while(column <= n - limit) {
            arr[row][column++] = 1;
        }
    }

    public void goDown(){
        while(row <= n - limit) {
            arr[row++][column] = 1;
        }
    }

    public void goLeft(){
        while(column > limit) {
            arr[row][column--] = 1;
        }
    }

    public void goUp(){
        while(row > limit) {
            arr[row--][column] = 1;
        }
    }
}
