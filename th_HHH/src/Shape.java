public class Shape {
    private String color  = "green";
    private boolean filled = true;
    public Shape(){

    }
    public Shape(String color , boolean filled ){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color1){
        this.color = color1 ;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean filled1){
        this.filled = filled1;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}
class ShapeTest{
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
