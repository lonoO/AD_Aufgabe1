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


        double abstand = A.distanceTo(B);
        System.out.println("Abstand:" + abstand);

        boolean gleich = A.equalTo(B);
        System.out.println("Gleich:"+ gleich);

        //Gleichheitsprüfung
        if(A.equalTo(B)||A.equalTo(C)||B.equalTo(C)){
            System.out.println("Fehler: Mindestens zwei Punkte sind gleich!");
            return;
        }
        scanner.close();





        }
    }
