public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = false;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }
    public boolean getOn() {
        return this.on;
    }
    public double getRadius() {
        return this.radius;
    }
    public String getColor() {
        return this.color;
    }
    public void setSpeed(int a) {
       this.speed = a;
    }
    public void setOn(boolean b) {
        this.on = b;
    }
    public void setRadius( int c) {
        this.radius = c;
    }
    public  void setColor(String d) {
        this.color = d;
    }
    public Fan() {

    }
    public String showInfo() {
        if (this.on) {
            return this.getColor() + this.getRadius() + this.getSpeed() + "Fan is on";
        }
        else {
            return this.getColor() + this.getRadius() + this.getSpeed() + "Fan is off";
        }
    }
}
class Fan1{
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.setOn(true);
        System.out.println(fan1.showInfo());
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.SLOW);
        fan2.setColor("blue");
        fan2.setRadius(5);
        fan2.setOn(false);
        System.out.println(fan2.showInfo());
    }
}

