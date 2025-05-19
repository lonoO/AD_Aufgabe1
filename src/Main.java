/**
 * Modul: Algorithmen und Datenstrukturen im SoSe 2025
 * Gruppe <NR>
 * Praktikum 1
 * Datum: 04.05.2035
 * Version 1.0
 * Klasse "Circle" zur Darstellung eines Kreises durch den Mittelpunkt (x|y) und den Radius r.

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gebe Punkt 1 (x/y) an:");
        double ax = scanner.nextDouble();
        double ay = scanner.nextDouble();
        Point A = new Point(ax, ay);

        System.out.print("Gebe Punkt 2 (x/y) an:");
        double bx = scanner.nextDouble();
        double by = scanner.nextDouble();
        Point B = new Point(bx, by);

        System.out.print("Gebe Punkt 3 (x/y) an:");
        double cx = scanner.nextDouble();
        double cy = scanner.nextDouble();
        Point C = new Point(bx, by);

        System.out.println("A:"+A);
        System.out.println("B:"+C);
        System.out.println("C"+C);

        //Berechnung Distanz
        double abstand = A.distanceTo(B);
        System.out.println("Abstand:" + abstand);

        //Gleichheitsprüfung
        if(A.equalTo(B)||A.equalTo(C)||B.equalTo(C)){
            System.out.println("Fehler: Mindestens zwei Punkte sind gleich!");
            return;
        }

        //Hilfskreise erzeugen K1-K3
        Circle K1 = new Circle(A, A.distanceTo(B));
        Circle K2 = new Circle(B, B.distanceTo(C));
        Circle K3 = new Circle(C, C.distanceTo(A));

        //Schnittlinien dieser Kreise Berechnen
        Line l1 = K1.intersects(K2);  // Linie durch Schnittpunkte von K1 und K2
        Line l2 = K2.intersects(K3);  // Linie durch Schnittpunkte von K2 und K3

        //Prüfen, ob Linien parallel sind
        if (l1 == null || l2 == null) {
            System.out.println("Fehler: Hilfskreise schneiden sich nicht. Abbruch!");
            return;
        }

        //Mittelpunkt des gesuchten Kreises Berechnen
        Point mittelpunkt = l1.meets(l2);
        if (mittelpunkt == null) {
            System.out.println("Fehler: Schnittlinien sind parallel. Abbruch!");
            return;
        }

        //Radius berechnen
        double radius = mittelpunkt.distanceTo(A);

        //Ausgabe
        System.out.println("Gesuchter Kreis:");
        System.out.println("Mittelpunkt: " + mittelpunkt);
        System.out.println("Radius: " + radius);

        scanner.close();





        }
    }
