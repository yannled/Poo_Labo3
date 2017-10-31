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

//TODO: Expliquer notre choix dans Segment.java ou dans feuille labo de faire des échanges de valeurs et pas de référence.

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
      Segment s5 = new Segment(10, 11 ,12, 13);
      Segment s6 = new Segment(s2);

      //TODO: faire un test d'échange de Point.
      System.out.println("TEST DES ECHANGES DE SEGMENTS : ");

      System.out.println("Point s2: ");
      s2.affiche();
      System.out.println("Point s5: ");
      s5.affiche();
      System.out.println("Echange de s2 et s5: ");

      s2.echanger(s5);

      System.out.println("Point s2: ");
      s2.affiche();
      System.out.println("Point s5: ");
      s5.affiche();

      System.out.println("Re-echange de s2 et s5: ");

      Segment.echangerStatic(s5,s2);

      System.out.println("Point s2: ");
      s2.affiche();
      System.out.println("Point s5: ");
      s5.affiche();

      System.out.println("TEST DES CALCUL DE LONGEUR : ");
      Segment segmentNull = new Segment();
      double longueurSegmentNull = segmentNull.calculerLongueur();
      System.out.printf("Pour un segement de coordonées A et B (0,0) la longeur est de %f\n", longueurSegmentNull);

      Segment segmentVertical = new Segment(1,1,1,16);
      double longueurSegmentVertical = segmentVertical.calculerLongueur();
      System.out.printf("Pour un segement vertical la longeur verticale est de %f\n", longueurSegmentVertical);

      Segment segmentHorizontal = new Segment(1,1,16,1);
      double longueurSegmentHorizontal = segmentHorizontal.calculerLongueur();
      System.out.printf("Pour un segement vertical la longeur horizontale est de %f\n", longueurSegmentHorizontal);

      double longeurS5 = s5.calculerLongueur();
      System.out.printf("Pour un segement simple la longeur est de %f\n", longeurS5);

      Segment inverseS5 = new Segment(12,13,10,11);
      double longeurInverseS5 = inverseS5.calculerLongueur();
      System.out.printf("Pour un segement inverse du précédent la longeur est de %f\n", longeurInverseS5);

   }
}