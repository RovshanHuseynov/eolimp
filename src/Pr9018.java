import java.util.Scanner;

public class Pr9018 {
    public static void main(String[] args) {
        Pr9018 a = new Pr9018();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        int ans = binarySeach(1,1000000000,n,a,b);

        while(true){
            int temp = ans;
            ans = binarySeach(1,ans-1,n,a,b);

            if(ans == -1){
                System.out.println(binarySeach(1,temp,n,a,b));
                break;
            }
        }
    }

    public int ebob(int a, int b){
        while(b != 0){
            a = a % b;
            a = b - a + (b = a);
        }

        return a;
    }

    public int ekob(int a, int b){
        return a * b / ebob(a,b);
    }

    public int numberofDivisors(int left, int right, int div){
        int last = right / div * div;
        return (last - div) / div + 1;
    }

    public int binarySeach(int left, int right, int n, int a, int b) {
        int mid = left + (right - left) / 2;
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
