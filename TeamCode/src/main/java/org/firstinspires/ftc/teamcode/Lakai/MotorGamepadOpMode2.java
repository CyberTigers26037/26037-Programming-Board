package org.firstinspires.ftc.teamcode.Lakai;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Lakai MotorGamepadOpMode2")
public class MotorGamepadOpMode2 extends OpMode {
    ProgrammingBoard4 board = new ProgrammingBoard4();
    @Override
    public void init() {
        board.init(hardwareMap);

    }

    @Override
    public void loop() {

        double motorSpeed = -gamepad1.left_stick_y;

        board.setMotorSpeed(motorSpeed);

        telemetry.addData("Motor Speed",motorSpeed);
        telemetry.addData("MotorRotations", board.getMotorRotations());

    }
}
