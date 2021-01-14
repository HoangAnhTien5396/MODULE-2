public class Cylinder extends Circle{
    double height;
    public  Cylinder (){

    }
    public Cylinder (double radius , String color,double height){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double volume(){
        return radius * radius * this.height * Math.PI;
    }

    @Override
    public String toString() {
        return  getHeight() + "" + super.toString();
    }
}
class CylinderTest{
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(1.0,"green",3);
        System.out.println(cylinder);
    }
}