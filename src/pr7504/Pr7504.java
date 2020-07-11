package pr7504;

import java.util.*;

public class Pr7504 {
    public static void main(String[] args) {
        Pr7504 a = new Pr7504();
        a.calc();
    }

    public void calc() {
        Scanner in = new Scanner(System.in);
        Rectangle r1 = new Rectangle(new Point(in.nextInt(), in.nextInt()),
                new Point(in.nextInt(), in.nextInt()));

        Rectangle r2 = new Rectangle(new Point(in.nextInt(), in.nextInt()),
                new Point(in.nextInt(), in.nextInt()));

        Rectangle r3 = new Rectangle(new Point(in.nextInt(), in.nextInt()),
                new Point(in.nextInt(), in.nextInt()));

        Set<Point> points = new HashSet<Point>();

        for(int i=r1.left(); i<r1.right(); i++){
            for(int j=r1.top(); j<r1.bottom(); j++){
                points.add(new Point(i, j));
            }
        }

        for(int i=r2.left(); i<r2.right(); i++){
            for(int j=r2.top(); j<r2.bottom(); j++){
                points.add(new Point(i, j));
            }
        }

        for(int i=r3.left(); i<r3.right(); i++){
            for(int j=r3.top(); j<r3.bottom(); j++){
                points.add(new Point(i, j));
            }
        }

        System.out.println(points.size());
    }
}

class Rectangle {
    public Point p1;
    public Point p2;

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public int left(){
        return Math.min(p1.x, p2.x);
    }

    public int right(){
        return Math.max(p1.x, p2.x);
    }

    public int top(){
        return Math.min(p1.y, p2.y);
    }

    public int bottom(){
        return Math.max(p1.y, p2.y);
    }
}

class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        if(o == null) return false;
        Point that = (Point) o;
        return (that.x == this.x) && (that.y == this.y);
    }

    @Override
    public int hashCode() {
        return x << 16 + y;
    }
}