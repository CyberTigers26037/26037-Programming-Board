package org.firstinspires.ftc.teamcode.ashlee;


public class RobotLocationRadians {
    double angleRadians;


    public RobotLocationRadians(double angleDegrees) {
        this.angleRadians = Math.toRadians(angleDegrees);
    }

    public double getHeading() {
        double angle = this.angleRadians;
        while(angle > Math.PI) {
            angle -= 2 * Math.PI;
        }
        while(angle < -Math.PI) {
            angle += 2 * Math.PI;
        }
        return Math.toDegrees(angle);
    }

    @Override
    public String toString() {
        return "Robot LocationRadians: angle (" + angleRadians + ")";
    }

    public void turn(double angleChangeDegrees) {
        angleRadians += Math.toRadians(angleChangeDegrees);
    }

    public void setAngle(double angleDegrees) {
        this.angleRadians = Math.toRadians(angleDegrees);
    }
}
