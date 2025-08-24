package org.firstinspires.ftc.teamcode.ashlee;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Ashlee IfOpMode2")
public class IfOpMode2 extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        if (gamepad1.a) {
            telemetry.addData("A Button", "pressed");
        }
    }
}