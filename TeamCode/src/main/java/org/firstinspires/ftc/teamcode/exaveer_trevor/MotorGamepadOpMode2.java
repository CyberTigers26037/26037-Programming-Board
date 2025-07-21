package org.firstinspires.ftc.teamcode.exaveer_trevor;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.exaveer_trevor.ProgrammingBoard4;

@TeleOp(name = "Trevor & Exaveer MotorOpMode")
public class MotorGamepadOpMode2 extends OpMode {
    ProgrammingBoard4 board = new ProgrammingBoard4();
    @Override
    public void init(){
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        double motorSpeed = gamepad1.left_stick_y;

        board.setMotorSpeed(motorSpeed);

        telemetry.addData("Motor speed", motorSpeed);
        telemetry.addData("Motor rotations", board.getMotorRotations());
    }
}

// excerise 7.7