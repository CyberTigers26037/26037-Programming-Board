package org.firstinspires.ftc.teamcode.nathan_lee;


import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Nathan Lee MathOpMode")
public class MathOpMode extends OpMode {
    @Override
    public void init(){
    }

    public void loop(){
        double speedForward = -gamepad1.left_stick_y / 2.0;

        telemetry.addData("Left Stick Y", gamepad1.left_stick_y);
        telemetry.addData("speedForward", speedForward);
    }

}
