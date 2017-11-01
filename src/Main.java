/*
 -----------------------------------------------------------------------------------
 Laboratoire : 03
 Fichier     : Main.java
 Auteur(s)   : David Jaquet & Yann Lederrey
 Date        : 26.10.2017

 But         : Ce laboratoire a pour but de modéliser des Point et des Segment dans le Plan
               a travers deux classes respectivement Point.java et Segment.Java.


 Remarque(s) : - Les coordonnées des points sont entières

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
*/

//TODO: Expliquer notre choix dans Segment.java ou dans feuille labo de faire des echanges de valeurs et pas de reference.

public class Main {

   public static void main(String[] args) {

      Point p1 = new Point();
      Point p2 = new Point(1);
      Point p3 = new Point(2, 3);
      Point p3_bis = new Point(p3);

      Segment sNull = new Segment();
      Segment sVertical = new Segment(1,1,1,16);
      Segment sHorizontal = new Segment(1,1,16,1);
      Segment s1 = new Segment(10, 11 ,13, 14);
      Segment s1Inverse = new Segment(s1.getPointB(), s1.getPointA());
      Segment s2 = new Segment(p1, p2);
      Segment s2_bis = new Segment(s2);

      System.out.printf("TEST DES CONSTRUCTEURS, GET, SET ");

      System.out.printf("\n - Point p1: ");
      System.out.printf("coordonee X = %d, coordonee Y = %d", p1.getX(), p1.getY());
      System.out.printf("\n - Point p2: " + p2.toString());
      System.out.printf("\n - Point p3: ");
      p3.affiche();

      System.out.printf("\n - Point p3_bis apres Set : ");
      p3_bis.setX(11);
      p3_bis.setY(12);

      p3_bis.affiche();

      System.out.printf("\n - Segment s2: " + s2.getPointA().toString() + s2.getPointB().toString());

      System.out.printf("\n - Segment s2_bis apres Set : ");
      s2_bis.setPointA(p2);
      s2_bis.setPointB(p1);

      s2_bis.affiche();

      System.out.printf("\n\nTEST DES ECHANGES DE POINTS : ");

      System.out.printf("\n - Point p2: ");
      p2.affiche();
      System.out.printf("\n - Point p3: ");
      p3.affiche();
      System.out.printf("\nEchange de p2 et p3. ");

      p2.echanger(p3);

      System.out.printf("\n - Point p2: ");
      p2.affiche();
      System.out.printf("\n - Point p3: ");
      p3.affiche();


      System.out.printf("\n\nTEST DES ECHANGES DE SEGMENTS : ");

      System.out.printf("\n - Segment s2: ");
      s2.affiche();
      System.out.printf("\n - Segment s1: ");
      s1.affiche();
      System.out.printf("\nEchange de s2 et s1. ");

      s2.echanger(s1);

      System.out.printf("\n - Segment s2: ");
      s2.affiche();
      System.out.printf("\n - Segment s1: ");
      s1.affiche();

      System.out.printf("\n Re-echange (Static) de s2 et s1. ");

      Segment.echangerStatic(s1,s2);

      System.out.printf("\n - Segment s2: ");
      s2.affiche();
      System.out.printf("\n - Segment s1: ");
      s1.affiche();

      System.out.printf("\n\nTEST DES CALCUL DE LONGUEUR : ");
      
      double longueur = sNull.calculerLongueur();

      System.out.printf("\nPour un segement de coordonees A et B (0,0) la longeur est de %f ", longueur);
      
      longueur = sVertical.calculerLongueur();
      
      System.out.printf("\nPour un segement vertical : " +
                        sVertical.toString() +
                        " la longeur est de %f", longueur);
      
      longueur = sHorizontal.calculerLongueur();
      
      System.out.printf("\nPour un segement horizonal : " +
                        sHorizontal.toString() +
                        " la longeur est de %f", longueur);

      longueur = s1.calculerLongueur();
      
      System.out.printf("\nPour un segement simple : " +
                       s1.toString() +
                       " la longeur est de %f", longueur);
      
      longueur = s1Inverse.calculerLongueur();
      System.out.printf("\nPour un segement inverse du precedent : " +
                        s1Inverse.toString() +
                        " la longeur est de %f", longueur);

      System.out.printf("\n\nTEST DES EST SUR SEGMENT: ");

      boolean estSurSegment = sNull.estSurSegment(p1);
      System.out.printf("\nLe point "+ p1.toString() + " est-il sur le segment " +
                        sNull.toString() + " : %b", estSurSegment);

      estSurSegment = s1.estSurSegment(p2);
      System.out.printf("\nLe point "+ p2.toString() + " est-il sur le segment " +
                       s1.toString() + " : %b", estSurSegment);

      estSurSegment = s1.estSurSegment(p3_bis);
      System.out.printf("\nLe point "+ p3_bis.toString() + " est-il sur le segment " +
              s1.toString() + " : %b", estSurSegment);
   }
}