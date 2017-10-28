import static java.lang.StrictMath.sqrt;
import static java.lang.System.out;

public class Segment {

   public Segment(Point A, Point B){
      pointA = A;
      pointB = B;
   }

   public Point getPointA(){
      return pointA;
   }

   public Point getPointB(){
      return pointB;
   }

   public void setPointA(Point p){
      pointA = p;
   }

   public void setPointB(Point p){
      pointB = p;
   }

   public void affiche(){
      out.printf("(A: ");
      pointA.affiche();
      out.printf(") B: ");
      pointB.affiche();
      out.println(")");
   }

   public double calculerLongueur(){

      int longeurVerticale = pointB.getY()-pointA.getY(); //TODO: ajouter absolue
      int longeurHorizontale = pointB.getX()-pointA.getX(); //TODO: ajouter absolue

      if(pointA.getY() == pointB.getY()) //ligne verticale
         return longeurVerticale;

      if(pointA.getX() == pointB.getX()) //ligne horizontale
         return longeurHorizontale;

      return sqrt(longeurHorizontale * longeurHorizontale + longeurVerticale * longeurVerticale);
   }

   public boolean estSurSegment(Point p){
      if()
      return false;
   }


   public void echanger(Segment s){

   }

   public static void echangerStatic(Segment s1, Segment s2){

   }



   private Point pointA,
                 pointB;
}
