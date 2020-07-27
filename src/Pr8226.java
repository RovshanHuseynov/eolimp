import java.util.Scanner;

public class Pr8226 {
    public static void main(String[] args) {
        Pr8226 a = new Pr8226();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        String p = in.nextLine();
        String t = in.nextLine();
        int ans = 0;
        boolean flag = false;
        StringBuilder s = new StringBuilder();

        for(int i=0; i<t.length()-p.length(); i++){
            flag = true;
            for(int j=0; j<p.length(); j++){
                s.append(p.charAt(j));

                if(p.charAt(j) != t.charAt(i+j)){
                    flag = false;
                    break;
                }
            }

            if(flag){
                ans = i + 1;
                break;
            }
        }

        System.out.println(s);
        System.out.println(ans);
    }
}
