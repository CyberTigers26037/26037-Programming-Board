package org.firstinspires.ftc.teamcode.ellis;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name ="Ellis HelloWorld")
public class HelloWorld extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        double LeftspeedForward = -gamepad1.left_stick_y / 2.0;
        telemetry.addData("left stick y", gamepad1.left_stick_y);
        telemetry.addData("speed Forward", LeftspeedForward);
        double RightspeedForward = -gamepad1.right_stick_y / 2.0;
        telemetry.addData("right stick y", gamepad1.right_stick_y);
        telemetry.addData("speed Forward", RightspeedForward);
    }
}