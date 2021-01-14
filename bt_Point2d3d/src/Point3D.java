public class Point3D extends Point2D{
    float z = 0.0f;
    public Point3D(){

    }
    public Point3D(float x , float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        float [] xyz = {x,y,z};
        return xyz;
    }
    public void setXYZ(float x , float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return  "x : " + getX() + " y:" + getY() + "z :" + getZ()
                + super.toString();
    }
}
class Point3DTest{
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(1,3,4);
        System.out.println(point3D);
    }
}
