import java.util.Scanner;

public class Pr10080 {
    public static void main(String[] args) {
        Test6 a = new Test6();
        a.calc();
    }
}

class Test6 {
    int [][] arr;
    int ans = 0,n=0,m=0,row=1,column=1,limit=0;
    public void calc() {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        ans = n * m;
        arr = new int[n+1][m+1];

        while(ans > 0) {
            //System.out.println(row + " " + column);
            goRight();
            //System.out.println(row + " " + column);
            if(ans == 0){
                break;
            }
            column--;
            row++;
            //System.out.println(row + " " + column);
            goDown();
            //System.out.println(row + " " + column);
            if(ans == 0){
                break;
            }
            row--;
            column--;
            //System.out.println(row + " " + column);
            goLeft();
            //System.out.println(row + " " + column);
            if(ans == 0){
                break;
            }
            column++;
            row--;
            limit++;
            //System.out.println(row + " " + column);
            goUp();
            //System.out.println(row + " " + column);
            row++;
            column++;
            //System.out.println(ans);
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
            arr[row][column++] = (ans--);
        }
    }

    public void goDown(){
        while(row <= n - limit) {
            arr[row++][column] = (ans--);
        }
    }

    public void goLeft(){
        while(column > limit) {
            arr[row][column--] = (ans--);
        }
    }

    public void goUp(){
        while(row > limit) {
            arr[row--][column] = (ans--);
        }
    }
}
