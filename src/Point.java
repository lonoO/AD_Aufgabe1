/**
 * Modul: Algorithmen und Datenstrukturen im SoSe 2025
 * Gruppe <NR>
 * Praktikum 1
 * Datum: 04.05.2035
 * Version 1.0
 * Klasse "Circle" zur Darstellung eines Kreises durch den Mittelpunkt (x|y) und den Radius r.

 */

class Point {
    private double x;
    private double y;

    private double distance;  // speichert das letzte Ergebnis von distanceTo
    private boolean equal;    // speichert das letzte Ergebnis von equalTo

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter und Setter für x und y
    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    /**
     * Vergleicht diesen Punkt mit einem anderen Punkt.
     * Speichert das Ergebnis in 'equal'.
     */
    public boolean equalTo(Point p) {
        double epsilon = 1e-10;
        return (Math.abs(this.x - p.getX()) < epsilon && Math.abs(this.y - p.getY()) < epsilon);

    }

    /**
     * Berechnet den Abstand zu einem anderen Punkt.
     * Speichert das Ergebnis in 'distance'.
     */
    public double distanceTo(Point p) {
        double dx = this.x - p.getX();
        double dy = this.y - p.getY();
        return Math.sqrt(dx * dx + dy * dy);

    }


}
