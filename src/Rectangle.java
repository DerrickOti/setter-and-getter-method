//import static com.sun.tools.classfile.Module_attribute.RequiresEntry.length;

public class Rectangle {
    private double length;
    private double width;
    private double area;
    private double perimeter;


    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    public void setLength(){
        this.length= length;
    }
    public double getLength(double length){
        return length;
    }
   public void setWidth(){
        this.width = width;
    }

    public double getWidth(double width){
        return width;
    }

    //math operations
    public void setArea(){
        this.area = area;
    }
    public double getArea(double area){
        return length*width;
    }
    public void setPerimeter(){
        this.perimeter = perimeter;
    }
    public double getPerimeter(double perimater){
        return 2*(length+width);
    }
}
