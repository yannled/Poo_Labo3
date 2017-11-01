/*
 -----------------------------------------------------------------------------------
 Laboratoire : 03
 Fichier     : Main.java
 Auteur(s)   : David Jaquet & Yann Lederrey
 Date        : 26.10.2017

 But         : Ce laboratoire a pour but de modéliser des Point et
               des Segment dans le Plan à travers deux classes
			   respectivement Point.java et Segment.Java.


 Remarque(s) : - Les coordonnées des points sont entières

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
*/

public class Main {

   public static void main(String[] args) {

      Point p1     = new Point(),
            p2     = new Point(1),
            p3     = new Point(2, 3),
            p3_bis = new Point(p3);

      Segment sNull       = new Segment(),
              sVertical   = new Segment(1,1,1,16),
              sHorizontal = new Segment(1,1,16,1),
              s1          = new Segment(10, 11 ,13, 14),
              s1Inverse   = new Segment(s1.getPointB(), s1.getPointA()),
              s2          = new Segment(p1, p2),
              s2_bis      = new Segment(s2),
              s3          = new Segment(p3);

      System.out.println("TEST DES CONSTRUCTEURS, GET, SET");

      System.out.print(" - Point p1: ");
      System.out.println("coordonee X = " + p1.getX() + ", coordonee Y = " + p1.getY());
//      System.out.printf("coordonee X = %d, coordonee Y = %d\n", p1.getX(), p1.getY());
      System.out.println(" - Point p2: " + p2.toString());
      System.out.print(" - Point p3: ");
      p3.affiche();

      System.out.print("\n - Point p3_bis apres Set : ");
      p3_bis.setX(11);
      p3_bis.setY(12);

      p3_bis.affiche();

//      System.out.printf("\n - Segment s2: " + s2.getPointA().toString() + s2.getPointB().toString());
      System.out.println("\n - Segment s2: " + s2.toString());

      System.out.print(" - Segment s2_bis apres Set : ");
      s2_bis.setPointA(p2);
      s2_bis.setPointB(p1);

      s2_bis.affiche();
      
      System.out.print("\n - Segment s3: ");
      s3.affiche();

      System.out.println("\n\nTEST DES ECHANGES DE POINTS : ");

      System.out.print(" - Point p2: ");
      p2.affiche();
      System.out.print("\n - Point p3: ");
      p3.affiche();
      System.out.println("\nEchange de p2 et p3.");

      p2.echanger(p3);

      System.out.print(" - Point p2: ");
      p2.affiche();
      System.out.print("\n - Point p3: ");
      p3.affiche();


      System.out.println("\n\nTEST DES ECHANGES DE SEGMENTS : ");

      System.out.print(" - Segment s1: ");
      s1.affiche();
      System.out.print("\n - Segment s2: ");
      s2.affiche();
      System.out.println("\nEchange de s2 et s1.");

      s2.echanger(s1);

      System.out.print(" - Segment s2: ");
      s2.affiche();
      System.out.print("\n - Segment s1: ");
      s1.affiche();

      System.out.println("\n Re-echange (Static) de s2 et s1.");

      Segment.echangerStatic(s1,s2);

      System.out.print(" - Segment s2: ");
      s2.affiche();
      System.out.print("\n - Segment s1: ");
      s1.affiche();

      System.out.println("\n\nTEST DES CALCUL DE LONGUEUR :");

      double longueur = sNull.calculerLongueur();
      System.out.println("Pour un segement de coordonees A et B (0,0) la longeur est de " + longueur);

      longueur = sVertical.calculerLongueur();
      System.out.println("Pour un segement vertical : " + sVertical.toString() +
                         " la longeur est de " + longueur);

      longueur = sHorizontal.calculerLongueur();
      System.out.println("Pour un segement horizonal : " + sHorizontal.toString() +
                         " la longeur est de " + longueur);

      longueur = s1.calculerLongueur();
      System.out.println("Pour un segement simple : " + s1.toString() +
                         " la longeur est de " + longueur);

      longueur = s1Inverse.calculerLongueur();
      System.out.println("Pour un segement inverse du precedent : " + s1Inverse.toString() +
                         " la longeur est de " + longueur);



      System.out.println("\nTEST DES EST SUR SEGMENT :");

      System.out.println("Le point " + p1.toString() + " est-il sur le segment " +
                         sNull.toString() + " : " + sNull.estSurSegment(p1));

      System.out.println("Le point " + p2.toString() + " est-il sur le segment " +
                         s1.toString() + " : " + s1.estSurSegment(p2));

      System.out.println("Le point " + p3_bis.toString() + " est-il sur le segment " +
                         s1.toString() + " : " + s1.estSurSegment(p3_bis));
   }
}