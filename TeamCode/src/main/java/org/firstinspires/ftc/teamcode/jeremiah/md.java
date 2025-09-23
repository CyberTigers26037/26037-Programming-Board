package org.firstinspires.ftc.teamcode.jeremiah;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

public class md extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        if (gamepad1.left_stick_y < 0) {
            telemetry.addData("Left Stick", gamepad1.left_stick_y);
        }

        telemetry.addData("Left stick y", gamepad1.left_stick_y);
    }
}