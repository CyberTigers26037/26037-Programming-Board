package org.firstinspires.ftc.teamcode.yuchen_lin;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class UseRobotLocationOpMode extends OpMode {
    RobotLocation robotLocation = new UseRobotLocationOpMode(0);

    @Override
    public void init() {
        robotLocation.setAngle(0)
    }
    @Overridepublic void loop() {
        if (gamepad1.a) {
            robotLocation.turn(0.1);
        } else if (gamepad1.b) {
            robotLocation.turn(-0.1)
        }
        telemetry.addData("Location", robotLocation);
        telemetry.addData("Heading", robotLocation.getHeading());
    }
}