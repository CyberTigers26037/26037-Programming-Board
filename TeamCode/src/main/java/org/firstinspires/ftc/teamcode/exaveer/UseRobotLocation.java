package org.firstinspires.ftc.teamcode.exaveer;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.david_tang_and_nathan_lee.RobotLocation;


@TeleOp(name = "Exaveer UseRobotLocation")
public class UseRobotLocation extends OpMode {
    RobotLocation robotLocation = new RobotLocation(0);


    @Override
    public void init(){
        robotLocation.setAngle(0);
    }

    @Override
    public void loop(){
        if(gamepad1.a){
            robotLocation.turn(0.1);
        }
        else if(gamepad1.b){
            robotLocation.turn(-0.1);
        }
        telemetry.addData("Location", robotLocation);
        telemetry.addData("Heading", robotLocation.getHeading());
    }
}



//public double getHeading(){
//    double angle = this.angle;
//    while(angle  > 180){
//        angle -= 360;
//    }
//    while(angle < -180){
//        angle += 360;
//    }
//    return angle;
//}
//
//@Override
//public String toString(){
//    return "RobotLocation: angle (" + angle + ")";
//}
//
//public void turn(double angleChange){
//    angle += angleChange;
//}
//public void setAngle(double angle){
//    this.angle = angle;
//}
//
//@Override
//public void init() {
//    robotLocation.setAngle(0)
//}