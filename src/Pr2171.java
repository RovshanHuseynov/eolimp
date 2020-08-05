import java.util.Scanner;

public class Pr2171 {
    public static void main(String[] args) {
        Pr2171 a = new Pr2171();
        a.calc();
    }

    public void calc(){
        // 74% maximum
        // need to learn Алгоритм Ахо-Корасик
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String [] t = new String[n];
        in.nextLine();
        //System.out.println("T basladi");
        for(int i=0; i<n; i++){
            t[i] = in.nextLine();
            //System.out.println(t[i]);
        }
        String [] s = new String[80001];
        int cnt = 0;

        //in.nextLine();
        //System.out.println("S basladi");
        while(in.hasNextLine()){
            s[cnt++] = in.nextLine();
            //System.out.println(s[cnt-1]);
        }

        int lenS;

        for(int i=0; i<cnt; i++){
            lenS = s[i].length();

            if(lenS == 0) break;

            for(int j=0; j<n; j++){
                if(s[i].contains(t[j])){
                    System.out.println(s[i]);
                    break;
                }
            }
        }
    }
}
