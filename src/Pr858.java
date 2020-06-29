import java.util.Scanner;

public class Pr858 {
    int [] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Pr858 a = new Pr858();
        a.calc();
    }

    public boolean leap(int year){
        if(year % 400 == 0){
            return true;
        }
        else if(year % 4 == 0 && year % 100 != 0){
            return true;
        }

        return false;
    }

    public int calc(){
        Scanner in = new Scanner(System.in);
        int birthDay, birthMonth, curDay, curMonth, curYear, cnt = 0;
        birthDay = in.nextInt();
        birthMonth = in.nextInt();
        curDay = in.nextInt();
        curMonth = in.nextInt();
        curYear = in.nextInt();


        if(leap(curYear)){
            month[2]++;
        }

        if(curMonth < birthMonth){
            //cout<<1/0<<endl;
            cnt += month[curMonth] - curDay;
            curMonth++;
            while(curMonth < birthMonth){
                cnt += month[curMonth];
                curMonth++;
            }
            cnt += birthDay;
        }
        else if(curMonth == birthMonth && curDay <= birthDay){
            //cout<<1/0<<endl;
            cnt = birthDay - curDay;
        }
        else{
            //cout<<1/0<<endl;
            cnt += month[curMonth] - curDay;
            curMonth++;
            while(curMonth <= 12){
                cnt += month[curMonth];
                curMonth++;
            }

            curMonth = 1;
            curDay = 1;

            while(curMonth < birthMonth){
                cnt += month[curMonth];
                curMonth++;
            }
            cnt += birthDay;
        }

        return cnt;
    }
}