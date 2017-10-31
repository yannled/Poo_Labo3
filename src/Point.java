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

   public Point(int valueX){
      x = valueX;
      y = 0;
   }

   public Point(int valueX, int valueY){
      this.x = valueX;
      this.y = valueY;
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

   public void setX(int value){
      x = value;
   }

   public void setY(int value){
      y = value;
   }

   public void affiche(){
      System.out.printf("(%d, %d)",x,y);
   }

   public void echanger(Point p){
      int tempX = p.x;
      int tempY = p.y;
      p.x = x;
      p.y = y;
      x = tempX;
      y = tempY;
   }

   private int x,
               y;
}