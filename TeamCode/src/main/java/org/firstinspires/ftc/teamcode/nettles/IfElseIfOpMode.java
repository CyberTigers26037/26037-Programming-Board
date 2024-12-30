package org.firstinspires.ftc.teamcode.nettles;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
@TeleOp(name = "Nettles IfElseIfOpMode")

public class IfElseIfOpMode extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        if (gamepad1.left_stick_y < -0.5) {
            telemetry.addData("Left stick", "is negative and large");
        } else if (gamepad1.left_stick_y < 0) {
            telemetry.addData("Left stick", "is negative and small");
        } else if (gamepad1.left_stick_y < 0.5) {
            telemetry.addData("Left stick", "is positive and small");
        } else {
            telemetry.addData("Left stick", "is positive and large");
        }
            telemetry.addData("Left stick y", gamepad1.left_stick_y);
        if (gamepad1.a) {
            telemetry.addData("left stick y turbo", gamepad1.left_stick_y * 1.0);
        }
        else {
            telemetry.addData("left stick y slow" , gamepad1.left_stick_y *0.5);
         telemetry.addData("Forward Speed" ,gamepad1.left_stick_y );

        }
        }
    }