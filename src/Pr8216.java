import java.util.Scanner;

public class Pr8216 {
    public static void main(String[] args) {
        Pr8216 a = new Pr8216();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        String [] a = new String[n];
        int goUp;
        for(int i=0; i<n; i++){
            a[i] = in.nextLine();
        }

        for(int i=n-1; i>0; i--){
            for(int j=0; j<m; j++){
                if(a[i].charAt(j) == '.'){
                    goUp = i-1;
                    while(goUp >= 0){
                        if(a[goUp].charAt(j) == '.'){
                            goUp--;
                        }
                        else if(a[goUp].charAt(j) == 'o'){
                            a[i] = a[i].substring(0,j) + 'o' + a[i].substring(j+1, m);
                            a[goUp] = a[goUp].substring(0,j) + '.' + a[goUp].substring(j+1, m);
                            break;
                        }
                        else if(a[goUp].charAt(j) == '#') {
                            break;
                        }
                    }
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}
