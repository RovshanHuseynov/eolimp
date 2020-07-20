import java.util.Scanner;

public class Pr2525 {
    public static void main(String[] args) {
        Pr2525 a = new Pr2525();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s,first,second;
        int k,len;
        s = in.nextLine();
        long [] cnt1 = new long[26];
        long [] cnt2 = new long[26];
        long [] cntTemp = new long[26];

        for(int i=0; i<n; i++){
            s = in.nextLine();
            first = s.split(" ")[0];
            second = s.split(" ")[1];
            k = Integer.parseInt(s.split(" ")[2]);

            for(int j=0; j<26; j++) {
                cnt1[j] = 0;
                cnt2[j] = 0;
            }

            len = first.length();

            for(int j=0; j<len; j++){
                cnt1[(int)first.charAt(j) - 97]++;
            }

            len = second.length();
            for(int j=0; j<len; j++){
                cnt2[(int)second.charAt(j) - 97]++;
            }

            if(k == 0){
                for(int j=0; j<26; j++) {
                    System.out.println((char)(j+97) + ":" + cnt1[j]);
                }
            }
            else if(k == 1){
                for(int j=0; j<26; j++) {
                    System.out.println((char)(j+97) + ":" + cnt2[j]);
                }
            }
            else{
                for(int l=2; l<=k; l++) {
                    for (int j = 0; j < 26; j++) {
                        cntTemp[j] = cnt1[j] + cnt2[j];
                    }

                    cnt1 = cnt2.clone();
                    cnt2 = cntTemp.clone();
                }

                for(int j=0; j<26; j++) {
                    System.out.println((char)(j+97) + ":" + cnt2[j]);
                }
            }
            System.out.println();
        }
    }
}