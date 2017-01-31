public class Circle {

    //fields

    private Point center;
    private double radius;
    private String name;
    private static final double pi = Math.PI; 

    //accessors

    public double getRad() {
        return radius;}
    public Point getCenter() {
        return center;}

    //constructors

    public Circle() {
        this.center = new Point();
        this.radius = 1;
        this.name = "No name given"; }
    public Circle(Point center) {
        this.center = center; 
        this.radius = 1;
        this.name = "No name given"; }
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
        this.name = "No name given"; }
    public Circle(Point center, double radius, String n) {
        this.center = center;
        this.radius = radius;
        this.name = n; }
    public Circle(double radius) {
        this.center = new Point(); 
        this.radius = radius;
        this.name = "No name given";}
    public Circle(Point center, Point point) {
        this.center = center;
        this.radius = center.distanceTo(point);
        this.name = "No name given"; }
    

    //methods 

    public double findDiam() {
        return radius * 2; }
    public double findCircum() {
        return (2 * radius * pi);  }
    public double area() {
        return (radius * radius * pi);  }
    public String toString() {
        return name + "- Center: ( " + center.getx() + ", " + center.gety() + " ) ... Radius: " + radius;  
     }

}