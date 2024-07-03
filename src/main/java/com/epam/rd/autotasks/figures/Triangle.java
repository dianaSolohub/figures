package com.epam.rd.autotasks.figures;

class Triangle extends Figure{
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double ab = length(a, b);
        double ac = length(a, c);
        double bc = length(b, c);

        double p = (ab + bc + ac)/2;
        return Math.sqrt(p*(p - ab)*(p - bc)*(p - ac));
    }
    private double length(Point a, Point b) {
        return Math.sqrt(Math.pow((b.getX() - a.getX()),2) +
                Math.pow((b.getY() - a.getY()),2));
    }
    @Override
    public String pointsToString() {
        return "("+ a.getX() + "," + a.getY()+ ")(" +
                b.getX() +","+ b.getY() + ")("+ c.getX() + "," + c.getY() +")";
    }


    @Override
    public String toString() {
        return "Triangle[" +
                "("+ a.getX() + "," + a.getY()+ ")(" +
                b.getX() +","+ b.getY() + ")("
                + c.getX() + "," + c.getY() +")" + "]";
    }

    @Override
    public Point leftmostPoint() {
        if (a.getX() <= b.getX() && a.getX() <= c.getX()){
            return a;
        }else if (b.getX() <= c.getX() && b.getX() <= a.getX()){
            return b;
        }else {
            return c;
        }
    }
}
