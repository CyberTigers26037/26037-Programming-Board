package org.firstinspires.ftc.teamcode.tyler;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp (name = "tylermath")
public class MathOpMode extends OpMode {
    @Override
    public void init(){


    }
    @Override
    public void loop() {
        double speedForward = -gamepad1.left_stick_y / 2.0;
        telemetry.addData("Left stick y", gamepad1.left_stick_y);
        telemetry.addData("speed Forward", speedForward);

        double speedForward2 = -gamepad1.right_stick_y / 2.0;
        telemetry.addData("Right stick y", gamepad1.right_stick_y);
        telemetry.addData("speed Forward", speedForward2);

    }

}
