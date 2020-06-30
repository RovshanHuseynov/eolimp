import java.util.Scanner;

public class Pr7504 {
    public static void main(String[] args) {
        Pr7504 a = new Pr7504();
        a.calc();
    }

    public void calc() {
        Scanner in = new Scanner(System.in);
        Rectangle r1 = new Rectangle(new Point(in.nextInt(), in.nextInt()),
                new Point(in.nextInt(), in.nextInt()));

    }
}

class Rectangle {
    Point a;
    Point b;

    public Rectangle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}