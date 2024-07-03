package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure{
    private final Point a;
    private final Point b;
    private final Point c;
    private final Point d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double area() {
        double ab = length(a, b);
        double bc = length(b, c);
        double ac = length(a, c);

        double ad = length(a,d);
        double cd = length(c, d);

        double pABC = (ab + bc + ac)/2;
        double area1 = Math.sqrt(pABC *(pABC - ab)*(pABC - bc)*(pABC - ac));

        double pACD = (ac + ad + cd)/2;
        double area2 = Math.sqrt(pACD *(pACD - ad)*(pACD - cd)*(pACD - ac));
        return area1 + area2;
    }
    private double length(Point a, Point b) {
        return Math.sqrt(Math.pow((b.getX() - a.getX()),2) +
                Math.pow((b.getY() - a.getY()),2));
    }
    @Override
    public String pointsToString() {
        return "("+ a.getX() + "," + a.getY()+ ")(" +
                b.getX() +","+ b.getY() + ")("
                + c.getX() + "," + c.getY() +")("
                + d.getX() +"," + d.getY()+")";
    }
    @Override
    public String toString() {
        return "Quadrilateral[" +
                "("+ a.getX() + "," + a.getY()+ ")(" +
                b.getX() +","+ b.getY() + ")("
                + c.getX() + "," + c.getY() +")("
                + d.getX() +"," + d.getY()+")" +"]";
    }
    @Override
    public Point leftmostPoint() {
        if (a.getX() <= b.getX() && a.getX() <= c.getX()){
            return a;
        }else if (b.getX() <= c.getX() && b.getX() <= a.getX()){
            return b;
        }else if (c.getX() <= d.getX() && c.getX() <= b.getX()){
            return c;
        }else {
            return d;
        }
    }
}
