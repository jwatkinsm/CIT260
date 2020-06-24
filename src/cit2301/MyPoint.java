package cit2301;

/**
 * UML
 * Class: MyPoint
 * Variables:
 *        -  xPoint: int
 *         - yPoint: int
 * objects:
 *         + MyPoint()
 *         + MyPoint(xPoint: int, yPoint: int)
 * Setters:
 *         + setxPoint(): int
 *         + setyPoint(): int
 * Getters:
 *          +getxPoint(): int
 *          +getyPoint(): int
 * Methods:
 *         + distance(p: mypoint): double
 *         + distance(p1: point, p2: mypoint): double
 *          +distance(xCoord: int, yCoord: int): double
 */
  public class MyPoint {
//variables
      private int xPoint;
      private int yPoint;
//objects
    public MyPoint() {
        }
    public MyPoint(int xPoint, int yPoint) {
            this.xPoint = xPoint;
            this.yPoint = yPoint;
        }
        //methods
       //A member method named distance that calculates and returns the distance between this MyPoint object
        // and another point that is specified by its x- and y-coordinates.
      public double distance( int xCoord, int yCoord){
          yPoint= yCoord;
          xPoint= xCoord;
          return Math.sqrt((-xCoord) * (-xCoord) + (-yCoord) * (-yCoord));
      }
      //Returns the distance from this point to another point.
        public double distance(MyPoint p){
        return distance(this, p);
        }
        //Returns the distance between two points.
        public static double distance(MyPoint p1, MyPoint p2) {
            return Math.sqrt((p1.xPoint - p2.xPoint) * (p1.xPoint- p2.xPoint) +
                    (p1.yPoint- p2.yPoint) * (p1.yPoint- p2.yPoint));
        }
        //set and get xPoint
      public int getxPoint() {
          return xPoint;
      }
      public void setxPoint(int xPoint) {
          this.xPoint = xPoint;
      }
        //set and get yPoint
      public int getyPoint() {
          return yPoint;
      }
      public void setyPoint(int yPoint) {
          this.yPoint = yPoint;
      }

    }

