package org.firstinspires.ftc.teamcode.nettles;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
// Coach Anthony, 8/2026, Commenting out for now because Mr. Nettles is not actively doing software.
// @TeleOp(name = "Nettles UseRobotLocationOpMode")

public class UseRobotLocationOpMode extends OpMode{
    RobotLocation robotLocation = new RobotLocation(0);
    @Override
    public void init() {
   robotLocation.setAngle(0);
    }

    @Override
    public void loop() {
if (gamepad1.a) {
    robotLocation.turn(0.1);
        }
else if (gamepad1.b){
    robotLocation.turn(-0.1);
        }
telemetry.addData("Location" , robotLocation);
telemetry.addData("Heading" , robotLocation.getHeading());
    }
}
