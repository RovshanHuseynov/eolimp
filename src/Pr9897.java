import java.util.Comparator;
import java.util.Scanner;

public class Pr9897 {
    public static void main(String[] args) {
        Test t = new Test();
        t.calc();
    }
}

class Test {
    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.nextLine();

        for(int i=0; i<n; i++){
            s = in.nextLine();
            String[] splitter = s.split(" ");
            int len = splitter.length;
            Comparator<String> com = new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.length()-o2.length();
                }
            };


        }
    }
}
