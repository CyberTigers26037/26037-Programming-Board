package org.firstinspires.ftc.teamcode.Parker;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@SuppressWarnings("unused")
@TeleOp(name = "Parker IfElseOpMode")
public class IfElseOpMode extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        if(gamepad1.left_stick_y < 0) {
            telemetry.addData("Left Stick", "is negative");
        }
        else{
            telemetry.addData("Left Stick", "is positive");
        }

        telemetry.addData("Left Stick y", gamepad1.left_stick_y);
    }
}