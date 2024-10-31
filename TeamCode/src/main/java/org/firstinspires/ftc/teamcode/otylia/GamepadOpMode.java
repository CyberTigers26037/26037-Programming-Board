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

        telemetry.addData("Right Stick X", gamepad1.right_stick_x);
        telemetry.addData("Right Stick Y", gamepad1.right_stick_x);
        telemetry.addData("B Button", gamepad1.b);

        double subGamepad = gamepad1.left_stick_y - gamepad1.right_stick_y;
        telemetry.addData("Difference between left & right stick", subGamepad);

        double sumGamepad = gamepad1.right_trigger + gamepad2.left_trigger;
        telemetry.addData("Sum of Gamepad Trigger", sumGamepad);

    }
}
