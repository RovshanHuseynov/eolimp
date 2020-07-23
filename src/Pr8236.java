import java.util.*;

public class Pr8236 {
    public static void main(String[] args) {
        Test9 a = new Test9();
        a.calc();
    }
}

class Test9 {
    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x;
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for(int i=0; i<n; i++){
            x = in.nextInt();

            if(x % 2 == 0){
                even.add(x);
            }
            else{
                odd.add(x);
            }
        }

        Collections.sort(odd, (o1, o2) -> o1-o2);
        Collections.sort(even, (o1, o2) -> o2-o1);

        System.out.print(odd.get(0));
        for(int i=1; i<odd.size(); i++){
            System.out.print(" " + odd.get(i));
        }

        for(int i=0; i<even.size(); i++){
            System.out.print(" " + even.get(i));
        }
        System.out.println();
    }
}
