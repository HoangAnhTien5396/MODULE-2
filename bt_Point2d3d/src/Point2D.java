public class Point2D {
    float x = 0.0f;
    float y = 0.0f;
    public Point2D(){

    }
    public Point2D(float x , float y){
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
    public  void setXY(float x , float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float [] xy = {this.x,this.y};
        return xy;
    }

    @Override
    public String toString() {
        return "x : " + getX() + " y:" + getY();
    }
}
class Point2DTest{
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(3,5);
        System.out.println(point2D);
    }
}