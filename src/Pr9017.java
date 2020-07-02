import java.util.HashMap;
import java.util.Scanner;

public class Pr9017 {
    public static void main(String[] args) {
        Pr9017 a = new Pr9017();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int x;
        HashMap<Integer, Integer> cnt = new HashMap<>();

        for(int i=0; i<n; i++){
            x = in.nextInt();

            if(cnt.get(x) == null){
                cnt.put(x, 1);
            }
            else{
                cnt.put(x, cnt.get(x) + 1);
            }
        }

        for(int i=0; i<q; i++){
            x = in.nextInt();

            if(cnt.get(x) == null){
                System.out.println(0);
            }
            else{
                System.out.println(cnt.get(x));
            }
        }
    }
}
