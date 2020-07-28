import java.util.Scanner;

public class Pr8361 {
    public static void main(String[] args) {
        Pr8361 a = new Pr8361();
        a.calc();
    }

    public void calc(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = s.length();
        boolean [][] a = new boolean[101][101];
        int row = 50, column = 50, cnt = 0;
        a[row][column] = true;
        String direction = "right";
        boolean success = false;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == 'L'){
                switch (direction){
                    case "right":
                        direction = "up";
                        break;
                    case "left":
                        direction = "down";
                        break;
                    case "up":
                        direction = "left";
                        break;
                    case "down":
                        direction = "right";
                        break;
                }
            }
            else if(s.charAt(i) == 'R'){
                switch (direction){
                    case "right":
                        direction = "down";
                        break;
                    case "left":
                        direction = "up";
                        break;
                    case "up":
                        direction = "right";
                        break;
                    case "down":
                        direction = "left";
                        break;
                }
            }
            else if(s.charAt(i) == 'S'){
                cnt++;

                switch (direction){
                    case "right":
                        column++;
                        break;
                    case "left":
                        column--;
                        break;
                    case "up":
                        row--;
                        break;
                    case "down":
                        row++;
                        break;
                }

                if(a[row][column]){
                    success = true;
                    break;
                }
                else{
                    a[row][column] = true;
                }
            }
        }

        if(success){
            System.out.println(cnt);
        }
        else{
            System.out.println(-1);
        }
    }

    public void calc1(){
        // calc() and calc1() is the same
        // the only difference is that in calc1()
        // I used enhance switch which is not accepted by e-olymp
        // but totally okay for Intellij Idea
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = s.length();
        boolean [][] a = new boolean[101][101];
        int row = 50, column = 50, cnt = 0;
        a[row][column] = true;
        String direction = "right";
        boolean success = false;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == 'L'){
                switch (direction) {
                    case "right" -> direction = "up";
                    case "left" -> direction = "down";
                    case "up" -> direction = "left";
                    case "down" -> direction = "right";
                }
            }
            else if(s.charAt(i) == 'R'){
                switch (direction) {
                    case "right" -> direction = "down";
                    case "left" -> direction = "up";
                    case "up" -> direction = "right";
                    case "down" -> direction = "left";
                }
            }
            else if(s.charAt(i) == 'S'){
                cnt++;
                switch (direction) {
                    case "right" -> column++;
                    case "left" -> column--;
                    case "up" -> row--;
                    case "down" -> row++;
                }

                if(a[row][column]){
                    success = true;
                    break;
                }
                else{
                    a[row][column] = true;
                }
            }
        }

        if(success){
            System.out.println(cnt);
        }
        else{
            System.out.println(-1);
        }
    }
}
