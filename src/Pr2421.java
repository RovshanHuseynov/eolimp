import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr2421 {
    public static void main(String[] args) {
        Test9 a = new Test9();
        a.calc();
    }
}

class Test9 {
    private final long mod = 100000000L;
    Map<Long, Long> map = new HashMap<Long, Long>();

    public void calc(){
        Scanner in = new Scanner(System.in);
        long n;
        long m;

        while(in.hasNext()){
            n = in.nextLong();
            m = in.nextLong();

            System.out.println(fibo(ebob(n,m)));
        }
    }

    public long ebob(long a, long b){
        long temp;
        a = a;
        b = b;

        while(b != 0){
            a = a % b;
            temp = a;
            a = b;
            b = temp;
        }

        return a;
    }

    public long fibo(long n){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        if(n == 2)
            return 1;
        if(map.containsKey(n))
            return map.get(n);

        long half = n / 2, ans;
        if(n % 2 == 1)
            ans = (fibo(half) * fibo(half)+ fibo(half + 1) * fibo(half + 1)) % mod;
        else
            ans = (fibo(half) * fibo(half + 1) + fibo(half) * fibo(half - 1)) % mod;

        map.put(n, ans);
        return ans;
    }
}
