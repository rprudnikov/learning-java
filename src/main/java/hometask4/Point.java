package hometask4;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int calculateDistanceTo(Point p) {
        int distanceX = this.x - p.x;
        int distanceY = this.y - p.y;
        return (int) Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }
}

