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

      //TODO: C'est l'inverse, non ? si A.y == B.y => ligne horizontal
      if(pointA.getY() == pointB.getY()) //ligne verticale
         return (double)longeurVerticale;

      if(pointA.getX() == pointB.getX()) //ligne horizontale
         return (double)longeurHorizontale;

      return Math.sqrt(longeurHorizontale * longeurHorizontale + longeurVerticale * longeurVerticale);
   }

   public boolean estSurSegment(Point p){
      //if()
      return false;
   }


   public void echanger(Segment s){

   }

   public static void echangerStatic(Segment s1, Segment s2){

   }

   private Point pointA,
                 pointB;
}
