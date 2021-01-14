public class MovablePoint extends Point{
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;
    public MovablePoint(){

    }
    public MovablePoint (float xSpeed , float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x , float y , float xSpeed , float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public MovablePoint move(){
        x += xSpeed ;
        y += ySpeed;
        return this;
    }
    public float[] getSpeed(){
        float [] speed = {xSpeed , ySpeed};
        return speed;
    }
    public void setSpeed(float xSpeed , float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "x : " + getX() + "y :" + getY() + "xSpeed :" + getxSpeed() + "ySpeed" + getySpeed() +
                 super.toString();
    }
}
class MovablePointTest{
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(3,5,6,7);
        System.out.println(movablePoint);
    }
}