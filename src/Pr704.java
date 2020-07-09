import java.util.Scanner;

public class Pr704 {
    public static void main(String[] args) {
        Test1 a = new Test1();
        a.calc();
    }
}

class Test1 {
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
