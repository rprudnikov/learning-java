package hometask4;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private int getAB() {
        return a.calculateDistanceTo(b);
    }

    private int getBC() {
        return b.calculateDistanceTo(c);
    }

    private int getCA() {
        return c.calculateDistanceTo(a);
    }

    public int calculatePerimeter() {     //периметр
        return getAB() + getBC() + getCA();
    }

    public int calculateSquare() {    //площадь
        float halfPerim = calculatePerimeter() / 2;
        return (int) Math.sqrt(calculatePerimeter() * (halfPerim - getAB()) * (halfPerim - getBC()) * (halfPerim - getCA()));
    }

    private boolean isEquilateral() {   //равнобедренный
        return (getAB() == getBC() || getBC() == getCA() || getCA() == getAB());
    }

    private boolean isIsosceles() {     //равносторонний
        return (getAB() == getBC() && getBC() == getCA());
    }

    private boolean isRightAngled() {   //прямоугольный
        int sqAB = getAB() * getAB();
        int sqBC = getBC() * getBC();
        int sqCA = getCA() * getCA();

        boolean isSide1 = sqAB == sqBC + sqCA;
        boolean isSide2 = sqBC == sqAB + sqCA;
        boolean isSide3 = sqCA == sqAB + sqBC;
        return (isSide1 || isSide2 || isSide3);
    }

    public int getTriangleType() {
        if (isIsosceles()) {
            return 2;
        } else if (isEquilateral()) {
            return 1;
        } else if (isRightAngled()) {
            return 3;
        } else return 4;
    }
    public String getTriangleInfo(){
 return String.format("[a(%d;%d) b(%d;%d) c(%d;%d)]",a.x,a.y,b.x,b.y,c.x,c.y);
    }
}