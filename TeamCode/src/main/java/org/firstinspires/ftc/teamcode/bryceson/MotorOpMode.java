package org.firstinspires.ftc.teamcode.bryceson;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.bryceson.Mechanisms.ProgrammingBoard3;

@TeleOp(name = "Bryceson MotorOpMode")
public class MotorOpMode extends OpMode {
    ProgrammingBoard3 board = new ProgrammingBoard3();
    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        board.setMotorSpeed(0.5);
    }
}
