import java.util.*;

public class Pr8593 {
    public static void main(String[] args) {
        Test2 a = new Test2();
        a.calc();
    }
}

class Test2 {
    class Node{
        int a,b,c;

        public Node(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = s.length();
        int min = 1000,cur;

        if(n == 1){
            cur = ((int)s.charAt(0) - 48);
            if(cur % 8 == 0){
                min = cur;
            }

            if(min != 1000){
                System.out.println(min);
            }
            else {
                System.out.println("-1");
            }
        }
        else if(n == 2){
            cur = ((int)s.charAt(0) - 48) * 10 + ((int)s.charAt(1) - 48);
            if(cur % 8 == 0){
                min = cur;
            }

            cur = ((int)s.charAt(1) - 48) * 10 + ((int)s.charAt(0) - 48);
            if(cur % 8 == 0 && cur < min){
                min = cur;
            }

            if(min != 1000){
                System.out.println(min);
            }
            else {
                System.out.println("-1");
            }
        }
        else {
            List<Character> l = new ArrayList<>();
            for(int i=0; i<n; i++){
                l.add(s.charAt(i));
            }

            Node minn = new Node(0,0,0);
            Collections.sort(l);
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        cur = ((int)l.get(i) - 48) * 100 + ((int)l.get(j) - 48) * 10 + ((int)l.get(k) - 48);
                        if (cur % 8 == 0 && cur < min) {
                            min = cur;
                            minn = new Node(i,j,k);
                        }
                    }
                }
            }

            if(min != 1000){
                //System.out.println(min);
                //System.out.println(minn.a + " " + minn.b + " " + minn.c);
                Character one = l.get(minn.a);
                Character two = l.get(minn.b);
                Character three = l.get(minn.c);
                //System.out.println(one + " " + two + " " + three);

                l.remove(minn.a);
                l.remove(minn.b);
                l.remove(minn.c);

                for(Character c : l){
                    System.out.print(c);
                }

                System.out.print(one);
                System.out.print(two);
                System.out.println(three);
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
