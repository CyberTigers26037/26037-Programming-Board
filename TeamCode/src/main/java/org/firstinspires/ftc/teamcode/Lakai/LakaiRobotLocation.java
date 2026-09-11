package org.firstinspires.ftc.teamcode.Lakai;



import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Lakai Robotlocation")
public class LakaiRobotLocation{
    double angle;

    public LakaiRobotLocation(double angle){
        this.angle = angle;
    }

    public double getHeading(){
        double angle = this.angle;
        while(angle > 180){
            angle-=360;
        }
        while(angle < -180){
            angle+=360;
        }
        return angle;
    }

    @Override
    public String toString(){
        return "RobotLocation: angle (" + angle +")";
    }

    public void turn(double angleChange){
        angle += angleChange;
    }
    public void setAngle(double angle){
        this.angle = angle;
    }
}