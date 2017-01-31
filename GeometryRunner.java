public class GeometryRunner {

    public static void main(String[] args) {

        Point a = new Point(18, 18, "A");
        Point b = new Point(8.1, 1.8, "B");


        //Point
        System.out.println("POINT");
        System.out.println(a);
        System.out.println(b); 
        System.out.println("Distance between (non): " + a.distanceTo(b) );
        System.out.println("Distance between (stat): " + Point.distanceTo(a,b));




        //Segment
        System.out.println("SEGMENT");
        LineSegment seg = new LineSegment(a, b); 
        System.out.println("Start: " + a);
        System.out.println("End: " + b);
        System.out.println("Name: " + seg.name());
        System.out.println("Length: " + LineSegment.length(a, b));


        //Circle
        System.out.println("CIRCLE");
        Circle circ = new Circle(a, b);
        System.out.println(circ);
    
        
    }
}