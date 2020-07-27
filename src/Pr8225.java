import java.util.Scanner;

public class Pr8225 {
    public static void main(String[] args) {
        Pr8225 a = new Pr8225();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        String p = in.nextLine();
        String t = in.nextLine();
        int k = in.nextInt();
        int cnt=0;

        for(int i=k-1; i<k-1+p.length(); i++){
            if(t.charAt(i) != p.charAt(cnt)){
                cnt++;
            }
            else{
                cnt++;
                break;
            }
        }

        if(cnt == p.length()){
            System.out.println("YES");
            System.out.println(p.length());
        }
        else{
            System.out.println("NO");
            System.out.println(cnt);
        }
    }
}
