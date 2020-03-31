package academy.learnprogramming;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this. y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt((0-x)*(0-x) + (0-y)*(0-y));
    }

    public double distance(int a, int b) {
        return Math.sqrt((a-x)*(a-x) + (b-y)*(b-y));
    }

    public double distance(Point point) {
        return Math.sqrt((point.getX()-x)*(point.getX()-x) + (point.getY()-y)*(point.getY()-y));
    }


}
