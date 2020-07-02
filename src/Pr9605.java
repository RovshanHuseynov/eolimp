import java.util.Scanner;

public class Pr9605 {
    public static void main(String[] args) {
        Pr9605 a = new Pr9605();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int lenK = in.nextInt();
        int [] kk = new int[lenK];
        for(int i=0; i<lenK; i++){
            kk[i] = in.nextInt();
        }
        int lenL = in.nextInt();
        int [] ll = new int[lenL];
        for(int i=0; i<lenL; i++){
            ll[i] = in.nextInt();
        }
        int lenM = in.nextInt();
        int [] mm = new int[lenM];
        for(int i=0; i<lenM; i++){
            mm[i] = in.nextInt();
        }

        int k=0, l=0, m=0, cnt=0;

        while (true){
            if(k < lenK && l < lenL && m < lenM && kk[k] <= ll[l] && kk[k] <= mm[m]){
                System.out.print(kk[k++]);
            }
            else if(k < lenK && l < lenL && m < lenM && ll[l] <= kk[k] && ll[l] <= mm[m]){
                System.out.print(ll[l++]);
            }
            else if(k < lenK && l < lenL && m < lenM && mm[m] <= kk[k] && mm[m] <= ll[l]){
                System.out.print(mm[m++]);
            }
            else if(l < lenL && m < lenM && ll[l] <= mm[m]){
                System.out.print(ll[l++]);
            }
            else if(l < lenL && m < lenM && mm[m] < ll[l]){
                System.out.print(mm[m++]);
            }
            else if(k < lenK && m < lenM && mm[m] <= kk[k]){
                System.out.print(mm[m++]);
            }
            else if(k < lenK && m < lenM && kk[k] < mm[k]){
                System.out.print(kk[k++]);
            }
            else if(k < lenK && l < lenL && ll[l] <= kk[k]){
                System.out.print(ll[l++]);
            }
            else if(k < lenK && l < lenL && kk[k] < ll[l]){
                System.out.print(kk[k++]);
            }
            else if(k < lenK){
                System.out.print(kk[k++]);
            }
            else if(l < lenL){
                System.out.print(ll[l++]);
            }
            else if(m < lenM){
                System.out.print(mm[m++]);
            }


            cnt++;
            if(cnt == lenK + lenL + lenM) {
                System.out.println();
                break;
            }
            else {
                System.out.print(" ");
            }
        }
    }
}
