package ss6_inheritance.ex2;

public class Point3D extends Point2D{
    private float z;
    Point3D(){super();}
    Point3D(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ() {
        float[] tmp = new float[3];
        tmp[0] = super.getXY()[0];
        tmp[1] = super.getXY()[1];
        tmp[2] = z;
        return tmp;
    }
    public void setXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.setZ(z);
    }
    @Override
    public String toString() {
        return "("+super.getX()+","+super.getY()+","+this.getZ()+")";
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,3);
        System.out.println(point2D.toString());
        Point3D point3D = new Point3D(2,3,4);
        System.out.println(point3D.toString());
    }
}
