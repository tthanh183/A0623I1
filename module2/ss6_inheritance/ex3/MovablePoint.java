package ss6_inheritance.ex3;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    MovablePoint(){}
    MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MovablePoint(float x, float y,float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        return new float[] {xSpeed, ySpeed};
    }
    public void setxSpeed(float xSpeed, float ySpeed) {
        this.setXSpeed(xSpeed);
        this.setYSpeed(ySpeed);
    }

    @Override
    public String toString() {
        return super.toString() + ",speed=("+this.getXSpeed()+","+this.getYSpeed()+")";
    }
    public MovablePoint move() {
        super.setX(super.getX() +this.getXSpeed());
        super.setY(super.getY() + this.getYSpeed());
        return this;
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1,1,2,3);
        System.out.println(movablePoint.toString());
        movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
