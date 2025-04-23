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

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public Line intersects(Circle pc) {

        Point m1 = this.middle;
        Point m2 = pc.middle;
        double r1 = this.radius;
        double r2 = pc.radius;

        double dx = m2.getX() - m1.getX();
        double dy = m2.getY() - m1.getY();
        double d = Math.sqrt((dx * dx + dy * dy));

        //Prüfung ob Kreise sich schneiden
        if (d > r1 + r2 || d < Math.abs(r1 - r2)) {
            return null;
        } //Keine Schnittpunkte

        // Schnittpunkte berechnen
        double a = (r1 * r1 - r2 * r2 + d * d) / (2 * d);
        double h = Math.sqrt(r1 * r1 - a * a);

        double px = m1.getX() + a * dx / d;
        double py = m1.getY() + a * dy / d;

        double sx1 = px + h * dy / d;
        double sy1 = py - h * dx / d;
        double sx2 = px - h * dy / d;
        double sy2 = py + h * dx / d;

        Point S1 = new Point(sx1, sy1);
        Point S2 = new Point(sx2, sy2);

        return new Line(S1, S2);
    }

    @Override
    public String toString() {
        return "Kreis(Mittelpunkt: " + middle + ", Radius: " + radius + ")";
    }

}


