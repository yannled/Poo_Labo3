package com.company;

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

   }

   public double calculerLongueur(){
      return 0.0;
   }

   public boolean estSurSegment(Point p){
      return false;
   }

   public void echanger(Segment s){

   }

   public static void echangerStatic(Segment s1, Segment s2){

   }



   private Point pointA,
                 pointB;
}
