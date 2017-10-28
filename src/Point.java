import static java.lang.System.out;

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
      out.printf(" {%d, %d}",x,y);
   }

   public void echanger(){
      int temp = x;
      x = y;
      y = temp;
   }

   private int x,
               y;
}
