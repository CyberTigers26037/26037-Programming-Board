package org.firstinspires.ftc.teamcode.nettles;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import  com.qualcomm.robotcore.eventloop.opmode.OpMode;
@TeleOp(name = "Nettles IfOpMode")

public class IfOpMode extends OpMode {
@Override
    public void init() {
    }
@Override
    public void loop() {
    if (gamepad1.left_stick_y < 0) {
        telemetry.addData("Left stick", " is negative");
    }

    telemetry.addData("Left stick y", gamepad1.left_stick_y);
}
}
