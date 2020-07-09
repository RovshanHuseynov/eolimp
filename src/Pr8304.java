import java.util.Scanner;

public class Pr8304 {
    public static void main(String[] args) {
        Pr8304 a = new Pr8304();
        a.calc();;
    }

    public int [][] memo = new int[52][52];

    public void calc(){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        System.out.println(func(x, y));
    }

    public int func(int x, int y){
        if(x <= 0 || y <= 0){
            return 0;
        }

        int temp1 = 0, temp2 = 0;

        if(x <= y){
            if(x - 1 > 0 && y - 2 > 0){
                if(memo[x - 1][y - 2] == 0) {
                    memo[x - 1][y - 2] = func(x - 1, y - 2);
                }

                temp1 = memo[x - 1][y - 2];
            }

            if(x - 2 > 0 && y - 1 > 0){
                if(memo[x-2][y-1] == 0) {
                    memo[x - 2][y - 1] = func(x - 2, y - 1);
                }

                temp2 = memo[x - 2][y - 1];
            }

            return temp1 + temp2 + 2;
        }
        else {
            if(x - 2 > 0 && y - 2 > 0){
                if(memo[x-2][y-2] == 0) {
                    memo[x - 2][y - 2] = func(x - 2, y - 2);
                }

                temp1 = memo[x - 2][y - 2];
            }

            return temp1 + 1;
        }
    }
}
