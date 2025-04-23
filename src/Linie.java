/**
 * Modul: Algorithmen und Datenstrukturen im SoSe 2025
 * Gruppe <NR>
 * Praktikum 1
 * Datum: <AbgabeDatum>
 * Version <z.B. 0.1>
 * Klasse "Line" zur Darstellung einer Gerade durch zwei Punkte (x1|y1) und (x2|y2).
 * @author De Terminante, Beta, 11012345
 * @author Bo, Harry, 11012346
 */

...

class Line {
    private double A, B, C;


    public Line(Point p1, Point p2) {
		this.A = p2.getY() - p1.getY();
        this.B = p1.getX() - p2.getX();

    }

    private void normalize() {
		...
    }

    public Point meets(Line that) {
		...
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

    public String toString() {
		...
    }
}