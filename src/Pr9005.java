import java.util.Scanner;

public class Pr9005 {
    public static void main(String[] args) {
        Test a = new Test();
        a.calc();
    }
}

class Test {
    public void calc(){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if(x % 2 == 0){
            System.out.println(x-1);
        }
        else{
            System.out.println(x+1);
        }
    }
}
