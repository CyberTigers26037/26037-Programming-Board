package org.firstinspires.ftc.teamcode.ellis;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Ellis IfElseOpMode2")
public class IfElseOpMode2 extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        if (gamepad1.left_stick_y < -0.5) {
            telemetry.addData("Left stick", "is negative and large");
        }
   else if (gamepad1.left_stick_y < 0){
       telemetry.addData("left stick", "is negitive and small");
        }
   else if (gamepad1.left_stick_y < 0.5){
       telemetry.addData("left stick", "is positive and small");
   }
 telemetry.addData("left stick y", gamepad1.left_stick_y);
   }
}