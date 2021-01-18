public class ColorableTest {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        for (Shape shape : shapes) {
            if(shape instanceof Square){
                ((Colorable)shape).howtoColor();
            }else {
                System.out.println(shape);
            }
        }
    }
}
