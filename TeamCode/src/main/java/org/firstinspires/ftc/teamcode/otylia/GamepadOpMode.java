package org.firstinspires.ftc.teamcode.otylia;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Otylia GamepadOpMode")
public class GamepadOpMode extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        telemetry.addData("Left Stick x", gamepad1.left_stick_x);
    }
}
