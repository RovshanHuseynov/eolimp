import java.util.Scanner;

public class Pr10078 {
    public static void main(String[] args) {
        Pr10078 a = new Pr10078();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = s.length();
        int [] cnt = new int[32];
        int min = 101;

        for(int i=0; i<n; i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                cnt[(int)s.charAt(i) - 65]++;
            }
            else{
                cnt[(int)s.charAt(i) - 97]++;
            }
        }

        for(int i=0; i<32; i++){
            if(cnt[i] > 0 && cnt[i] < min){
                min = cnt[i];
            }
        }

        for(int i=31; i>=0; i--){
            if(cnt[i] == min){
                System.out.println((char)(i + 65));
                break;
            }
        }
    }
}
