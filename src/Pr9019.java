import java.util.Scanner;

public class Pr9019 {
    public static void main(String[] args) {
        Pr9019 a = new Pr9019();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long n = in.nextLong();

        long ans = binarySeach(1,1000000000,n,a,b,c);

        while(true){
            long temp = ans;
            ans = binarySeach(1,ans-1,n,a,b,c);

            if(ans == -1){
                System.out.println(binarySeach(1,temp,n,a,b,c));
                break;
            }
        }
    }

    public long ebob(long a, long b){
        while(b != 0){
            a = a % b;
            a = b - a + (b = a);
        }

        return a;
    }

    public long ekob(long a, long b){
        return a * b / ebob(a,b);
    }

    public long ekob(long a, long b, long c){
        return (a * b / ebob(a,b)) * c / ebob((a * b / ebob(a,b)),c);
    }

    public long numberofDivisors(long right, long div){
        long last = right / div * div;
        return (last - div) / div + 1;
    }

    public long binarySeach(long left, long right, long n, long a, long b, long c) {
        long mid = left + (right - left) / 2;

        if(left > right){
            return -1;
        }

        long t = numberofDivisors(mid, a) + numberofDivisors(mid, b) + numberofDivisors(mid, c)
                - numberofDivisors(mid, ekob(a,b)) - numberofDivisors(mid, ekob(a,c)) - numberofDivisors(mid, ekob(b,c))
                + numberofDivisors(mid, ekob(a,b,c));

        if (t == n) {
            return mid;
        } else if (t > n) {
            return binarySeach(left, mid - 1, n, a, b, c);
        } else {
            return binarySeach(mid + 1, right, n, a, b, c);
        }
    }
}
