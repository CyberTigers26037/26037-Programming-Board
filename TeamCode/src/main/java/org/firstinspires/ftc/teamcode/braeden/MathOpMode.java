package org.firstinspires.ftc.teamcode.braeden;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Braeden MathOpMode")
public class MathOpMode extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        double speedForward = -gamepad1.right_stick_y / 10.0;
        telemetry.addData("Right stick y", gamepad1.right_stick_y);
        telemetry.addData("speed Forward", speedForward);
        telemetry.addData("Left stick y", gamepad1.left_stick_y);
        telemetry.addData("Y Stick Difference", gamepad1.left_stick_y - gamepad1.right_stick_y );
        telemetry.addData("Left Triggers", gamepad1.left_trigger);
        telemetry.addData("Right Trigger", gamepad1.right_trigger);
        telemetry.addData("Trigger Sum", gamepad1.right_trigger + gamepad1.left_trigger);
    }
}