// 3% accepted :)

import java.util.Scanner;

public class Pr317 {
    public static void main(String[] args) {
        Pr317 a = new Pr317();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();

        int lenB = b.length() - 1;
        String result = "0", temp = "";


        for(int i=lenB; i>=0; i--){
            temp = mult(a, b.charAt(i));

            for(int j=1; j<=(lenB-i); j++){
                temp += "0";
            }

            //System.out.println(temp);

            result = add(result, temp);
        }

        System.out.println(result);
    }

    public String add(String a, String b){    // 123 + 345
        String ans = "";
        int memo = 0, cur;
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;

        while(lenA >= 0 || lenB >= 0){
            if(lenA >= 0 && lenB >= 0){
                cur = Integer.parseInt(a.charAt(lenA) + "") + Integer.parseInt(b.charAt(lenB) + "") + memo;
                memo = cur / 10;
                ans += (cur % 10);
                lenA--;
                lenB--;
            }
            else if(lenA >= 0){
                cur = Integer.parseInt(a.charAt(lenA) + "") + memo;
                memo = cur / 10;
                ans += (cur % 10);
                lenA--;
            }
            else if(lenB >= 0){
                cur = Integer.parseInt(b.charAt(lenB) + "") + memo;
                memo = cur / 10;
                ans += (cur % 10);
                lenB--;
            }
        }

        if(memo > 0){
            ans += memo;
        }

        String last = "";

        for(int i=ans.length()-1; i>=0; i--){
            last += ans.charAt(i);
        }

        return last;
    }

    public String mult(String a, char b){    // 3 * 12345667
        String ans = "";
        int memo = 0, cur;
        int lenA = a.length() - 1;

        for(int i=lenA; i>=0; i--){
            cur = Integer.parseInt(a.charAt(i) + "") * Integer.parseInt(b + "") + memo;
            memo = cur / 10;
            ans += (cur % 10);
        }

        if(memo > 0){
            ans += memo;
        }

        String last = "";

        for(int i=ans.length()-1; i>=0; i--){
            last += ans.charAt(i);
        }

        return last;
    }
}
