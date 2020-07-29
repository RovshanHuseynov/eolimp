import java.util.Scanner;

public class Pr1030 { // 45% accepted
    public static void main(String[] args) {
        Pr1030 a = new Pr1030();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        //while(true) {
            int n = in.nextInt();
            int d = in.nextInt();
            int tam = n / d;
            int qaliq = n % d, len, uzunluq;
            String s = "", temp;
            boolean flag = false;
            int sum;

            if (qaliq == 0) {
                s += "0";
            }
            while (true) {
                qaliq = n % d;

                if (qaliq == 0) {
                    break;
                }

                qaliq *= 10;
                s = s + (qaliq / d);
                n = qaliq;

                uzunluq = 1;
                int limit, tempLimit, lenTemp;
                boolean isOk;
                while (true) {
                    limit = tempLimit = 5;
                    len = s.length();
                    if(len - uzunluq >= 0) temp = s.substring(len - uzunluq, len);
                    else break;
                    if(uzunluq > 5) limit = tempLimit = 2;
                    //System.out.println(limit + " " + uzunluq +" " + temp + " " + len + " " + s);

                    sum = 0;
                    lenTemp = temp.length();

                    if(lenTemp * 2 > len) break;

                    for(int i=0; i<lenTemp; i++){
                        sum += (int)temp.charAt(i) - 48;

                        if(sum > 0) break;
                    }

                    isOk = (sum > 0);

                    for(int i=2; i<=tempLimit; i++){
                        if(isOk && len - uzunluq * i >= 0){
                            //System.out.println(s.substring(len - uzunluq * i, len - uzunluq * (i - 1)));
                            isOk = temp.equals(s.substring(len - uzunluq * i, len - uzunluq * (i - 1)));
                        }
                        else{
                            isOk = false;
                            break;
                        }
                    }



                    if (isOk) {
                        //System.out.println(uzunluq + " " + limit + " " + temp + " " + len + " " + s);
                        s = s.substring(0, len - uzunluq * limit);
                        s += "(" + temp + ")";

                        flag = true;
                        break;
                    }

                    uzunluq++;
                }

                if (flag) break;
            }

            s = tam + "." + s;
            len = s.length();


            int space = 0;
            while(space < len) {
                if(space + 76 <= len) System.out.print(s.substring(space, space + 76));
                else System.out.print(s.substring(space, len));
                System.out.println();
                space += 76;
            }
        //}
    }
}
