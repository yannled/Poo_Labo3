/*
 -----------------------------------------------------------------------------------
 Laboratoire : 03
 Fichier     : Segment.java
 Auteur(s)   : David Jaquet & Yann Lederrey
 Date        : 26.10.2017

 But         : <à compléter>

 Remarque(s) : - Les coordonnées des points sont entières

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
*/



public class Segment {

   // Si on ne donne pas de paramètre au segment, il aura une taille nulle
   public Segment(){
      pointA = new Point();
      pointB = new Point();
   }

   // Les 2 points auront la même coordonnée
   public Segment(Point p){
      pointA = new Point(p);
      pointB = new Point(p);
   }

   public Segment(Point A, Point B){
      pointA = new Point(A);
      pointB = new Point(B);
   }

   public Segment(int posAX, int posAY, int posBX, int posBY){
      pointA = new Point(posAX, posAY);
      pointB = new Point(posBX, posBY);
   }

   public Segment(Segment segmentACopier){
      pointA = new Point(segmentACopier.pointA);
      pointB = new Point(segmentACopier.pointB);
   }

   public Point getPointA(){
      return pointA;
   }

   public Point getPointB(){
      return pointB;
   }

   public void setPointA(Point p){
      pointA.setX(p.getX());
      pointA.setY(p.getY());
   }

   public void setPointB(Point p){
      pointB.setX(p.getX());
      pointB.setY(p.getY());
   }

   public void affiche(){
      System.out.printf("[");
      pointA.affiche();
      System.out.printf("];[");
      pointB.affiche();
      System.out.println("]");
   }

   public double calculerLongueur(){
      int longeurVerticale   = Math.abs(pointB.getY() - pointA.getY());
      int longeurHorizontale = Math.abs(pointB.getX() - pointA.getX());

      if(pointA.getY() == pointB.getY()) //ligne horizontale
         return (double)longeurHorizontale;

      if(pointA.getX() == pointB.getX()) //ligne verticale
         return (double)longeurVerticale;

      return Math.sqrt(longeurHorizontale * longeurHorizontale + longeurVerticale * longeurVerticale);
   }

   public boolean estSurSegment(Point p){
      //if()
      return false;
   }


   //échange par valeurs
   public void echanger(Segment s){
      s.pointA.echanger(pointA);
      s.pointB.echanger(pointB);
   }

   public static void echangerStatic(Segment s1, Segment s2){
      s1.pointA.echanger(s2.pointA);
      s1.pointB.echanger(s2.pointB);
   }

   private Point pointA,
                 pointB;
}
