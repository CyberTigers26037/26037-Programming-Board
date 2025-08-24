package org.firstinspires.ftc.teamcode.nathan_lee;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Nathan Lee GamepadOpMode")
public class GamepadOpMode extends OpMode {
    @Override
    public void init() {

    }
    @Override
    public void loop() {
        telemetry.addData("Left Stick Y", gamepad1.left_stick_y);
        telemetry.addData("Left Stick X", gamepad1.left_stick_y);
        telemetry.addData("A button", gamepad1.a);

    }
}
