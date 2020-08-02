import java.util.Scanner;

public class Pr8373 {
    public static void main(String[] args) {
        Pr8373 a = new Pr8373();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int row = 0,cnt = 0, cur = 0, first, second;

        doo:
        while(true){
            cnt++;

            for(int i=1; i<=cnt; i++){
                row++;
                cur += cnt;
                //System.out.println(row + " " + cur);

                if(cur >= n){
                    System.out.println(row + " " + (n + cnt - cur));
                    break doo;
                }
            }
        }
    }
}
