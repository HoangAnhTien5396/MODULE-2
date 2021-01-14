public class Circle {
    double radius;
    String color ;
    public  Circle(){

    }
    public  Circle(double radius , String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return getColor() + getRadius();
    }
}
class CircleTest{
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(1.0,"red");
        System.out.println(circle);
    }
}