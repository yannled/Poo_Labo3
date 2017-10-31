/*
 -----------------------------------------------------------------------------------
 Laboratoire : 03
 Fichier     : Main.java
 Auteur(s)   : David Jaquet & Yann Lederrey
 Date        : 26.10.2017

 But         : <à compléter>

 Remarque(s) : - Les coordonnées des points sont entières

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
*/


public class Main {

   public static void main(String[] args) {
      Point p1 = new Point();
      Point p2 = new Point(1);
      Point p3 = new Point(2, 3);
      Point p4 = new Point(p3);

      p4.setX(4);
      p4.setY(5);

      Segment s1 = new Segment();
      Segment s2 = new Segment(p1, p2);
      Segment s3 = new Segment(p3,6, 7);
      Segment s4 = new Segment(8, 9, p4);
      Segment s5 = new Segment(10, 11 ,12, 13);
      Segment s6 = new Segment(s2);



      System.out.println("Hello World!");
   }
}