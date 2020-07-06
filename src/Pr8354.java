import java.util.ArrayList;
import java.util.Scanner;

public class Pr8354 {
    public static void main(String[] args) {
        Test a = new Test();
        a.calc();
    }
}

class Test {
    public ArrayList<Integer> ans;
    public ArrayList<Integer> arr;
    int n;

    public void calc(){
        //Scanner in = new Scanner(System.in);
        //n = in.nextInt();

        for(int z=1; z<=50; z++) {
            n = z;
            int temp;
            ans = new ArrayList<>();
            arr = new ArrayList<>();

            arr.add(0);
            for (int i = 1; i <= 9; i++) {
                temp = i * i * i;
                if (temp <= n) {
                    arr.add(temp);
                }
            }
/*
        for(int i=0; i<arr.size(); i++){
            System.out.println(i + " " + arr.get(i));
        }
 */


            while (n > 0) {
                fill(9);
                fill(8);
                fill(7);
                fill(6);
                fill(5);
                fill(4);
                fill(3);
                fill(2);
                fill(1);
            }

            System.out.print(z + " ");
            for (int i = ans.size() - 1; i >= 0; i--) {
                System.out.print(ans.get(i));
            }
            System.out.println();


        }
    }

    public void fill(int x){
        if(x >= arr.size()){
            return;
        }
        //System.out.println(arr.get(x));
        while(n >= arr.get(x)){
            n -= arr.get(x);
            ans.add(x);
        }
    }
}
