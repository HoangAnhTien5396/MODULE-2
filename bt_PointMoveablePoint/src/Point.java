public class Point {
    float x = 0.0f;
    float y = 0.0f;
    public Point(){

    }
    public Point(float x , float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float [] xy = {this.x , this.y};
        return  xy;
    }
    public void setXY(float x , float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x :"
                + getX()
                + " y :"
                + getY();

    }
}
class PointTest{
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point = new Point(3,5);
        System.out.println(point);
    }
}