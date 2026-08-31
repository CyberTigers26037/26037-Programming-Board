package org.firstinspires.ftc.teamcode.Lakai;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp(name="Lakai GamepadOpMode")
public class LakaiGamepadOpMode extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        telemetry.addData("Right stick y", gamepad1.right_stick_y);
        telemetry.addData("Left stick Y", gamepad1.left_stick_y);
        telemetry.addData("Difference", gamepad1.right_stick_y-gamepad1.left_stick_y);


    }
}
