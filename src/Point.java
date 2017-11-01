/*
 -----------------------------------------------------------------------------------
 Laboratoire : 03
 Fichier     : Point.java
 Auteur(s)   : David Jaquet & Yann Lederrey
 Date        : 26.10.2017

 But         : <à compléter>

 Remarque(s) : - Les coordonnées des points sont entières

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
*/

public class Point {

   public Point(){
      x = 0;
      y = 0;
   }

   public Point(int valeurX){
      x = valeurX;
      y = 0;
   }

   public Point(int valeurX, int valeurY){
      x = valeurX;
      y = valeurY;
   }

   public Point(Point pointACopier){
      x = pointACopier.x;
      y = pointACopier.y;
   }

   public int getX(){
      return x;
   }

   public int getY(){
      return y;
   }

   public void setX(int valeur){
      x = valeur;
   }

   public void setY(int valeur){
      y = valeur;
   }

   public void affiche(){
      System.out.print(toString());
   }

   public String toString(){
      return "(" + x + "," + y + ")";
   }

   public void echanger(Point p){
      int tempX = p.x,
          tempY = p.y;

      p.x = x;
      p.y = y;

      x = tempX;
      y = tempY;
   }

   private int x,
               y;
}