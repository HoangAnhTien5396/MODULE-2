 public class Rectangle extends  Shape{
    private double width  = 1.0;
    private double height = 1.0;
    public Rectangle(){

    }
    public Rectangle(double side, double v, String color, boolean filled){

    }
    public Rectangle(double width , double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(String color , boolean filled , double width , double height){
        super(color,filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return  (this.width + this.height) * 2 ;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "
                + getWidth()
                + "and height"
                + getHeight()
                + "Which is subclass of"
                + super.toString();
    }
}
class RectangleTest{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3,5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle("orange",true,2.5,3.8);
        System.out.println(rectangle);
    }
}
