public class Point {
  
    //Declare some instance fields
    private double x;
    private double y;
    public String name; 


    // Declare a constructor to make a new instance for the class
    //Constructors always have the same name as the class

    public Point () {

        x = 0;
        y = 0;
        name = "O";
    }


    public Point (double a, double b) { //local scope 
        if (a < 0) {
            //throw new Illegal Argument Exception ("x values cannot be negative");
            //x = 0;
        }
        else {
            x = a; 
        }

        if (b < 0) {
            y = 0;
        }
        else {
            y = b;
        }
        x = a;
        y = b; 
        name = "No Name Given.";

    }

    public Point (double a, double b, String name) {

       if (a < 0) {
            //throw new Illegal Argument Exception ("x values cannot be negative");
            //x = 0;
        }
        else {
            x = a; 
        }

        if (b < 0) {
            y = 0;
        }
        else {
            y = b;
        }
        this.name  = name;
    }

    //Write some accessor methods
    public double getx() {
        return x; 

    }

    public double gety() {
        return y;
    }

    //Write modifier methods
    public void setx(double a) {
        if (a >= 0) {
            x = a;
        }
    }
    

    /**
    * Calculates and returns this point's distance from the origin (0,0)
    * @return the Distance from (0,0) as a real number. 
    */ 

    public double distanceFromOrigin() {

        return Math.sqrt(x*x + y*y); 
    }


    public static double distanceTo(Point a, Point b) { 
    
        double deltaX = a.getx() - b.getx(); 
        double deltaY = b.gety() - a.gety(); 

        return Math.sqrt(deltaX*deltaX + deltaY * deltaY); 

    }


    public double distanceTo(Point o) { //called using the instance 

        double deltaX = x - o.x;

        double deltaY  = y - o.y; 

        return Math.sqrt(deltaX*deltaX + deltaY * deltaY); 
    }

    public String toString() { 

        return name + ": (" +  this.x + " , " + this.y + ")";

    }


}