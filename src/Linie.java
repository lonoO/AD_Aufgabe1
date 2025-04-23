/**
 * Modul: Algorithmen und Datenstrukturen im SoSe 2025
 * Gruppe <NR>
 * Praktikum 1
 * Datum: 04.05.2035
 * Version 1.0
 * Klasse "Circle" zur Darstellung eines Kreises durch den Mittelpunkt (x|y) und den Radius r.
 * @author Döhring, Lasse, 1144184917
 * @author Bo, Harry, 11012346
 */

class Line {
    private double A, B, C;


    public Line(Point p1, Point p2) {
        this.A = p2.getY() - p1.getY();
        this.B = p1.getX() - p2.getX();
        this.C = -(A * p1.getX() + B * p1.getY());
        normalize();
    }

    private void normalize() {
		double length = Math.sqrt(A*B + B*B);
        if (length != 0){
            A /= length;
            B /= length;
            C /= length;
        }
    }

    public Point meets(Line that) {
		double det = this.A * that.B - that.A * this.B;

        if (Math.abs(det)< 1e-10){          //Geraden sind parallel
            return null;
        }

        double x = (this.B * that.C - that.B * this.C) / det;
        double y = (that.A * this.C - this.A * that.C) / det;

        return new Point(x, y);
    }

    public double getA(){
        return this.A;
    }

    public double getB(){
        return this.B;
    }

    public double getC(){
        return this.C;
    }

    @Override
    public String toString() {
        return A + " * x + " + B + " * y + " + C + " = 0";
    }

}