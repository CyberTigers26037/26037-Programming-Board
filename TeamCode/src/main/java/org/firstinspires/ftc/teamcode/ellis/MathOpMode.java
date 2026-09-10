package org.firstinspires.ftc.teamcode.ellis;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name ="Ellis MathOpMode")
public class MathOpMode extends OpMode {

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
        telemetry.addData("b was pressed", gamepad1.b);
        telemetry.addData("difference between right and left y stick",gamepad1.left_stick_y - gamepad1.right_stick_y);
        telemetry.addData("sum of left and right trigger", gamepad1.left_trigger + gamepad1.right_trigger);
    }
}