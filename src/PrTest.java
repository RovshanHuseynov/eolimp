public class PrTest {
    public static void main(String[] args) {
        Testt a = new Testt();
        a.calc();
    }
}

class Testt {
    public void calc(){
        for(int n=500; n<=1000; n++){

            doo:
            for(int a=1; a<=9; a++){
                if(a*a*a == n) { System.out.println(n + " " + a); break doo; }
                for(int b=1; b<=9; b++){
                    if(a*a*a + b*b*b == n) { System.out.println(n + " " + a + b); break doo; }
                    for(int c=1; c<=9; c++){
                        if(a*a*a + b*b*b + c*c*c== n) { System.out.println(n + " " + a + b+ c); break doo; }
                        for(int d=1; d<=9; d++){
                            if(a*a*a + b*b*b + c*c*c + d*d*d == n) { System.out.println(n + " " + a + b + c + d); break doo; }
                            for(int e=1; e<=9; e++){
                                if(a*a*a + b*b*b + c*c*c + d*d*d + e*e*e == n) { System.out.println(n + " " + a + b + c + d + e); break doo; }
                                for(int f=1; f<=9; f++){
                                    if(a*a*a + b*b*b + c*c*c + d*d*d + e*e*e + f*f*f == n) { System.out.println(n + " " +a + b + c + d + e + f); break doo; }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
