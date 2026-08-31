package org.firstinspires.ftc.teamcode.ellis;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="ellis IfElseOpMode")
public class IfElseOpMode extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        if(gamepad1.left_stick_y < 0){
            telemetry.addData("Left Stick", "is negitive");
        }
   else{
       telemetry.addData("left stick", "is positive");
        }

   telemetry.addData("Left stick y", gamepad1.left_stick_y);
    }
}