import java.util.*;

public class Pr8374 {
    public static void main(String[] args) {
        Pr8374 a = new Pr8374();
        a.calc();
        //a.calc1();
    }

    List<Integer> l = new ArrayList<>(1000002);

    public void calc(){
        int[] a = new int[1000002];
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            a[in.nextInt()]++;
        }

        for(int i=1; i<=1000000; i++){
            if(a[i] % 2 == 1){
                System.out.println(i);
                break;
            }
        }
    }

    public void calc1(){
        int min = 1000009,max=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x;

        for(int i=0; i<=1000001; i++){
            l.add(0);
        }


        for(int i=0; i<n; i++){
            x = in.nextInt();
            l.set(x, l.get(x)+1);

            if(x > max) max = x;
            if(x < min) min = x;
            //System.out.println(x + " " + l.get(x));
        }

        //Collections.sort(l);
        System.out.println(bSearch(min,max));
    }

    public int bSearch(int left, int right){
        if(left > right || left <= 0 || right >= 1000001){
            return 0;
        }
        int mid = left + (right - left) / 2;
        //System.out.println(left + " " + right + " " + mid + " " + l.get(mid));
        //System.out.println(left + " " + right + " " + mid + " " + l.get(mid));
        if(l.get(mid) % 2 == 1){
            //System.out.println(mid + " " + l.get(mid));
            return mid;
        }
        else {
            return bSearch(left, mid - 1) + bSearch(mid + 1, right);
        }
    }
}
