import java.util.Arrays;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Rectangle();
        System.out.println("dien tich");
        System.out.println(Arrays.toString(shapes));
        for ( Shape shape : shapes){
            double a = (double) (Math.round(Math.random() *((100-1)+ 1 ) * 100 ) / 100 );
            shape.resizeable(a);
        }
        System.out.println("dien tich tang");
        System.out.println(Arrays.toString(shapes));
    }
}
