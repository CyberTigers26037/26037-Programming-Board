package org.firstinspires.ftc.teamcode.exaveer;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.exaveer.mechanisms.ProgrammingBoard4;

@TeleOp(name = "Exaveer MotorGamepadOpMode2")
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