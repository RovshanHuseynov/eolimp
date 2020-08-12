import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pr9896 {
    public static void main(String[] args) {
        Pr9896 a = new Pr9896();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(in.nextInt());
        }
        int sum = 0;
        for(Integer i : set){
            sum += i;
        }

        System.out.printf("%.4f\n" , (double)sum / (double)set.size());
    }
}
