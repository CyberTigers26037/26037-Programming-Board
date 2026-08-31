package org.firstinspires.ftc.teamcode.dax;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

// Coach Anthony, 8/2026, Commenting out for now because Dax is not actively doing software.
// @TeleOp(name = "Dax GamepadOpMode")
public class GamepadOpMode extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        telemetry.addData("Left stick x", gamepad1.left_stick_x);
        telemetry.addData("Left stick x", gamepad1.left_stick_y);
        telemetry.addData("A button", gamepad1.a);
    }
}