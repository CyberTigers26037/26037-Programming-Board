package org.firstinspires.ftc.teamcode.bryceson;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name ="Bryceson_IfElseOpMode")
public class IfElseOpMode extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        if(gamepad1.left_stick_y < 0) {
            telemetry.addData("Left stick", " is negative");
        }
        else{
            telemetry.addData("Left Stick", " is positive");
        }

        telemetry.addData("left stick y", gamepad1.left_stick_y);
    }
}