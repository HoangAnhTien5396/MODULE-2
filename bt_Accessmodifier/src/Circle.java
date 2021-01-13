public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle(){

    }
    Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
            return this.radius;
    }
    public double getArea(){
            return this.radius * this.radius * Math.PI;
    }
}
class TestCircle{
    public static void main(String[] args) {
        Circle circle = new Circle(1.0);
        double a = circle.getArea();
        double b = circle.getRadius();
        System.out.println(a);
        System.out.println(b);
    }
}
