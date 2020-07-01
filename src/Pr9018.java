import java.util.Scanner;

public class Pr9018 {
    public static void main(String[] args) {
        Test a = new Test();
        a.calc();
    }
}

class Test {
    public void calc(){
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long n = in.nextLong();

        long ans = binarySeach(1,1000000000,n,a,b);

        long maxx = Math.max(a,b);

        while(maxx >= 0){
            long temp = ans;
            ans = binarySeach(1,ans-1,n,a,b);

            if(ans == -1){
                System.out.println(binarySeach(1,temp,n,a,b));
                break;
            }

            maxx--;
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

    public long numberofDivisors(long left, long right, long div){
        long last = right / div * div;
        return (last - div) / div + 1;
    }

    public long binarySeach(long left, long right, long n, long a, long b) {
        long mid = left + (right - left) / 2;
        //System.out.println(mid + " " + left + " " + right + " " + n + " " + a + " " + b);
        //System.out.println(numberofDivisors(1, mid, a) + numberofDivisors(1, mid, b) - numberofDivisors(1, mid, ekob(a, b)));
        if(left > right){
            return -1;
        }
        else if (numberofDivisors(1, mid, a) + numberofDivisors(1, mid, b) - numberofDivisors(1, mid, ekob(a, b)) == n) {
            return mid;
        } else if (numberofDivisors(1, mid, a) + numberofDivisors(1, mid, b) - numberofDivisors(1, mid, ekob(a, b)) > n) {
            //System.out.println("down");
            return binarySeach(left, mid - 1, n, a, b);
        } else {
            //System.out.println("up");
            return binarySeach(mid + 1, right, n, a, b);
        }
    }
}
