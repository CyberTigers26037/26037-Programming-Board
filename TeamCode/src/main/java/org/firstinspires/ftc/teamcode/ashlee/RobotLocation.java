package org.firstinspires.ftc.teamcode.ashlee;


public class RobotLocation {
    double angle;
    double x;
    double y;

    public RobotLocation(double angle) {
        this.angle = angle;
    }

    public double getHeading() {
        double angle = this.angle;
        while(angle > 180) {
            angle -= 360;
        }
        while(angle < -180) {
            angle += 360;
        }
        return angle;
    }

    @Override
    public String toString() {
        return "Robot LocationRadians: angle (" + angle + ")";
    }

    public void turn(double angleChange) {
        angle += angleChange;
    }
    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getAngle() {
        return this.angle;
    }

    double getX() {
        return x;
    }

    void changeX(double change) {
        x = x + change;
    }

    void setX(double x) {
        this.x = x;
    }

    double getY() {
        return y;
    }

    void changeY(double change) {
        y = y + change;
    }

    void setY(double y) {
        this.y = y;
    }

}
