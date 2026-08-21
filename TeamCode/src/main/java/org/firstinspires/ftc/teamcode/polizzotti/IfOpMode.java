package org.firstinspires.ftc.teamcode.polizzotti;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class IfOpMode extends OpMode {
    @Override
    public void init() {
    }

    public void loop() {
        // The `y` or `up and down` joystick.
        // Up is negative && Down is positive
        if (gamepad1.left_stick_y < 0) {
            telemetry.addData("Left stick", " is negative");
        }

        telemetry.addData("Left stick y", gamepad1.left_stick_y);
    }
}
