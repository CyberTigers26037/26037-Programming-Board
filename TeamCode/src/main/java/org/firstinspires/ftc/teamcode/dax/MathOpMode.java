package org.firstinspires.ftc.teamcode.dax;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name ="Dax MathOpMode")
public class MathOpMode extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        double speedForward = -gamepad1.left_stick_y / 2.0;
        telemetry.addData("Left stick y", gamepad1.left_stick_y);
        telemetry.addData("speed Forward", speedForward);
        telemetry.addData("Right stick y", gamepad1.right_stick_y);
        telemetry.addData("B button", gamepad1.b);
        telemetry.addData("Y stick difference", gamepad1.left_stick_y - gamepad1.right_stick_y);
        telemetry.addData("Stick Sum", gamepad1.left_trigger + gamepad1.right_trigger);
    }
}