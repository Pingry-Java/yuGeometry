public class LineSegment{
    private Point start;
    private Point end;

    //keep track of how many segment instances exist 
    //generally good 
    private static int numSegments = 0;

    //data could get inconsistent if i did this 
    //private double length; 


    //default constructor because it has no rgs
    //need to override the default constructor 

    public LineSegment() {

       
        //could do this and it would work just fine

        //this.start = new Point(); 
        //this.end = new Point(); 

        this(new Point(),new Point()); 
    }


    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end; 
    }

    public LineSegment(Point start, Point end) {
        this.start = start; 
        this.end = end;  
        

        //remember to increment the counter of all line segments 
        numSegments++;
        
        }


    public static double length(Point start, Point end) {

        //rewrite this method to use methods from the point class
        return start.distanceTo(end);

    }

    public double slope() {

        double deltaY = start.gety() - end.gety();
        double deltaX = start.getx() - end.getx();

        return (deltaY/deltaX); 
    }

    public static int getNumSegments() {

        return numSegments; 
    }


    //name the line segment after points

    public String name() {
        return start.name + end.name;
    }

} 