/**
 * Modul: Algorithmen und Datenstrukturen im SoSe 2025
 * Gruppe <NR>
 * Praktikum 1
 * Datum: <AbgabeDatum>
 * Version <z.B. 0.1>
 * Klasse "Circle" zur Darstellung eines Kreises durch den Mittelpunkt (x|y) und den Radius r.
 * @author De Terminante, Beta, 11012345
 * @author Bo, Harry, 11012346
 */

/** Klasse KREIS
 *
 */
class Circle {
    private Point middle;
    private double radius;


    public Circle(Point middle, double radius) {
        this.middle = middle;
        this.radius = radius;

    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double r){this.radius = r;}

    public Line intersects(Circle pc) {

        Point m1 = this.middle;
        Point m2 = pc.middle;
        double r1 = this.radius;
        double r2 = pc.radius;

        double dx = m2.getX() - m1.getX();
        double dy = m2.getY() - m1.getY();
        double d = Math.sqrt((dx*dx + dy*dy));

        //Prüfung ob Kreise sich schneiden
        if(d > r1+r2 || d < Math.abs(r1-r2)){ return null;} //Keine Schnittpunkte

    }



    public String toString() {}
}

/** Klasse LINIE
 *
 */
class Line {
    private double A, B, C;


    public Line(Point p1, Point p2) {

    }

    private void normalize() {

    }

    public Point meets(Line that) {

    }

    public double getA() {
        return this.A;
    }

    public double getB() {
        return this.B;
    }

    public double getC() {
        return this.C;
    }

    @Override
    public String toString() {
        return "Kreis(Mittelpunkt: " + middle + ", Radius: " + radius + ")";
    }


}