package Create_obj;

public class RectangleTest {
    private double length;
    private double breadth;
    
    public RectangleTest(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public double getArea() {
        return length * breadth;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public static void main(String[] args) {
        RectangleTest rect = new RectangleTest(20.0, 40.0);
        double area = rect.getArea();
        System.out.println("Area = " + area);
        
        rect.setLength(30.0);
        rect.setBreadth(30.0);
        double newArea = rect.getArea();
        System.out.println("New area = " + newArea);
    }
}