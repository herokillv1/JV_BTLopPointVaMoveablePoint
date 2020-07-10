package moveablePoint;

import point.Point;


public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(){
    }

    public MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed,float ySpeed,float x, float y){
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

    public void setSpeed(float xSpeed , float ySpeed ){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] Speed = new float[2];
        Speed[0] = xSpeed ;
        Speed[1] = ySpeed ;
        return Speed;
    }

    @Override
    public String toString() {
        return "MoveablePoint { " +
                "xSpeed=" + xSpeed +
                ", ySpeed= " + ySpeed +
                '}' + "\n"+super.toString();
    }

    public MoveablePoint move(MoveablePoint moveablePoint) {
        moveablePoint.setX(moveablePoint.getX() + xSpeed);
        moveablePoint.setY(moveablePoint.getY() + ySpeed);
        return this;
    }


}
