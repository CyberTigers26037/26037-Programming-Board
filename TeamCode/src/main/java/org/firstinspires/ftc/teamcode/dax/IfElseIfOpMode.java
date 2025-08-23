package org.firstinspires.ftc.teamcode.dax;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name ="DaxIfElseIfOpMode")
public class IfElseIfOpMode extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        if (gamepad1.left_stick_y < -0.5){
            telemetry.addData("Left Stick Y", "negative larger");
        }
        else if (gamepad1.left_stick_y < 0){
            telemetry.addData("Left Stick Y", "negative smaller");
        }
        else if (gamepad1.left_stick_y < 0.5){
            telemetry.addData("Left Stick Y", "positive smaller");
        }
        else{
            telemetry.addData("Left Stick Y", "positive larger");
        }
        telemetry.addData("Left Stick Y", gamepad1.left_stick_y);
    }
}