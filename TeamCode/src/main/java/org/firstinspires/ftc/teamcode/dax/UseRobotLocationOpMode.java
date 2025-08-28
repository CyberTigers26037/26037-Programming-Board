package org.firstinspires.ftc.teamcode.dax;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name ="DaxUseRobotLocationOpMode")
public class UseRobotLocationOpMode extends OpMode {
    RobotLocation robotLocation = new RobotLocation(0);

    @Override
    public void init() {
        robotLocation.setAngle(0);
    }

    @Override
    public void loop() {
        if(gamepad1.a){
            robotLocation.turn(0.1);
        }
        else if(gamepad1.b){
            robotLocation.turn(-0.1);
        }
        telemetry.addData("Location", robotLocation);
        telemetry.addData("Heading", robotLocation.getHeading());
        telemetry.addData("Angle", robotLocation.getAngle());
        telemetry.addData("X Axis", robotLocation.getX());
        telemetry.addData("Y Axis", robotLocation.getY());
        if(gamepad1.right_stick_x < 0){
            robotLocation.changeX(-0.1);
        }
        if(gamepad1.right_stick_x > 0){
            robotLocation.changeX(0.1);
        }
        if(gamepad1.right_stick_y > 0){
            robotLocation.changeY(-0.1);
        }
        if(gamepad1.right_stick_y < 0){
            robotLocation.changeY(0.1);
        }
    }
}