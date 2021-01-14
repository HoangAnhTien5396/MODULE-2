import java.util.Scanner;

public class Triangle extends Shape{
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;
    public  Triangle(){

    }
    public Triangle( double side1 , double side2 , double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public  Triangle ( String color , double side1 , double side2 , double side3){
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getArea(){
        double p = (this.side1 + this.side2 + this.side3)/2;
        return Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
    }
    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "dien tich" + getArea() + "chu vi" + getPerimeter() + " mau sac" + color;
    }
}
class TriangleTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        triangle = new Triangle("red", 20,20,20);
        System.out.println(triangle);
        triangle = new Triangle();
        System.out.println("nhap side 1");
        triangle.side1 = scanner.nextDouble();
        System.out.println("nhap side 1");
        triangle.side2 = scanner.nextDouble();
        System.out.println("nhap side 3");
        triangle.side3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("nhap color");
        triangle.color = scanner.nextLine();

    }
}
