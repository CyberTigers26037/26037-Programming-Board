package org.firstinspires.ftc.teamcode.braeden;


public class RobotLocationsradians {
    double angleRaidians;


    public RobotLocationsradians(double angleDegrees) {
        this.angleRaidians = Math.toRadians(angleDegrees);
    }

    public double getHeading() {
        double angle = this.angleRaidians;
        while (angle > Math.PI) {
            angle += 2 * Math.PI;
        }
        return Math.toDegrees(angle);
    }

    @Override
    public String toString() {
        return "RobotLocationsRaidians: angle (" + angleRaidians+ ")";
    }

    public void turn(double angleChangeDegrees) {
        angleRaidians += Math.toRadians(angleChangeDegrees);
    }

    public void setAngle(double angleDegrees) {
        this.angleRaidians = Math.toRadians(angleDegrees);
    }
}
