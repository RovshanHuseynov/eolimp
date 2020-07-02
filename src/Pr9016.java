import java.util.Scanner;

public class Pr9016 {
    public static void main(String[] args) {
        Pr9016 a = new Pr9016();
        a.calc();
    }

    public int[] a;
    int n;

    public void calc() {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int q = in.nextInt();
        a = new int[n];
        int x;

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < q; i++) {
            x = in.nextInt();
            System.out.println(binarySearch(0, n-1, x));
        }
    }

    public String binarySearch(int left, int right, int x) {
        if (left > right) {
            return "NO";
        }

        int mid = left + (right - left) / 2;
        //System.out.println(a[left] + " " + a[right] + " " + a[mid] + " " + x);

        if (a[mid] == x) {
            return "YES";
        } else if (a[mid] > x) {
            return binarySearch(left, mid - 1, x);
        } else {
            return binarySearch(mid + 1, right, x);
        }
    }
}
