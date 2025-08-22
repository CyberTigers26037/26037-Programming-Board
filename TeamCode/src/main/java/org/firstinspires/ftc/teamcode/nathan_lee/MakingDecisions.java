package org.firstinspires.ftc.teamcode.nathan_lee;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Nathan MakingDecisions")
public class MakingDecisions extends OpMode {
    @Override
    public void init(){
    }
    @Override
    public void loop(){
        if (gamepad1.left_stick_y < -0.5) {
            telemetry.addData("Left Stick Y", "is negative and larger");
        }
        else if (gamepad1.left_stick_y < 0) {
            telemetry.addData("Left Stick Y", "is negative and smaller");
        }
        else if(gamepad1.left_stick_y > 0) {
            telemetry.addData("Left Stick Y", "is positive and smaller");
        }
        else {
            telemetry.addData("Left Stick Y", "is positive and larger");
        }
        telemetry.addData("Left Stick Y", gamepad1.left_stick_y);
    }

}
