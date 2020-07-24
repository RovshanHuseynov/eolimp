import java.util.Scanner;

public class Pr10079 {
    public static void main(String[] args) {
        Pr10079 a = new Pr10079();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = s.length();
        int [] cnt = new int[32];
        int max = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                cnt[(int)s.charAt(i) - 65]++;

                if(cnt[(int)s.charAt(i) - 65] > max){
                    max = cnt[(int)s.charAt(i) - 65];
                }
            }
            else{
                cnt[(int)s.charAt(i) - 97]++;

                if(cnt[(int)s.charAt(i) - 97] > max){
                    max = cnt[(int)s.charAt(i) - 97];
                }
            }
        }

        for(int i=0; i<32; i++){
            if(cnt[i] == max){
                System.out.println((char)(i + 65));
                break;
            }
        }
    }
}