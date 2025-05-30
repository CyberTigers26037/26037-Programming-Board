package org.firstinspires.ftc.teamcode.caleb_ellison;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@SuppressWarnings("unused")
@TeleOp(name = "Caleb Gamepad")
public class GamepadOpMode extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        double speedForward = -gamepad1.left_stick_y / 2.0;
        telemetry.addData("Left stick y", gamepad1.left_stick_y);
        telemetry.addData("speed Forward", speedForward);
        double speedLeft = -gamepad1.right_stick_x / 2.0;
        telemetry.addData("Right stick y", gamepad1.right_stick_x);
        telemetry.addData("speed Left", speedLeft);
    }
}
