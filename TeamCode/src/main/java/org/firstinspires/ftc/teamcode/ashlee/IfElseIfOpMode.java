package org.firstinspires.ftc.teamcode.ashlee;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Ashlee If Else If OpMode")
public class IfElseIfOpMode extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        if (gamepad1.left_stick_y < -0.5) {
            telemetry.addData("Left stick", " is negative and large");
        }
        else if (gamepad1.left_stick_y < 0) {
            telemetry.addData("Left stick", " is negative and small");
        }
        else if (gamepad1.left_stick_y < 0.5) {
            telemetry.addData("Left stick", " is positive and small");
        }
        else {
            telemetry.addData("Left stick", " is positive and large");
        }
        if (gamepad1.a) {
            telemetry.addData("Left stick y", gamepad1.left_stick_x);
        }
        else {
            telemetry.addData("Left stick y", gamepad1.left_stick_y);
        }


        telemetry.addData("Forward Speed", gamepad1.a ? gamepad1.left_stick_y : gamepad1.left_stick_y*0.5);



    }
}
