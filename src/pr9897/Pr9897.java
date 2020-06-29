package pr9897;

import java.util.*;

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
        int len;
        String s = in.nextLine();

        for(int i=0; i<n; i++){
            s = in.nextLine();
            String[] splitter = s.split(" ");
            List<String> list = new ArrayList<>();
            len = splitter.length;
            for(int j=0; j<len; j++){
                list.add(splitter[j]);
            }
            Comparator<String> cm = (String o1, String o2) -> o1.length()-o2.length();
            Collections.sort(list, cm);

            len = list.size();
            for(int j=0; j<len-1; j++){
                System.out.print(list.get(j) + " ");
            }
            System.out.println(list.get(len-1));
        }
    }
}
