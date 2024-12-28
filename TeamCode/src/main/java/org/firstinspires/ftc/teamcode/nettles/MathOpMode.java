package org.firstinspires.ftc.teamcode.nettles;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Nettles MathOpMode")

public class MathOpMode extends OpMode {
    @Override
    public void init () {
    }
    @Override
    public void loop() {
        double speedForward = -gamepad1.left_stick_y/2.0;
        telemetry.addData("Left stick y" ,gamepad1.left_stick_y);
        telemetry.addData("speed forward" , speedForward);
        telemetry.addData("right stick y",gamepad1.right_stick_y );
        telemetry.addData("b button pressed" , gamepad1.b);
        telemetry.addData("differenceBetweenLeftAndRightJoystickY" , gamepad1.left_stick_y - gamepad1.right_stick_y);
        telemetry.addData("sum of Left and right triggers" , gamepad1.left_trigger + gamepad1.right_trigger);
    }
}
