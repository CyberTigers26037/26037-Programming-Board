package org.firstinspires.ftc.teamcode.bryceson;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

// Coach Anthony, 8/2026, Commenting out for now because Bryceson is not actively doing software.
// @TeleOp(name ="Bryceson IfOpMode")
public class IfOpMode extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        if(gamepad1.left_stick_y < 0) {
            telemetry.addData("Left stick", " is negative");
        }

        telemetry.addData("left stick y", gamepad1.left_stick_y);
    }
}
