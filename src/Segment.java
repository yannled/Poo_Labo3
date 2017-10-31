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

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.sqrt;
import static java.lang.System.out;


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

   // posX et posY seront les coordonnée du point B
   public Segment(Point A, int posX, int posY){
      pointA = new Point(A);
      pointB = new Point(posX, posY);
   }

   //TODO: delete ?
   public Segment(int posX, int posY, Point B){
      pointA = new Point(posX, posY);
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
      out.printf("[");
      pointA.affiche();
      out.printf("];[");
      pointB.affiche();
      out.println("]");
   }

   public double calculerLongueur(){

      int longeurVerticale   = abs(pointB.getY() - pointA.getY()); //TODO: tester abs
      int longeurHorizontale = abs(pointB.getX() - pointA.getX()); //TODO: tester abs

      //TODO: C'est l'inverse, non ? si A.y == B.y => ligne horizontal
      if(pointA.getY() == pointB.getY()) //ligne verticale
         return (double)longeurVerticale;

      if(pointA.getX() == pointB.getX()) //ligne horizontale
         return (double)longeurHorizontale;

      return sqrt(longeurHorizontale * longeurHorizontale + longeurVerticale * longeurVerticale);
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
