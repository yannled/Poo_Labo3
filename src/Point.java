/*
 -----------------------------------------------------------------------------------
 Laboratoire : 03
 Fichier     : Point.java
 Auteur(s)   : David Jaquet & Yann Lederrey
 Date        : 26.10.2017

 But         : La class Point à pour but de modéliser des points et offre
               l'interface suivante:
               - constructions à partir d'une coordonée, de deux, d'un autre point
                 ou à partir de rien.
               - modifications des coordonées du point
               - récupération des coordonées du point
               - affichage
               - fonction ToString
               - Echange des coordonées du point.

 Remarque(s) : - Les coordonnées des points sont entières

 Compilateur : jdk1.8.0_144
 -----------------------------------------------------------------------------------
*/

public class Point {

   public Point(){
      x = 0;
      y = 0;
   }

   public Point(int valeurX, int valeurY){
      x = valeurX;
      y = valeurY;
   }

   public Point(int valeurX){
      this(valeurX,0);
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